package task1;

public class Cos {
    public static double cosx(double x,int n)
    {
        double PI2 = Math.PI * 2;
        if (x >= 0) {
            while (x > PI2) {
                x -= PI2;
            }
        } else if (x < 0){
            while (x < PI2) {
                x += PI2;
            }
        }
        double result = 0;
        double xx = x * x;
        double fact = 1;
        int sign = 1;
        double numerator = 1;
        for (int i = 0; i<=n; i++)
        {
            result+= sign * numerator / fact;
            numerator*= xx;
            fact *= (2*i+1)*(2*i+2);
            sign = -sign;
        }

        return result;
    }
}
