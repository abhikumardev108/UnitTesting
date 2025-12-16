package com.example.testingapp.unit_test

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import kotlin.test.assertEquals


class UsernameValidatorTest {

    val usernameValidator = UsernameValidator()

    @Test
    fun `validate username with a valid username, returns false` () {
        val isValid = usernameValidator.checkValid("new_username")

        assertThat(isValid).isFalse()
    }


    @Test
    fun `validate username with an empty username, return false`() {
        val isValid1 = usernameValidator.checkValid("")

        assertThat(isValid1).isFalse()
    }


//    @Test
//    fun checkValidate() {
//        val isValid2 = UsernameValidator().invoke("")
//        assertEquals(false, isValid2)
//    }


    @Test
    fun checkSum() {
        val res = usernameValidator.calculateSumOfTwo(3, 7)

        assertEquals(10, res)
    }


    @Test
    fun checkStringReverse() {
        val res = usernameValidator.reverseString("tinu")

        assertEquals("unit", res)
    }

}