package ro.fasttrackit.ex1;

public class Ex {
    public int sumFirstN(int i) {
        if (i == 0) {
            return 0;

        }
        return i + sumFirstN(i - 1);
    }

    public static void main(String[] args) {
        Ex ex = new Ex();
        System.out.println(ex.sumFirstN(5));

    }

}



