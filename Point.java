public class Point {

  private double x, y;

  public Point(double X, double Y) {
    x = X;
    y = Y;
  }

  public Point(Point p) {
    x = p.x;
    y = p.y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distanceTo(Point other) {
    double x1 = this.x - other.x;
    double y1 = this.y - other.y;
    double d = Math.sqrt(x1 * x1 + y1 * y1);
    return d;
  }

  public boolean equals(Point other) {
    return (this.x == other.x && this.y == other.y);
  }
}
