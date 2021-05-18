package com.demo

class ShakespearQuoter(quote: String = "to be or not to be") extends Quoter {

  override def printMessage(): Unit = println(quote)

}
