public class Sqrt
{
 public static void main(String[] args)
 {
  // c given is 2
 double c = Double.parseDouble(args[0]);
 double EPSILON = 1e-5; // 0.000000000000001
 double t = c; // t = 2
  
 while (Math.abs(t - c/t) > EPSILON * t)
 { 
 t = (c/t + t) / 2.0;
 }
 System.out.println(t);
 }
}