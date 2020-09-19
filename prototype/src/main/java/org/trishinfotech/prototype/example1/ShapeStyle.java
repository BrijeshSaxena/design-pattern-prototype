package org.trishinfotech.prototype.example1;

import org.trishinfotech.prototype.Color;
import org.trishinfotech.prototype.LinePattern;

public class ShapeStyle {

	protected Color lineColor;
	protected LinePattern linePattern;
	protected double lineThickness;

	public ShapeStyle() {
		super();
	}

	// prototype or deep copy constructor
	public ShapeStyle(ShapeStyle shapeStyle) {
		this();
		System.out.println("Deep Copying ShapeStyle...");
		this.lineColor = shapeStyle.lineColor;
		this.linePattern = shapeStyle.linePattern;
		this.lineThickness = shapeStyle.lineThickness;
	}

	public Color getLineColor() {
		return lineColor;
	}

	public void setLineColor(Color lineColor) {
		this.lineColor = lineColor;
	}

	public LinePattern getLinePattern() {
		return linePattern;
	}

	public void setLinePattern(LinePattern linePattern) {
		this.linePattern = linePattern;
	}

	public double getLineThickness() {
		return lineThickness;
	}

	public void setLineThickness(double lineThickness) {
		this.lineThickness = lineThickness;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("lineColor=").append(lineColor).append(", linePattern=").append(linePattern)
				.append(", lineThickness=").append(lineThickness);
		return builder.toString();
	}
}
