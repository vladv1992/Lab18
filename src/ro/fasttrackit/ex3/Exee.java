package ro.fasttrackit.ex3;


public class Exee {

    public static boolean isPalindrome(int n) {

        int rev = 0;
        int temp = n;
        while (temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (rev == n);
    }


    public static void main(String[] args) {
        int n = 313;

        if (isPalindrome(n) == true) {
            System.out.println("is true");
        } else {
            System.out.println("not true");
        }


    }
}

