package com.learning.actors

import akka.actor.{Actor, Props}

/**
  * Created by Chirdeep on 11/07/2016.
  */

object StockPriceRouter {
  def props = Props(new StockPriceRouter)
}

class StockPriceRouter extends Actor {

  override def receive: Receive = {
    case ticker:String => {
      println(s"Firing requests to service apis for: $ticker")
      val yahooFinder = context.actorOf(Props[YahooFinanceFinder], "YahooFinanceFinder")
      yahooFinder ! ticker
      println(s"Fired requests to third party service apis")
    }

    case _ => println("received unknown message")
  }
}