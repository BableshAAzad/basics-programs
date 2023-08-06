import java.util.Scanner;

class MPowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M and N values : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int pro = 1;
        int intiN = n;
        while (n > 0) {
            pro = pro * m;
            n--;
        }
        System.out.println(m + " of power " + intiN + " is : " + pro);
    }
}
