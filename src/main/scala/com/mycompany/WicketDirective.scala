package com.mycompany

import spray.routing._
import shapeless.HNil

/**
 *
 */
class WicketDirective
  extends Directive0 {

  def happly(f: (HNil) => _root_.spray.routing.Route) = {
    Console.err.println("1. ")
    val route: Route = f(HNil)
    Console.err.println("2. ")
    route
  }
}
