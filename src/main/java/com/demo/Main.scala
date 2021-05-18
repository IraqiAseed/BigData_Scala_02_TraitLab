package com.demo

object Main {
  def main(args: Array[String]): Unit = {

    QuoterAggregator.addQuote(RandomQuoter)
    QuoterAggregator.addQuote(new ShakespearQuoter())
    QuoterAggregator.addQuote(new ShakespearQuoter("this is the question !!!"))
    QuoterAggregator.addQuote(MessageQuoter("A method that is executed only for its side effects is known as a procedure"))
    QuoterAggregator.printAllMessages()

  }
}
