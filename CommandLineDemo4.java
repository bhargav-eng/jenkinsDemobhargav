class CommandLineDemo4 {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("Please provide two integer arguments.");
            return;
        }

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            int r1 = n1 + n2;
            int r2 = n1 - n2;
            int r3 = n1 * n2;

            System.out.println("Addition: " + r1);
            System.out.println("Subtraction: " + r2);
            System.out.println("Multiplication: " + r3);

            if (n2 != 0) {
                int r4 = n1 / n2;
                System.out.println("Division: " + r4);
            } else {
                System.out.println("Division: Cannot divide by zero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}

