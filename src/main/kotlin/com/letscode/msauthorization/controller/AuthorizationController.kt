package com.letscode.msauthorization.controller

import com.letscode.msauthorization.dto.authorizationRequest.AuthorizationRequest
import com.letscode.msauthorization.dto.authorizationResponse.AuthorizationResponse
import com.letscode.msauthorization.service.AuthorizationService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping
class AuthorizationController(
    val authorizationService : AuthorizationService
) {

    @GetMapping("/authorization")
    @ResponseStatus(HttpStatus.CREATED)
    fun criarEvento(@RequestBody authorization: AuthorizationRequest) : AuthorizationResponse{
        return authorizationService.autorizacao(authorization)
    }
}