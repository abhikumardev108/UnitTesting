package com.example.testingapp.unit_test

class PasswordValidator {

    fun isPasswordValidOrNot(password: String): Boolean {

        if(password.length >= 3) {
            return true
        }

        if(password.isNotEmpty()) {
            return true
        }

        if(password.startsWith("s")) {
            return true
        }

        return false
    }
}