import java.util.Scanner;
class SumOfAllDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer velue : ");
        int n = sc.nextInt();
        int sum = 0;
        do{
            int digi = n%10;
            sum=sum+digi;
            n=n/10;
        }while(n>0);
        System.out.println(sum);
    }
}