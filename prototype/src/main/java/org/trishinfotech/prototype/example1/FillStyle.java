package org.trishinfotech.prototype.example1;

import org.trishinfotech.prototype.Color;
import org.trishinfotech.prototype.FillPattern;

public class FillStyle {

	protected Color fillColor;
	protected FillPattern fillPattern;

	public FillStyle() {
		super();
	}

	// prototype or deep copy constructor
	public FillStyle(FillStyle fillStyle) {
		super();
		System.out.println("Deep Copying FillStyle...");
		this.fillColor = fillStyle.fillColor;
		this.fillPattern = fillStyle.fillPattern;
	}

	public Color getFillColor() {
		return fillColor;
	}

	public void setFillColor(Color fillColor) {
		this.fillColor = fillColor;
	}

	public FillPattern getFillPattern() {
		return fillPattern;
	}

	public void setFillPattern(FillPattern fillPattern) {
		this.fillPattern = fillPattern;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("fillColor=").append(fillColor).append(", fillPattern=").append(fillPattern);
		return builder.toString();
	}

}
