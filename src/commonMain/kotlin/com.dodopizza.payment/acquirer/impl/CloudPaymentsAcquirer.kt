package com.dodopizza.payment.acquirer.impl

import com.dodopizza.payment.acquirer.Acquirer
import com.dodopizza.payment.acquirer.crypt.CardEncryptor
import com.dodopizza.payment.card.Card

/**
 * @author kamil
 * @date 2019-03-06.
 */
class CloudPaymentsAcquirer(cardEncryptor: CardEncryptor) : Acquirer(Acquirer.CLOUDPAYMENTS, cardEncryptor) {
  override fun canSave(card: Card): Boolean {
    return true
  }
}