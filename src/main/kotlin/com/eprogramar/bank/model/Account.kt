package com.eprogramar.bank.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "accounts")
data class Account(
        @Id
        var id: String? = null,
        val name: String,
        val document: String,
        val phone: String
)
