package com.vaadin.addon.charts.model;

import com.vaadin.addon.charts.model.AbstractConfigurationObject;
public class Hover extends AbstractConfigurationObject {

	private static final long serialVersionUID = 1L;
	private Boolean enabled;
	private Object fillColor;
	private Object lineColor;
	private Number lineWidth;
	private Number lineWidthPlus;
	private Number radius;
	private Number radiusPlus;

	public Hover() {
	}

	public Hover(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Object getFillColor() {
		return fillColor;
	}

	public void setFillColor(Object fillColor) {
		this.fillColor = fillColor;
	}

	public Object getLineColor() {
		return lineColor;
	}

	public void setLineColor(Object lineColor) {
		this.lineColor = lineColor;
	}

	public Number getLineWidth() {
		return lineWidth;
	}

	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
	}

	public Number getLineWidthPlus() {
		return lineWidthPlus;
	}

	public void setLineWidthPlus(Number lineWidthPlus) {
		this.lineWidthPlus = lineWidthPlus;
	}

	public Number getRadius() {
		return radius;
	}

	public void setRadius(Number radius) {
		this.radius = radius;
	}

	public Number getRadiusPlus() {
		return radiusPlus;
	}

	public void setRadiusPlus(Number radiusPlus) {
		this.radiusPlus = radiusPlus;
	}
}