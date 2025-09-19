// SLIP 1.1 Write a Program to print all Prime numbers in an array of ‘n’ elements.
// (use command line arguments)

class slip1_1 {
    public static void main(String args[]) {
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            boolean isPrime = true;
            for (int j = 2; j < num && isPrime; j++) {
                if (num % j == 0)
                    isPrime = false;
            }

            if (isPrime)
                System.out.println(num + " is prime");
            isPrime = true;
        }
    }
}