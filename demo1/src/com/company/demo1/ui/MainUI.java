
package com.company.demo1.ui;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.CustomComponent;
import com.xdev.ui.XdevButton;
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
		this.button = new XdevButton();
		this.button2 = new XdevButton();
		this.navigator = new XdevNavigator(this, this);
	
		this.button.setCaption("Button");
		this.button2.setCaption("Button");
		this.navigator.addView("", MainView.class);
	
		this.gridLayout.setColumns(3);
		this.gridLayout.setRows(3);
		this.button.setSizeUndefined();
		this.gridLayout.addComponent(this.button, 0, 0);
		this.button2.setSizeUndefined();
		this.gridLayout.addComponent(this.button2, 1, 1);
		CustomComponent gridLayout_hSpacer = new CustomComponent();
		gridLayout_hSpacer.setSizeFull();
		this.gridLayout.addComponent(gridLayout_hSpacer, 2, 0, 2, 1);
		this.gridLayout.setColumnExpandRatio(2, 1.0F);
		CustomComponent gridLayout_vSpacer = new CustomComponent();
		gridLayout_vSpacer.setSizeFull();
		this.gridLayout.addComponent(gridLayout_vSpacer, 0, 2, 1, 2);
		this.gridLayout.setRowExpandRatio(2, 1.0F);
		this.gridLayout.setSizeFull();
		this.setContent(this.gridLayout);
		this.setSizeFull();
	} // </generated-code>

	// <generated-code name="variables">
	private XdevGridLayout gridLayout;
	private XdevNavigator navigator;
	private XdevButton button, button2; // </generated-code>
	
}