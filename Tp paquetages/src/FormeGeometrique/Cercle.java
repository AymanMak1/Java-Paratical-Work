package FormeGeometrique;

public class Cercle {
	 private double radius;
	 private String color;
	 public Cercle() {this (1.0 ); }
	 public Cercle(double r) {radius = r;  color = "red";  }
	 public double getRadius( ) { return radius; }
	 public double getArea( ) { return radius*radius*Math.PI; } 
	 public String getColor() { return color ; } 
}
