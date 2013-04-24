package com.mycompany

import org.apache.wicket.protocol.http.WebApplication

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 */
class WicketApplication
  extends WebApplication {

	override def getHomePage = classOf[HomePage]

	override def init() {
		super.init()

		mountResource("res", new SprayResourceReference(this))
	}
}
