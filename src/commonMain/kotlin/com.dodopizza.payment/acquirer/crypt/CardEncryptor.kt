package com.dodopizza.payment.acquirer.crypt

import com.dodopizza.payment.card.Card

/**
 * @author kamil
 * @date 2019-03-06.
 */
interface CardEncryptor {
  fun encrypt(card: Card, publicKey: String): String
}