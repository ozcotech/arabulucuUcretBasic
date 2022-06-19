import java.util.Scanner;
/**
 * arabuluculukilk
 */
public class arabulucuUcret {

  public static void main(String[] args) {
    System.out.println("Anlaşma Miktarını Giriniz: ");
    Scanner veri = new Scanner (System.in);

    int ucret = veri.nextInt();

    double sonuc = 0;

    if (ucret > 0) {  

      if (ucret > 4420000){

        sonuc = (((50000 * 6 ) / 100) + ((80000 * 5) / 100) + ((130000 * 4) / 100) + ((260000 * 3) / 100) + ((780000 * 2) / 100) + ((1040000 * 1.5) / 100) + ((2080000 * 1) / 100) + ((ucret - 4420000) * 0.5 /100));

      }

      else if (ucret > 2340000 && ucret <= 4420000){

        sonuc = (((50000 * 6 ) / 100) + ((80000 * 5) / 100) + ((130000 * 4) / 100) + ((260000 * 3) / 100) + ((780000 * 2) / 100) + ((1040000 * 1.5) / 100) + ((ucret - 2340000) * 1 / 100));

      }
    
      else if (ucret > 2080000 && ucret <= 2340000){

        sonuc = (((50000 * 6 ) / 100) + ((80000 * 5) / 100) + ((130000 * 4) / 100) + ((260000 * 3) / 100) + ((780000 * 2) / 100) + ((ucret - 1300000) * 1.5) / 100);

      }

     else if (ucret > 1300000 && ucret <= 2080000){

        sonuc = (((50000 * 6 ) / 100) + ((80000 * 5) / 100) + ((130000 * 4) / 100) + ((260000 * 3) / 100) + ((780000 * 2) / 100) + ((ucret - 1300000) * 1.5) / 100);

      }

      else if (ucret > 780000 && ucret <= 1300000){

        sonuc = (((50000 * 6 ) / 100) + ((80000 * 5) / 100) + ((130000 * 4) / 100) + ((260000 * 3) / 100) + (((ucret - 520000) * 2) / 100));

      }

      else if (ucret > 520000 && ucret <= 780000){

        sonuc = (((50000 * 6 ) / 100) + ((80000 * 5) / 100) + ((130000 * 4) / 100) + ((260000 * 3) / 100) + (((ucret - 520000) * 2) / 100));

      }

      else if (ucret > 260000 && ucret <= 520000){

        sonuc = (((50000 * 6 ) / 100) + ((80000 * 5) / 100) + ((130000 * 4) / 100) + (((ucret - 260000) * 3) / 100));

      }

      else if (ucret > 130000 && ucret <= 260000){
        sonuc = (((50000 * 6 ) / 100) + ((80000 * 5) / 100) + ((ucret - 130000) * 4) / 100);

      }

      else if (ucret > 49999 && ucret <= 130000) {

        sonuc = (((50000 * 6 ) / 100) + (((ucret - 50000) * 5) / 100));
  
      }
  
      else if (ucret <= 50000){

        sonuc = (ucret * 6) / 100;

        if (sonuc < 800.0){
          sonuc = 800.0;
        }

        else{
          sonuc = (ucret * 6) / 100;
        }
           
      }
      System.out.println("Arabuluculuk Ücretiniz: " + sonuc + "TL'dir.");

    }

    else {
      System.out.println("Geçersiz miktar girdiniz.");
    }
    veri.close();
    
  }
  
    
}