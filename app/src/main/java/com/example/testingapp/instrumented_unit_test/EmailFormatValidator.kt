package com.example.testingapp.instrumented_unit_test

import android.content.Context
import android.util.Patterns


class EmailFormatValidator(private val context: Context) {


    fun checkEmailFormat(email: String) : Boolean {

        if(email.isEmpty()) {
            return false
        }

        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }


}