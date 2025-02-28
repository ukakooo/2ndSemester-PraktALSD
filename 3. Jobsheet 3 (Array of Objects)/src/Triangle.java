public class Triangle {
    public int base;
    public int height;

    public Triangle() {

    }

    public Triangle(int a, int t) {
        base = a;
        height = t;
    }

    int countArea() {
        return (base*height)/2;
    }

    double countPerimeter() {
        double side = Math.sqrt((base / 2) * (base / 2) + height * height);
        return base + 2 * side;
    }
}