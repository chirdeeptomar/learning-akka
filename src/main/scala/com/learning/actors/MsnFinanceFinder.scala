package com.learning.actors

import akka.actor.{Actor, Props}

/**
  * Created by chirdeep on 13/07/2016.
  */
class MsnFinanceFinder extends Actor{
  override def receive: Receive = {
    case ticker:String => {
      MsnFinanceFinder.fetch(ticker)
    }

    case _ => println("received unknown message")
  }
}

object MsnFinanceFinder {
  def props = Props(new MsnFinanceFinder)
  def fetch(stock: String) = {
    println(s"Fetching stock price from Msn $stock")
  }
}
