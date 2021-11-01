package com.letscode.msauthorization.service

import com.letscode.msauthorization.dto.authorizationRequest.AuthorizationRequest
import com.letscode.msauthorization.dto.authorizationResponse.AuthorizationResponse
import com.letscode.msauthorization.entity.Authorization
import com.letscode.msauthorization.repository.AuthorizationRepository
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
@Component
class AuthorizationService(
    val authorizationRepository: AuthorizationRepository
) {
    val operacoes: List<String> = listOf("aberturaConta", "boleto", "transferencia", "fechamentoConta", "saldo", "listaContatos")
    val write: List<String> = listOf("aberturaConta", "boleto", "transferencia", "fechementoConta")

    fun autorizacao(requisicao: AuthorizationRequest): AuthorizationResponse{
        if(validaToken(requisicao.expiresIn) && validaOperacao(requisicao.tipoOperacao)) {
            authorizationRepository.save(
                Authorization(
                    requisicao.clienteId,
                    requisicao.tipoOperacao,
                    LocalDateTime.now()
                )
            )
            if (write.contains(requisicao.tipoOperacao)) {
                return AuthorizationResponse(permission = listOf("WRITE"))
            } else {
                return AuthorizationResponse(permission = listOf("READ"))
            }
        } else {
            throw Exception("Token inválido")
        }
    }

    fun validaToken(validade: Long): Boolean{
        val tempo = System.currentTimeMillis()
        return tempo < (validade + System.currentTimeMillis())
    }

    fun validaOperacao(operacao: String): Boolean{
        return operacoes.contains(operacao)
    }
}