import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int r;
       int a;
       double pi=3.14;


        Scanner input=new Scanner(System.in);

        System.out.println("lütfen yarıçapı giriniz:");
        r=input.nextInt();
        System.out.println("lütfen merkez açısının ölçüsü giriniz");
        a=input.nextInt();




        double alan=(pi*(r*r)*a)/360;
        System.out.println("daire diliminin alanı:"+alan);
        }
    }
