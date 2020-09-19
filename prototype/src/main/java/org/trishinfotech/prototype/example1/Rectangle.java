package org.trishinfotech.prototype.example1;

public class Rectangle extends Shape {

	protected int length;
	protected int width;
	protected FillStyle fillStyle;

	public Rectangle() {
		super();
	}

	// prototype or deep copy constructor
	public Rectangle(Rectangle rectangle) {
		super(rectangle);
		System.out.println("Deep Copying Rectangle...");
		this.length = rectangle.length;
		this.width = rectangle.width;
		this.fillStyle = new FillStyle(rectangle.fillStyle);
	}

	@Override
	public void draw() {
		System.out.printf("Drawing Rectangle (%s, %s).\n", super.toString(), this.toString());
	}

	@Override
	String type() {
		return "Rectangle";
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public FillStyle getFillStyle() {
		return fillStyle;
	}

	public void setFillStyle(FillStyle fillStyle) {
		this.fillStyle = fillStyle;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("length=").append(length).append(", width=").append(width).append(", ").append(fillStyle);
		return builder.toString();
	}

}
