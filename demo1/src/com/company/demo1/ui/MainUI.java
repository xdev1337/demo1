
package com.company.demo1.ui;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.xdev.ui.XdevGridLayout;
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
		this.gridLayout = new XdevGridLayout();
		this.navigator = new XdevNavigator(this, this);
	
		this.navigator.addView("", MainView.class);
	
		this.gridLayout.setSizeFull();
		this.setContent(this.gridLayout);
		this.setSizeFull();
	} // </generated-code>


	// <generated-code name="variables">
	private XdevGridLayout gridLayout;
	private XdevNavigator navigator; // </generated-code>
	
}