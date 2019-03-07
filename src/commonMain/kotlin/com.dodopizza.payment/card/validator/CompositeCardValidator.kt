package com.dodopizza.payment.card.validator

import com.dodopizza.payment.card.Card

/**
 * @author kamil
 * @date 2019-03-06.
 */
class CompositeCardValidator(
  private val cardValidators: Set<CardValidator> = setOf(CardNumberValidator())
) : CardValidator {
  override fun isValid(card: Card): Boolean = cardValidators.all { cardValidator ->
    cardValidator.isValid(card)
  }
}