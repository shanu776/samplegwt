package com.example.test.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class LittelForm extends Composite {

	private static LittelFormUiBinder uiBinder = GWT.create(LittelFormUiBinder.class);

	interface LittelFormUiBinder extends UiBinder<Widget, LittelForm> {
	}

	public LittelForm() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
