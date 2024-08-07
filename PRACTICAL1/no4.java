public class no4{
    public static void main(String args[]) {
        double C, F = 100;
        C = F - (32 / 1.8);
        System.out.println("Celcius value is: "+C);

        double area, pi = 3.14, r = 2, R = 4, h = 7;
        area = pi * r * r + 2 * pi * R * h;
        System.out.println("Area of cylinder:"+area);

        double Side, a = 3, b = 5, x = 8, cos, val;
        cos = Math.cos(x);
        val = (a * a) + (b * b) - (2 * a * b) * cos;
        Side = Math.sqrt(val);
        System.out.println("Side is " + Side);
    }
}