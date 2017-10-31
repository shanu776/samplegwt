package com.example.test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.datepicker.client.DatePicker;

public class Home implements EntryPoint {
	
	DatePicker dp = new DatePicker();
	@Override
	public void onModuleLoad() {
		Command cmd = new Command() {
			
			@Override
			public void execute() {
				// TODO Auto-generated method stub
				Window.alert("working");
			}
		};
		MenuBar menu = new MenuBar();
		MenuBar menuFile = new MenuBar(true);
		menuFile.addItem("open",cmd);
		menuFile.addItem("save",cmd);
		menuFile.addItem("saveAs",cmd);
		menuFile.addItem("close",cmd);
		menu.addItem("File",menuFile);
		menu.addItem("Tool",cmd);
		menu.addItem("Option",cmd);
		
		RootPanel.get().add(menu);
		
	} 

}
