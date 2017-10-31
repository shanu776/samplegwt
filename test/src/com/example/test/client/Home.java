package com.example.test.client;

import com.example.test.client.presenters.Display;
import com.example.test.client.presenters.PersonPresenter;
import com.example.test.client.view.PersonView;
import com.example.test.shared.Person;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {
	
	@Override
	public void onModuleLoad() {
		Person person = new Person();
		Display view = new PersonView();
		PersonPresenter personPresenter = new PersonPresenter(person, view);
		personPresenter.go(RootPanel.get());
	} 

}
