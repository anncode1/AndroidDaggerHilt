package com.example.hilttest.domain.model

/**
 * Created by anahi.salgado on 27/07/2020
 */
data class Contact(
    val name: String,
    val phone: String
) {
    override fun toString(): String {
        return "Name: ${name}, Phone: ${phone}\n"
    }
}
