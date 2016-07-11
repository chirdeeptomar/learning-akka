package com.learning.actors

import akka.actor.{Actor, Props}

/**
  * Created by Chirdeep on 11/07/2016.
  */

object StockPriceActor {
  def props = Props(new StockPriceActor)
}

class StockPriceActor extends Actor {

  override def receive: Receive = {
    case ticker:String => {
      println(s"Fetching price for: $ticker")
    }

    case _ => println("received unknown message")
  }
}
