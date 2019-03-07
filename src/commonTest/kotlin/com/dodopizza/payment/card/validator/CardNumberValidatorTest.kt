//package com.dodopizza.payment.card.validator
//
//import com.dodopizza.payment.card.Card
//import kotlin.test.Test
//import kotlin.test.assertFalse
//import kotlin.test.assertTrue
//
///**
// * @author kamil
// * @date 2019-03-05.
// */
//class CardNumberValidatorTest {
//
//    @Test
//    fun isValidIfValidCardNumber() {
//        val cardNumberValidator = CardNumberValidator()
//        val card = Card("4916525832902341", "12/21", "123")
//
//        assertTrue(cardNumberValidator.isValid(card))
//    }
//
//    @Test
//    fun isValidIfInValidCardNumber() {
//        val cardNumberValidator = CardNumberValidator()
//        val card = Card("4916525832902342", "12/21", "123")
//
//        assertFalse(cardNumberValidator.isValid(card))
//    }
//}