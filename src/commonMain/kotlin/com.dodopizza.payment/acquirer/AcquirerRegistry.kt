package com.dodopizza.payment.acquirer

/**
 * @author kamil
 * @date 2019-03-05.
 */
class AcquirerRegistry(private val acquirerFactory: AcquirerFactory) {
  private val acquirers : MutableSet<Acquirer> = mutableSetOf()

  private fun getOrCreate(acquirerCode: String): Acquirer = acquirers.find { acquirer -> acquirer.code == acquirerCode }
          ?: acquirerFactory.createAcquirer(acquirerCode).also { acquirer -> acquirers.add(acquirer) }


  fun getAcquirer(acquirerCode: String): Acquirer = getOrCreate(acquirerCode)

}