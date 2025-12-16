package com.example.testingapp.unit_test

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class PasswordValidatorTest {

    val passwordValidator = PasswordValidator()


    @Test
    fun `password length greater than or equal to 3, return true`() {
        val res = passwordValidator.isPasswordValidOrNot(password = "asasdfghjkr")

        assertThat(res).isTrue()
    }

    @Test
    fun `password size is not empty, return true` () {
        val res = passwordValidator.isPasswordValidOrNot(password = "")

        assertThat(res).isFalse()
    }

    @Test
    fun `password starts with s, return true`() {
        val res = passwordValidator.isPasswordValidOrNot(password = "shweta")

        assertThat(res).isTrue()
    }

    @Test
    fun `password not starts with s, return false`() {
        val res = passwordValidator.isPasswordValidOrNot(password = "mona")

        assertThat(res).isTrue()
    }
}