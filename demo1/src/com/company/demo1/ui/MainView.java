
package com.company.demo1.ui;

import com.company.demo1.entities.Employees;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevGridLayout;
import com.xdev.ui.XdevView;
import com.xdev.ui.entitycomponent.table.XdevTable;

public class MainView extends XdevView {

	/**
	 * 
	 */
	public MainView() {
		super();
		this.initUI();
	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #button2}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate
	 */
	private void button2_buttonClick(Button.ClickEvent event) {
		Notification.show("XDEV", "Hallo Richard!", Type.ERROR_MESSAGE);
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
		this.button3 = new XdevButton();
		this.table = new XdevTable<>();
	
		this.button2.setCaption("Cool");
		this.button3.setCaption("Button");
		this.table.setContainerDataSource(Employees.class);
		this.table.setVisibleColumns("employeeId");
	
		this.gridLayout.setColumns(4);
		this.gridLayout.setRows(4);
		this.button.setSizeUndefined();
		this.gridLayout.addComponent(this.button, 0, 0);
		this.button2.setSizeUndefined();
		this.gridLayout.addComponent(this.button2, 1, 1);
		this.button3.setSizeUndefined();
		this.gridLayout.addComponent(this.button3, 2, 2);
		this.table.setSizeFull();
		this.gridLayout.addComponent(this.table, 3, 3);
		this.gridLayout.setColumnExpandRatio(3, 1.0F);
		this.gridLayout.setRowExpandRatio(3, 1.0F);
		this.gridLayout.setSizeFull();
		this.setContent(this.gridLayout);
		this.setSizeFull();
	
		button2.addClickListener(event -> this.button2_buttonClick(event));
	} // </generated-code>

	// <generated-code name="variables">
	private XdevButton button, button2, button3;
	private XdevTable<Employees> table;
	private XdevGridLayout gridLayout; // </generated-code>


}
