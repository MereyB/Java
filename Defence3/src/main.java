public class main
{
    public static void main(String[] args)
    {
        try{
            Triangle TTR = new Triangle(2, 4,8);
            Quadrangle QQR = new Quadrangle(2, 4, 2, 3, 5, 6);
            System.out.println("triangle:");
            System.out.println(TTR.info());
            System.out.println("quadrangle:");
            System.out.println(QQR.info());
        }
        catch(Exception E)
        {
            E.printStackTrace();
        }
    }
}
