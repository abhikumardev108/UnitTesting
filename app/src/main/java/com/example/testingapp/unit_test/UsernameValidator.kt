package com.example.testingapp.unit_test


class UsernameValidator {

    private val users = listOf("Abhishek", "Monika", "Mona", "Golu", "Ankit")


    fun checkValid(username: String): Boolean {

    //    operator fun invoke(username: String): Boolean {
        if (username.isEmpty()) {
            return false
        }

        if (username.contains(" ")) {
            return false
        }

        if (!users.contains(username)) {
            return false
        }

        return true
    }


    fun calculateSumOfTwo(a: Int, b: Int): Int {
        return a + b
    }

    fun reverseString(str: String): String {
        return str.reversed()
    }


}