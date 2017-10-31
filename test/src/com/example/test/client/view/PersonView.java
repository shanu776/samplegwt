package com.example.test.client.view;

import com.example.test.client.presenters.Display;
import com.example.test.client.presenters.PersonPresenter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class PersonView extends Composite implements Display  {

	private static PersonViewUiBinder uiBinder = GWT.create(PersonViewUiBinder.class);

	private PersonPresenter presenter;
	interface PersonViewUiBinder extends UiBinder<Widget, PersonView> {
	}

	public PersonView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Button button;
	@UiField
	Label name;

	public PersonView(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		button.setText(firstName);
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		if(presenter!=null){
			presenter.showFullName();
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		name.setText("");
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name.setText(name);
	}

	@Override
	public void setPresenter(PersonPresenter personPresenter) {
		// TODO Auto-generated method stub
		this.presenter = personPresenter;
	}
	
}
