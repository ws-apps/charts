package com.vaadin.addon.charts.model;

import com.vaadin.addon.charts.model.AbstractConfigurationObject;
public class Buttons extends AbstractConfigurationObject {

	private static final long serialVersionUID = 1L;
	private ContextButton contextButton;

	public Buttons() {
	}

	public ContextButton getContextButton() {
		return contextButton;
	}

	public void setContextButton(ContextButton contextButton) {
		this.contextButton = contextButton;
	}
}