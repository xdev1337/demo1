
package com.company.demo1.ui;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevUI;
import com.xdev.ui.navigation.XdevNavigator;

@Push
@Theme("demo1")
public class MainUI extends XdevUI {
	public MainUI() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void init(VaadinRequest request) {
		this.initUI();
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated
	 * by the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.button = new XdevButton();
		this.navigator = new XdevNavigator(this, this);
	
		this.button.setCaption("Button");
		this.navigator.addView("", MainView.class);
	
		this.button.setSizeUndefined();
		this.setContent(this.button);
		this.setSizeFull();
	} // </generated-code>

	// <generated-code name="variables">
	private XdevNavigator navigator;
	private XdevButton button; // </generated-code>
	
}