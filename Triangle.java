public class Triangle {

  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1,
                  double x2, double y2,
                  double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter() {
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    double p = a + b + c;
    return (p);
  }

  public double getArea() {
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    double s = getPerimeter() / 2;
    double T = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    return T;
  }

  public String classify() {
    double a = Math.round(v1.distanceTo(v2) * 10000)/10000.0;
    double b = Math.round(v2.distanceTo(v3) * 10000)/10000.0;
    double c = Math.round(v3.distanceTo(v1) * 10000)/10000.0;
    int howManyEqual = 0;
    if (a == b) {howManyEqual++;}
    if (b == c) {howManyEqual++;}
    if (a == c) {howManyEqual++;}
    String type = "";
    if (howManyEqual == 0) {type = "scalene";}
    else if (howManyEqual == 1) {type = "isosceles";}
    else {type = "equilateral";}
    return type;
  }

  public String toString() {
    return ("v1(" + v1.getX() + ", " + v1.getY() +
          ") v2(" + v2.getX() + ", " + v2.getY() +
          ") v3(" + v3.getX() + ", " + v3.getY() + ")");
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) {
      v1 = newP;
    } else if (index == 1) {
      v2 = newP;
    } else {
      v3 = newP;
    }
  }
}
