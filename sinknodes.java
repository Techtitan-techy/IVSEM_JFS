public class sinknodes {
    public static void main(String[] args) {
        int zero = 0;
        int arr[][] = { { 0, 1, 1, 0, 1 }, { 0, 0, 0, 1, 0 }, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 } };
        for (int i = 0; i < arr.length; i++) {
            zero = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0) {
                    zero++;
                }

            }
            if (zero == arr.length) {
                System.out.println("Sink Nodes " + (char) (65 + i)); //explicit type casting 
            } 
            
        }
    }
}