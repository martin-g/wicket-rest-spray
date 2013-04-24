package com.mycompany

import spray.servlet.Servlet30ConnectorServlet
import org.apache.wicket.request.resource.IResource
import org.apache.wicket.request.resource.IResource.Attributes
import org.apache.wicket.protocol.http.WebApplication
import javax.servlet.http.{HttpServletResponse, HttpServletRequest}

/**
 *
 */
class SprayResource(app: WebApplication)
  extends Servlet30ConnectorServlet
  with IResource {

  init()

  def respond(attributes: Attributes) {
    val request: HttpServletRequest = attributes.getRequest.getContainerRequest.asInstanceOf[HttpServletRequest]
    val response: HttpServletResponse = attributes.getResponse.getContainerResponse.asInstanceOf[HttpServletResponse]
    service(request, response)
  }

  override def getServletContext = {
    app.getServletContext
  }
}
