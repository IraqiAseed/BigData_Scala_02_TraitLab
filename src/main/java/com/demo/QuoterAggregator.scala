package com.demo

object QuoterAggregator {

  var quotes: List[Quoter] = Nil

  def addQuote(q: Quoter): Unit = {
    quotes = quotes :+ q
  }

  def printAllMessages(): Unit = quotes.foreach(_.printMessage())


}
