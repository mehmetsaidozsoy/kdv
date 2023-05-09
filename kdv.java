import java.util.Scanner;

public class kdv{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double kdvOran, topTutar=0, tutar,hesKDV;
            System.out.println("Toplam tutarı hesaplanacak rakamı girin  : ");
            tutar=input.nextDouble();
            System.out.println("Alınan Tutar :"+tutar);  
            kdvOran= (tutar>0 && tutar<1000) ? 0.18 : 0.08;
            System.out.println("Uygulanacak KDV oranı  :"+kdvOran);  
            topTutar+=tutar+(tutar*kdvOran); 
            System.out.println("Toplam Tutar  :"+topTutar);  
            System.out.print("Hesaplanan KDV tutarı :"+(topTutar-tutar));
        }
       
    }
}