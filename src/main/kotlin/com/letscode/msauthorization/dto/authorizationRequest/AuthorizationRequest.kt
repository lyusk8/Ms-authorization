package com.letscode.msauthorization.dto.authorizationRequest

data class AuthorizationRequest (
    val clienteId: Long,
    val expiresIn: Long,
    val tipoOperacao: String
    )