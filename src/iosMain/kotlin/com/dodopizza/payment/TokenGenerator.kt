package com.dodopizza.payment

import com.dodopizza.payment.acquirer.crypt.CardEncryptor
import com.dodopizza.payment.card.Card
//import platform.Security.SecKeyEncrypt
//import platform.Security.SecKeyGetBlockSize

/**
 * @author kamil
 * @date 2019-03-07.
 */
class TokenGenerator: CardEncryptor {

    override fun encrypt(card: Card, publicKey: String): String {
//        val cipherBufferSize = SecKeyGetBlockSize(publicKey)
//
//
//        val a = SecKeyEncrypt()

        return ""
    }
}

