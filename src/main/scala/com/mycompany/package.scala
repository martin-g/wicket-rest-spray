package com

import org.apache.wicket.request.{Response, Request}
import javax.servlet.http.{HttpServletResponse, HttpServletRequest}

/**
 *
 */
package object mycompany {

  implicit def wicketRequest2HttpRequest(request: Request): HttpServletRequest = {
    request.getContainerRequest.asInstanceOf[HttpServletRequest]
  }

  implicit def wicketResponse2HttpResponse(response: Response): HttpServletResponse = {
    response.getContainerResponse.asInstanceOf[HttpServletResponse]
  }
}
