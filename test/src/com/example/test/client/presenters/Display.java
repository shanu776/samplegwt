package com.example.test.client.presenters;

import com.google.gwt.user.client.ui.Widget;

public interface Display {

	public void clear();
	public void setName(String name);
	public Widget asWidget();
	public void setPresenter(PersonPresenter personPresenter);
}
