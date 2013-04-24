package com.mycompany

import org.apache.wicket.request.resource.ResourceReference
import org.apache.wicket.protocol.http.WebApplication

/**
 *
 */
class SprayResourceReference(app: WebApplication)
  extends ResourceReference(app.getClass, "spray") {

  val getResource = new SprayResource(app)
}
