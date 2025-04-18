public class Prime {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a number.");
            return;
        }

        int num = Integer.parseInt(args[0]);
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
