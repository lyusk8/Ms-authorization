package com.letscode.msauthorization.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name ="autorizacao")
 class Authorization{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private val authorizationId : Long = 0
    private var clientId : Long
    private var operacao : String
    private var data: LocalDateTime

     constructor(clientId: Long, operacao: String, data: LocalDateTime){
         this.clientId = clientId
         this.operacao = operacao
         this.data = data
     }
 }