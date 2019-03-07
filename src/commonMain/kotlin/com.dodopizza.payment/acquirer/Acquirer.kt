package com.dodopizza.payment.acquirer

import com.dodopizza.payment.acquirer.crypt.CardEncryptor
import com.dodopizza.payment.card.Card

/**
 * @author kamil
 * @date 2019-03-05.
 */
abstract class Acquirer(val code: String, private val cardEncryptor: CardEncryptor) {

  abstract fun canSave(card: Card): Boolean

  fun createCryptogram(card: Card, publicKey: String): String {
    return cardEncryptor.encrypt(card, publicKey)
  }

  companion object {
    const val BE_PAID = "BePaid"
    const val CLOUDPAYMENTS = "CloudPayments"
  }
}
