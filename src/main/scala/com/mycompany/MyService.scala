package com.mycompany

import spray.routing.{HttpServiceActor, HttpService, Directive0}


// we don't implement our route structure directly in the service actor because
// we want to be able to test it independently, without having to spin up an actor
class MyServiceActor extends HttpServiceActor with MyService {

  // this actor only runs our route, but you could add
  // other things here, like request stream processing
  // or timeout handling
  def receive =
      runRoute(route)
}


// this trait defines our service behavior independently from the service actor
trait MyService extends HttpService {

  def route =
    wicket {
      get {
        complete {
          <hello>Say hello to Wicket Resource backed 2 by Spray.io</hello>
        }
      }
    }

  val wicket: Directive0 = new WicketDirective
}