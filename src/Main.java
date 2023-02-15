import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kenar1 , kenar2 , kenar3 ;
        Scanner input = new Scanner(System.in);

    System.out.println("Birinci kenarın uzunluğunu giriniz:");
    kenar1=input.nextInt();

    System.out.println("İkinci kenarın uzunluğunu giriniz:");
    kenar2=input.nextInt();

    System.out.println("Üçüncü kenarın uzunluğunu giriniz:");
    kenar3=input.nextInt();

    int cevre= kenar1+kenar2+kenar3;
    float alan =(float)Math.sqrt(cevre*((cevre-kenar1)*(cevre-kenar2)*(cevre*kenar3)));
    System.out.println("Üçgenin çevresi:"+cevre);
    System.out.println("Üçgenin alanı:"+ alan);
    }
}