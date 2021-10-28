package com.letscode.msauthorization.entity

import java.time.LocalDateTime

class Atividade (
    val clienteId : Long,
    val tipo : Enum<Operacoes> ,
    val data : LocalDateTime
        )