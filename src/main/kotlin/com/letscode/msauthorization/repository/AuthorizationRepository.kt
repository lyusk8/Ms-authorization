package com.letscode.msauthorization.repository

import com.letscode.msauthorization.entity.Authorization
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorizationRepository: JpaRepository<Authorization, Long>