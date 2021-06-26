import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k ,sayac=0,i,toplam=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        k=input.nextInt();

        for (i=0; i<=k;i++){
            if(i%3==0 && i%4==0 && i>=1){
               toplam+=i;
               sayac++;
            }
        }
        if(sayac>=1){
            System.out.println("Ortalama : "+toplam/sayac);
        }
        else
            System.out.println("Girilen Sayı 3 ve 4 e tam bölünemıyor");


    }
}
