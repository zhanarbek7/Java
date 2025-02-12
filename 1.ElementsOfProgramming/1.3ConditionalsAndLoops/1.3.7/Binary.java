public class Binary {
    public static void main(String[] args) { // Print binary representation of n.
        int n = Integer.parseInt(args[0]);
        int power = 1;

        // Imagine of this algorithm as of finding
        // 1. Max weight you can pick up = power
        // 2. Other weight that you can pick up, described in part 2


        // Part 1)
        // Find the largest power of 2 <= n
        // Power is our power
        while(power <= n/2){
            power *=2;
        }

        // Part 2)
        // In the 2nd part N will represent the remaining value to cover or represent
        // We need to find the ones we need to represent

        while(power > 0){
            if(n<power){
                // You kinda just skip, because this doesn't need to be shown now
                System.out.print(0);
            }
            else{
                // You show it, like you turn the light bulb on
                // You show it now
                System.out.println(1);
                n-=power;
            }
            power/=2;
        }
    }


}