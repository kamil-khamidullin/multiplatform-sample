package com.dodopizza.payment.card.validator

import com.dodopizza.payment.card.Card

/**
 * @author kamil
 * @date 2019-03-05.
 */
interface CardValidator {
    fun isValid(card: Card): Boolean
}