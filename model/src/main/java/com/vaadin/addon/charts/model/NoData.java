package com.vaadin.addon.charts.model;

import com.vaadin.addon.charts.model.AbstractConfigurationObject;
import com.vaadin.addon.charts.model.style.Style;
public class NoData extends AbstractConfigurationObject {

	private static final long serialVersionUID = 1L;
	private Object attr;
	private Object position;
	private Style style;

	public NoData() {
	}

	public Object getAttr() {
		return attr;
	}

	public void setAttr(Object attr) {
		this.attr = attr;
	}

	public Object getPosition() {
		return position;
	}

	public void setPosition(Object position) {
		this.position = position;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}
}