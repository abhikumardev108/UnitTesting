package com.example.testingapp.unit_test


class ConfirmPasswordValidator {

    fun checkPasswordMatch(password: String, confirmPassword: String): Boolean {
        return password == confirmPassword
    }
}