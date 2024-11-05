public class SevenSegment {
        public static void main(String[] args) {
                display(28);
        }
    
        public static void display(int n) {
                // Display each digit in the number from right to left
                while (n > 0) {
                        int digit = n % 10;
                        drawDigit(digit);
                        n /= 10;
                }
        }
    
        private static void drawDigit(int d) {
                String[] segments = new String[5];
                for (int i = 0; i < 5; i++) {
                        // Use the provided method signature to get each line of the digit
                        segments[i] = ssd(d, i + 1);
                }
                for (String segment : segments) {
                        System.out.print(segment + " ");
                }
                System.out.println(); // Move to the next line after printing all segments of a digit
        }
    
        private static String ssd(int d, int n) {
                switch ((d * 10) + n) {
                        case 1: case 5: case 21: case 23: case 25: case 31: case 33: case 35:
                        case 43: case 51: case 53: case 61: case 63: case 65: case 71:
                        case 81: case 83: case 85: case 91: case 93: case 95:
                            return "..."; // Simulated ASCII art representation
                        default:
                            return ""; // No drawing for other cases
                }
        }
}