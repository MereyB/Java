public class Quadrangle extends Triangle
{
    private double sideD;
    private double diagonalE;
    private double diagonalF;

    public Quadrangle(double sideA, double sideB, double sideC, double sideD) {
        super(sideA, sideB, sideC);
        this.sideD = sideD;
    }

    public Quadrangle(double sideA, double sideB, double sideC, double sideD, double diagonalE, double diagonalF) {
        super(sideA, sideB, sideC);
        this.sideD = sideD;
        this.diagonalE = diagonalE;
        this.diagonalF = diagonalF;
    }

    @Override
    public double perimeter()
    {
        return sideA + sideB + sideC + sideD;
    }

    @Override
    public double area()
    {
        return sideA * sideB;
    }
    @Override
    public String info()
    {
        return sideA + " " + sideB + " " + sideC + " " + sideD + " " + diagonalE + " " + diagonalF + " " + perimeter() + " " + area();
    }
}
