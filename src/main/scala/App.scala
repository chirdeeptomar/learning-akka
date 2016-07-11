import akka.actor.ActorSystem
import com.learning.actors.StockPriceActor

/**
  * Created by Chirdeep on 11/07/2016.
  */
object App extends App{
  val actorSystem = ActorSystem("ActorSystem")
  val actor = actorSystem.actorOf(StockPriceActor.props, "com.learning.actors.StockPriceActor")


  actor ! "msft"

}
