package com.example.test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {
	Button btn;
	
	@Override
	public void onModuleLoad() {
		btn = new Button("click");
		RootPanel.get().add(btn);
		
		btn.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Window.alert("button clicked!");
			}
		});
	} 

}
