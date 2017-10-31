package com.example.test.client.presenters;

import com.example.test.shared.Person;
import com.google.gwt.user.client.ui.Panel;

public class PersonPresenter implements Presenter{
	
	Person pereson;
	Display view;	
		
	public PersonPresenter(Person pereson, Display view) {
		this.pereson = pereson;
		this.view = view;
		bind();
	}

	@Override
	public void bind() {
		// TODO Auto-generated method stub
		view.setPresenter(this);
		view.clear();
		view.setName(pereson.getFirst_name());
	}

	@Override
	public void go(Panel panel) {
		// TODO Auto-generated method stub
		panel.add(view.asWidget());
	}
	
	public void showFullName(){
		view.setName(pereson.getFullName());
	}

}
