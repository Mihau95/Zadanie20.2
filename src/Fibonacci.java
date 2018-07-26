public class Fibonacci {

    public String fib() {
        int seq = 0;

        int x = 1;
        int y = 2;

        while (x < 4000000) {
            if (x % 2 == 0) {
                seq += x;
            }
            int sum = x + y;

            x = y;
            y = sum;
        }
        return Integer.toString(seq);

    }
    public static void main (String[]args){
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib());
    }
}
