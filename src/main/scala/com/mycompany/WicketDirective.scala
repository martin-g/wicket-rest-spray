package com.mycompany

import spray.routing._
import shapeless.HNil

/**
 * A directive that should export the Application, Session and RequestCycle (but how ?!)
 */
class WicketDirective
  extends Directive0 {

  def happly(f: (HNil) => _root_.spray.routing.Route) = {
    Console.err.println("1. ")
    try {
      f(HNil)
    } finally {
      Console.err.println("2. ")
    }
  }
}
