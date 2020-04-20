public class Triangle
{
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double perimeter()
    {
        return sideA + sideB + sideC;
    }
    public double area()
    {
        return (sideA + sideB + sideC) / 2;
    }
    public String info()
    {
        return sideA + " " + sideB + " " + sideC + " " + perimeter() + " " + area();
    }
}
