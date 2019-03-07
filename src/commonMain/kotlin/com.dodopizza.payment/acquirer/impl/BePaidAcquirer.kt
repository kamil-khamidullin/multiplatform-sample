package com.dodopizza.payment.acquirer.impl

import com.dodopizza.payment.acquirer.Acquirer
import com.dodopizza.payment.acquirer.crypt.CardEncryptor
import com.dodopizza.payment.card.Card

/**
 * @author kamil
 * @date 2019-03-06.
 */
class BePaidAcquirer(cardEncryptor: CardEncryptor) : Acquirer(Acquirer.BE_PAID, cardEncryptor) {
  override fun canSave(card: Card): Boolean {
    return true
  }
}