package com.letscode.msauthorization.dto.authorizationRequest

import com.letscode.msauthorization.entity.Authorization

class AuthorizationRequest (
    val clienteId : 0L,
    val token : String,
    val tipoOperacao : String
        ){
    fun convert(authorization : Authorization) : AuthorizationRequest{
        return null;
    }

}