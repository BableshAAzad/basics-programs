import java.util.Scanner;

class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value : ");
        int n = sc.nextInt();
        int count = 0;
        do{
            int digi = n%10;
            count++;
            n=n/10;
        }while(n>0);
        System.out.println(count);
    }

}
