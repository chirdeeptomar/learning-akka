import akka.actor.ActorSystem
import com.learning.actors.StockPriceRouter

/**
  * Created by Chirdeep on 11/07/2016.
  */
object App extends App{
  val actorSystem = ActorSystem("ActorSystem")
  val actor = actorSystem.actorOf(StockPriceRouter.props, "com.learning.actors.StockPriceRouter")


  actor ! "msft"

}
