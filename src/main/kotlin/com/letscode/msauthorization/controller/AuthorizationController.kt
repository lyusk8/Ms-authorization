package com.letscode.msauthorization.controller

import com.letscode.msauthorization.dto.authorizationRequest.AuthorizationRequest
import com.letscode.msauthorization.dto.authorizationResponse.AuthorizationResponse
import com.letscode.msauthorization.service.AuthorizationService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/authorization")
class AuthorizationController(
    val authorizationService : AuthorizationService
) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun teste(@RequestBody cliente : AuthorizationRequest) : AuthorizationResponse {
       return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun criarAutorizacao(@RequestBody authorization : AuthorizationRequest) : AuthorizationResponse{
       return null;
    }

    @PostMapping("/permissions")
    @ResponseStatus(HttpStatus.CREATED)
    fun criarPermissoes(@RequestBody permission : AuthorizationRequest) : AuthorizationResponse{
        return null;
    }
}