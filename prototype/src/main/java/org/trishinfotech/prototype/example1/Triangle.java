package org.trishinfotech.prototype.example1;

public class Triangle extends Shape {

	protected int sideA;
	protected int sideB;
	protected int sideC;
	protected FillStyle fillStyle;

	public Triangle() {
		super();
	}

	// prototype or deep copy constructor
	public Triangle(Triangle triangle) {
		super(triangle);
		System.out.println("Deep Copying Triangle...");
		this.sideA = triangle.sideA;
		this.sideB = triangle.sideB;
		this.sideC = triangle.sideC;
		this.fillStyle = new FillStyle(triangle.fillStyle);
	}

	@Override
	public void draw() {
		System.out.printf("Drawing Triangle (%s, %s).\n", super.toString(), this.toString());
	}

	@Override
	String type() {
		return "Triangle";
	}

	public int getSideA() {
		return sideA;
	}

	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	public int getSideB() {
		return sideB;
	}

	public void setSideB(int sideB) {
		this.sideB = sideB;
	}

	public int getSideC() {
		return sideC;
	}

	public void setSideC(int sideC) {
		this.sideC = sideC;
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
		builder.append("sideA=").append(sideA).append(", sideB=").append(sideB).append(", sideC=").append(sideC)
				.append(", ").append(fillStyle);
		return builder.toString();
	}

}
