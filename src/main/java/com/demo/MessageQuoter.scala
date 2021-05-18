package com.demo

case class MessageQuoter(quote: String) extends Quoter {

  override def printMessage(): Unit = println(quote)

}
