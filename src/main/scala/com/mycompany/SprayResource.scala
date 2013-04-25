package com.mycompany

import spray.servlet.Servlet30ConnectorServlet
import org.apache.wicket.request.resource.IResource
import org.apache.wicket.request.resource.IResource.Attributes
import org.apache.wicket.protocol.http.WebApplication

/**
 *
 */
class SprayResource(app: WebApplication)
  extends Servlet30ConnectorServlet
  with IResource {

  init()

  def respond(attributes: Attributes) {
    service(attributes.getRequest, attributes.getResponse)
  }

  override def getServletContext = {
    app.getServletContext
  }
}
