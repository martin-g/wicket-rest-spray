package com.mycompany;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage
;

class HomePage(parameters: PageParameters)
  extends WebPage(parameters) {

		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

}
