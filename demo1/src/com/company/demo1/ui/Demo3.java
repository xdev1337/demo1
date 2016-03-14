package com.company.demo1.ui;

import com.company.demo1.dal.CustomerDemographicsDAO;
import com.company.demo1.entities.CustomerDemographics;
import com.company.demo1.entities.Customers;
import com.company.demo1.entities.OrderDetails;
import com.company.demo1.entities.Orders;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.xdev.dal.DAOs;
import com.xdev.ui.XdevBorderLayout;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevFieldGroup;
import com.xdev.ui.XdevGridLayout;
import com.xdev.ui.XdevHorizontalLayout;
import com.xdev.ui.XdevLabel;
import com.xdev.ui.XdevTabSheet;
import com.xdev.ui.XdevTextField;
import com.xdev.ui.XdevView;
import com.xdev.ui.entitycomponent.listselect.XdevTwinColSelect;
import com.xdev.ui.entitycomponent.table.XdevTable;
import com.xdev.ui.util.wizard.XDEV;

public class Demo3 extends XdevView {

	/**
	 * 
	 */
	public Demo3() {
		super();
		this.initUI();
	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #cmdNew}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate
	 */
	private void cmdNew_buttonClick(Button.ClickEvent event) {
		this.fieldGroup.setItemDataSource(new Customers());
	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #cmdReset}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate
	 */
	private void cmdReset_buttonClick(Button.ClickEvent event) {
		this.fieldGroup.discard();
		
		
		OrderDetails od = new OrderDetails();
		
		Orders o = new Orders();
		
		// Variante ohne Methode
		o.getOrderDetails().add(od);
		od.setOrders(o);
		
		// Verainte mit Methode
		o.addOrderDatail(od);
		
		
		// Variante ohne Methode
		o.getOrderDetails().remove(od);
		od.setOrders(null);
		
		// Variante mit Methode
		o.removeOrderDatail(od);
		
		
	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #cmdSave}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate
	 */
	private void cmdSave_buttonClick(Button.ClickEvent event) {
		this.fieldGroup.save();
	}

	/**
	 * Event handler delegate method for the {@link XdevButton}
	 * {@link #cmdSaveAndNew}.
	 *
	 * @see Button.ClickListener#buttonClick(Button.ClickEvent)
	 * @eventHandlerDelegate
	 */
	private void cmdSaveAndNew_buttonClick(Button.ClickEvent event) {
		this.fieldGroup.save();
		this.fieldGroup.setItemDataSource(new Customers());
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated
	 * by the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.gridLayout = new XdevGridLayout();
		this.table = new XdevTable<>();
		this.form = new XdevBorderLayout();
		this.tabSheet = new XdevTabSheet();
		this.gridLayout2 = new XdevGridLayout();
		this.label = new XdevLabel();
		this.textField = new XdevTextField();
		this.label2 = new XdevLabel();
		this.textField2 = new XdevTextField();
		this.label3 = new XdevLabel();
		this.textField3 = new XdevTextField();
		this.label4 = new XdevLabel();
		this.textField4 = new XdevTextField();
		this.gridLayout3 = new XdevGridLayout();
		this.label5 = new XdevLabel();
		this.textField5 = new XdevTextField();
		this.label6 = new XdevLabel();
		this.textField6 = new XdevTextField();
		this.label7 = new XdevLabel();
		this.textField7 = new XdevTextField();
		this.label8 = new XdevLabel();
		this.textField8 = new XdevTextField();
		this.label9 = new XdevLabel();
		this.textField9 = new XdevTextField();
		this.label10 = new XdevLabel();
		this.textField10 = new XdevTextField();
		this.label11 = new XdevLabel();
		this.twinColSelect = new XdevTwinColSelect<>();
		this.horizontalLayout = new XdevHorizontalLayout();
		this.cmdNew = new XdevButton();
		this.cmdReset = new XdevButton();
		this.cmdSave = new XdevButton();
		this.cmdSaveAndNew = new XdevButton();
		this.fieldGroup = new XdevFieldGroup<>(Customers.class);
	
		this.table.setContainerDataSource(Customers.class);
		this.table.setVisibleColumns("customerId", "companyName", "contactName", "contactTitle", "address");
		this.tabSheet.addStyleName("framed");
		this.label.setValue("Company");
		this.textField.setTabIndex(1);
		this.label2.setValue("Name");
		this.textField2.setTabIndex(2);
		this.label3.setValue("Title");
		this.textField3.setTabIndex(3);
		this.label4.setValue("Address");
		this.textField4.setTabIndex(4);
		this.label5.setValue("city");
		this.textField5.setTabIndex(5);
		this.label6.setValue("region");
		this.textField6.setTabIndex(6);
		this.label7.setValue("postalCode");
		this.textField7.setTabIndex(7);
		this.label8.setValue("country");
		this.textField8.setTabIndex(8);
		this.label9.setValue("phone");
		this.textField9.setTabIndex(9);
		this.label10.setValue("fax");
		this.textField10.setTabIndex(10);
		this.label11.setValue("customerDemographics");
		this.twinColSelect.setTabIndex(11);
		this.twinColSelect.setContainerDataSource(CustomerDemographics.class,
				DAOs.get(CustomerDemographicsDAO.class).findAll());
		this.twinColSelect.setItemCaptionPropertyId("customerTypeId");
		this.horizontalLayout.setMargin(new MarginInfo(false));
		this.cmdNew.setCaption("New");
		this.cmdNew.setTabIndex(12);
		this.cmdReset.setCaption("Reset");
		this.cmdReset.setTabIndex(13);
		this.cmdSave.setCaption("Save");
		this.cmdSave.setTabIndex(14);
		this.cmdSaveAndNew.setCaption("Save + New");
		this.cmdSaveAndNew.setTabIndex(15);
		this.fieldGroup.bind(this.textField, "companyName");
		this.fieldGroup.bind(this.textField2, "contactName");
		this.fieldGroup.bind(this.textField3, "contactTitle");
		this.fieldGroup.bind(this.textField4, "address");
		this.fieldGroup.bind(this.textField5, "city");
		this.fieldGroup.bind(this.textField6, "region");
		this.fieldGroup.bind(this.textField7, "postalCode");
		this.fieldGroup.bind(this.textField8, "country");
		this.fieldGroup.bind(this.textField9, "phone");
		this.fieldGroup.bind(this.textField10, "fax");
		this.fieldGroup.bind(this.twinColSelect, "customerDemographics");
	
		XDEV.bindForm(table, fieldGroup);
	
		this.gridLayout2.setColumns(2);
		this.gridLayout2.setRows(5);
		this.label.setSizeUndefined();
		this.gridLayout2.addComponent(this.label, 0, 0);
		this.textField.setWidth(100, Unit.PERCENTAGE);
		this.textField.setHeight(-1, Unit.PIXELS);
		this.gridLayout2.addComponent(this.textField, 1, 0);
		this.label2.setSizeUndefined();
		this.gridLayout2.addComponent(this.label2, 0, 1);
		this.textField2.setWidth(100, Unit.PERCENTAGE);
		this.textField2.setHeight(-1, Unit.PIXELS);
		this.gridLayout2.addComponent(this.textField2, 1, 1);
		this.label3.setSizeUndefined();
		this.gridLayout2.addComponent(this.label3, 0, 2);
		this.textField3.setWidth(100, Unit.PERCENTAGE);
		this.textField3.setHeight(-1, Unit.PIXELS);
		this.gridLayout2.addComponent(this.textField3, 1, 2);
		this.label4.setSizeUndefined();
		this.gridLayout2.addComponent(this.label4, 0, 3);
		this.textField4.setWidth(100, Unit.PERCENTAGE);
		this.textField4.setHeight(-1, Unit.PIXELS);
		this.gridLayout2.addComponent(this.textField4, 1, 3);
		this.gridLayout2.setColumnExpandRatio(1, 1.0F);
		CustomComponent gridLayout2_vSpacer = new CustomComponent();
		gridLayout2_vSpacer.setSizeFull();
		this.gridLayout2.addComponent(gridLayout2_vSpacer, 0, 4, 1, 4);
		this.gridLayout2.setRowExpandRatio(4, 1.0F);
		this.gridLayout3.setColumns(2);
		this.gridLayout3.setRows(8);
		this.label5.setSizeUndefined();
		this.gridLayout3.addComponent(this.label5, 0, 0);
		this.textField5.setWidth(100, Unit.PERCENTAGE);
		this.textField5.setHeight(-1, Unit.PIXELS);
		this.gridLayout3.addComponent(this.textField5, 1, 0);
		this.label6.setSizeUndefined();
		this.gridLayout3.addComponent(this.label6, 0, 1);
		this.textField6.setWidth(100, Unit.PERCENTAGE);
		this.textField6.setHeight(-1, Unit.PIXELS);
		this.gridLayout3.addComponent(this.textField6, 1, 1);
		this.label7.setSizeUndefined();
		this.gridLayout3.addComponent(this.label7, 0, 2);
		this.textField7.setWidth(100, Unit.PERCENTAGE);
		this.textField7.setHeight(-1, Unit.PIXELS);
		this.gridLayout3.addComponent(this.textField7, 1, 2);
		this.label8.setSizeUndefined();
		this.gridLayout3.addComponent(this.label8, 0, 3);
		this.textField8.setWidth(100, Unit.PERCENTAGE);
		this.textField8.setHeight(-1, Unit.PIXELS);
		this.gridLayout3.addComponent(this.textField8, 1, 3);
		this.label9.setSizeUndefined();
		this.gridLayout3.addComponent(this.label9, 0, 4);
		this.textField9.setWidth(100, Unit.PERCENTAGE);
		this.textField9.setHeight(-1, Unit.PIXELS);
		this.gridLayout3.addComponent(this.textField9, 1, 4);
		this.label10.setSizeUndefined();
		this.gridLayout3.addComponent(this.label10, 0, 5);
		this.textField10.setWidth(100, Unit.PERCENTAGE);
		this.textField10.setHeight(-1, Unit.PIXELS);
		this.gridLayout3.addComponent(this.textField10, 1, 5);
		this.label11.setSizeUndefined();
		this.gridLayout3.addComponent(this.label11, 0, 6);
		this.twinColSelect.setWidth(100, Unit.PERCENTAGE);
		this.twinColSelect.setHeight(-1, Unit.PIXELS);
		this.gridLayout3.addComponent(this.twinColSelect, 1, 6);
		this.gridLayout3.setColumnExpandRatio(1, 1.0F);
		CustomComponent gridLayout3_vSpacer = new CustomComponent();
		gridLayout3_vSpacer.setSizeFull();
		this.gridLayout3.addComponent(gridLayout3_vSpacer, 0, 7, 1, 7);
		this.gridLayout3.setRowExpandRatio(7, 1.0F);
		this.gridLayout2.setSizeFull();
		this.tabSheet.addTab(this.gridLayout2, "Allgemein", null);
		this.gridLayout3.setSizeFull();
		this.tabSheet.addTab(this.gridLayout3, "Erweitert", null);
		this.tabSheet.setSelectedTab(this.gridLayout3);
		this.cmdNew.setSizeUndefined();
		this.horizontalLayout.addComponent(this.cmdNew);
		this.horizontalLayout.setComponentAlignment(this.cmdNew, Alignment.MIDDLE_LEFT);
		this.cmdReset.setSizeUndefined();
		this.horizontalLayout.addComponent(this.cmdReset);
		this.horizontalLayout.setComponentAlignment(this.cmdReset, Alignment.MIDDLE_LEFT);
		this.cmdSave.setSizeUndefined();
		this.horizontalLayout.addComponent(this.cmdSave);
		this.horizontalLayout.setComponentAlignment(this.cmdSave, Alignment.MIDDLE_LEFT);
		this.cmdSaveAndNew.setSizeUndefined();
		this.horizontalLayout.addComponent(this.cmdSaveAndNew);
		this.horizontalLayout.setComponentAlignment(this.cmdSaveAndNew, Alignment.MIDDLE_LEFT);
		CustomComponent horizontalLayout_spacer = new CustomComponent();
		horizontalLayout_spacer.setSizeFull();
		this.horizontalLayout.addComponent(horizontalLayout_spacer);
		this.horizontalLayout.setExpandRatio(horizontalLayout_spacer, 1.0F);
		form.addComponent(tabSheet, XdevBorderLayout.Constraint.CENTER);
		form.addComponent(horizontalLayout, XdevBorderLayout.Constraint.SOUTH);
		this.gridLayout.setColumns(2);
		this.gridLayout.setRows(2);
		this.table.setWidth(100, Unit.PERCENTAGE);
		this.table.setHeight(-1, Unit.PIXELS);
		this.gridLayout.addComponent(this.table, 0, 0);
		this.form.setSizeFull();
		this.gridLayout.addComponent(this.form, 0, 1);
		this.gridLayout.setRowExpandRatio(1, 0.1F);
		CustomComponent gridLayout_hSpacer = new CustomComponent();
		gridLayout_hSpacer.setSizeFull();
		this.gridLayout.addComponent(gridLayout_hSpacer, 1, 0, 1, 1);
		this.gridLayout.setColumnExpandRatio(1, 1.0F);
		this.gridLayout.setSizeFull();
		this.setContent(this.gridLayout);
		this.setSizeFull();
	
		cmdNew.addClickListener(event -> this.cmdNew_buttonClick(event));
		cmdReset.addClickListener(event -> this.cmdReset_buttonClick(event));
		cmdSave.addClickListener(event -> this.cmdSave_buttonClick(event));
		cmdSaveAndNew.addClickListener(event -> this.cmdSaveAndNew_buttonClick(event));
	} // </generated-code>

	// <generated-code name="variables">
	private XdevLabel label, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11;
	private XdevHorizontalLayout horizontalLayout;
	private XdevFieldGroup<Customers> fieldGroup;
	private XdevTable<Customers> table;
	private XdevTextField textField, textField2, textField3, textField4, textField5, textField6, textField7,
			textField8, textField9, textField10;
	private XdevTwinColSelect<CustomerDemographics> twinColSelect;
	private XdevButton cmdNew, cmdReset, cmdSave, cmdSaveAndNew;
	private XdevGridLayout gridLayout, gridLayout2, gridLayout3;
	private XdevBorderLayout form;
	private XdevTabSheet tabSheet; // </generated-code>


}
