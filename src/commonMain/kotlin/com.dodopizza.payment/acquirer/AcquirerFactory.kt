package com.dodopizza.payment.acquirer

import com.dodopizza.payment.acquirer.Acquirer.Companion.BE_PAID
import com.dodopizza.payment.acquirer.Acquirer.Companion.CLOUDPAYMENTS
import com.dodopizza.payment.acquirer.crypt.CardEncryptor
import com.dodopizza.payment.acquirer.impl.BePaidAcquirer

/**
 * @author kamil
 * @date 2019-03-06.
 */
interface AcquirerFactory {
  fun createAcquirer(acquirerCode: String): Acquirer
}

class AcquirerFactoryImpl(private val acquirerEncryptors: Map<String, CardEncryptor>) : AcquirerFactory {
  override fun createAcquirer(acquirerCode: String): Acquirer = when (acquirerCode) {
    BE_PAID -> {
      BePaidAcquirer(acquirerEncryptors[BE_PAID] ?: throw IllegalArgumentException(
          "Encryptor for $acquirerCode acquirer not found"))
    }

    CLOUDPAYMENTS -> {
      BePaidAcquirer(acquirerEncryptors[BE_PAID] ?: throw IllegalArgumentException(
          "Encryptor for $acquirerCode acquirer not found"))
    }

    else -> throw IllegalArgumentException("Acquirer with code $acquirerCode not found")
  }
}