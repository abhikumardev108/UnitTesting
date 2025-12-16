package com.example.testingapp.instrumented_unit_test

import androidx.test.platform.app.InstrumentationRegistry
import org.junit.After
import org.junit.Before
import org.junit.Test
import com.google.common.truth.Truth.assertThat



class EmailFormatValidatorTest {

    private lateinit var emailFormatValidator: EmailFormatValidator


    @Before
    fun setUp() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        emailFormatValidator = EmailFormatValidator(context)
    }


    @After
    fun tearDown() {

    }


    @Test
    fun validateEmailWithValidEmail_returnsTrue() {
        val isValid = emailFormatValidator.checkEmailFormat(email = "abhi@gmail.com")

        assertThat(isValid).isTrue()
    }


    @Test
    fun validateEmailWithInValidEmail_returnsFalse() {
        val isInvalid = emailFormatValidator.checkEmailFormat(email = "choirmaster")

        assertThat(isInvalid).isFalse()
    }


    @Test
    fun validateEmailWithEmptyEmail_returnsFalse() {
        val isEmpty = emailFormatValidator.checkEmailFormat(email = "")

        assertThat(isEmpty).isFalse()
    }

}