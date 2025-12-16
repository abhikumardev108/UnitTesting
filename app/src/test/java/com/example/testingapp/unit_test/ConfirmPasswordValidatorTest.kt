package com.example.testingapp.unit_test

import kotlin.test.Test
import com.google.common.truth.Truth.assertThat


class ConfirmPasswordValidatorTest {

    val confirmPasswordValidator = ConfirmPasswordValidator()

    @Test
    fun `confirm that both password are same, return true` () {
        val res = confirmPasswordValidator.checkPasswordMatch(password = "mona", confirmPassword = "mona")

        assertThat(res).isTrue()
    }


    @Test
    fun `confirm both password are not same, return false` () {
        val res = confirmPasswordValidator.checkPasswordMatch(password = "mona", confirmPassword = "monika")

        assertThat(res).isFalse()
    }

}