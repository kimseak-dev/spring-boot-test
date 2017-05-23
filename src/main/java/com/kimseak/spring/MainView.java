package com.kimseak.spring;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path="/ui")
@Title("This is the title")
@Theme("valo")
public class MainView extends UI {

	@Override
	protected void init(VaadinRequest request) {
		

		
		HorizontalLayout horizontalLayout = new HorizontalLayout();
		Label labelHTML = new Label("<h1>Vaddin Label HTLM<h1>", ContentMode.HTML);
		Label labelText = new Label("Vaddin Label Text", ContentMode.TEXT);
		Label labelPreformatatted = new Label("Vaddin Label \n preformatted", ContentMode.PREFORMATTED);

		
		
		horizontalLayout.addComponent(labelHTML);
		horizontalLayout.addComponent(labelText);
		horizontalLayout.addComponent(labelPreformatatted);
		
		setContent(horizontalLayout);
	}

}
