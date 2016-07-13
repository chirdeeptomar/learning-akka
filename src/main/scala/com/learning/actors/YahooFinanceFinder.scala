package com.learning.actors

import akka.actor.Actor.Receive
import akka.actor.{Actor, Props}

/**
  * Created by chirdeep on 11/07/2016.
  */

object YahooFinanceFinder {
  def props = Props(new YahooFinanceFinder)
  def fetch(stock: String) = {
    print(s"Fetching stock price from Yahoo $stock")
  }
}

class YahooFinanceFinder extends Actor{
  override def receive: Receive = {
    case ticker:String => {
      YahooFinanceFinder.fetch(ticker)
    }

    case _ => println("received unknown message")
  }
}
