class pattern {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++) {
            // Print leading spaces
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for(int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }
}

