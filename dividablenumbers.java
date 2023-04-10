import java.util.Scanner;

public class dividablenumbers {
    public static void main (String[] args){
        int total=0, num=0, avarage;
        Scanner Input= new Scanner(System.in);
        System.out.println("enter a number:");
        num = Input.nextInt();
        for (int i=1; i<=num; i++){
            if (i%3 == 0 & i%4 == 0) {
                System.out.println(i);
                total += i;
                System.out.println("result is:" + total);
            }
        }
    }
}


