package com.demo

import scala.util.Random

object RandomQuoter extends Quoter {

  val quotes: List[String] = List(
    "Just keep swimming", "I wish I knew how to quit you", "What's the most you ever lost on a coin toss?",
    "I drink your milkshake" , "Why so serious?",
    "A million dollars isn't cool. You know what's cool? A billion dollars")
  override def printMessage(): Unit = println(quotes(Random.nextInt(quotes.length)))
}
