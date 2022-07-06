package ro.fasttrackit.ex5;

public class Exeeeee {
        public int fibo( int n){

            if (n == 0) {
                return 1;

            }
            return n *  fibo(n - 1);
        }

    public static void main(String[] args) {
        Exeeeee exe = new Exeeeee();
     System.out.println(exe.fibo(5));;
    }
}