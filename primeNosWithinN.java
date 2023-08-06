import java.util.Scanner;

class primeNosWithinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer velue : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            boolean rf = check(i);
            if(rf)
            count++;
        }
        System.out.print(count+" ");
    }
    static boolean check(int n){
        int count = 0;
        for(int i=2; i<=n; i++){
            if(n%i==0)
               count++;
        }
        return count==1;
    }
}
