package com.dodopizza.payment.card.validator

import com.dodopizza.payment.card.Card

/**
 * @author kamil
 * @date 2019-03-05.
 */
class CardNumberValidator : CardValidator {

  override fun isValid(card: Card): Boolean {
    val number = card.number
    var checksum = 0

    for (i in number.length - 1 downTo 0 step 2) {
      checksum += number[i] - '0'
    }
    for (i in number.length - 2 downTo 0 step 2) {
      val n: Int = (number[i] - '0') * 2
      checksum += if (n > 9) n - 9 else n
    }

    return checksum % 10 == 0
  }
}