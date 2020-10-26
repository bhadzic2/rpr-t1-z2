/*Koristeći IntelliJ IDEA napraviti projekat pod nazivom "rpr-t1-z2".
Napravite program koji na ekranu ispisuje sve brojeve između 1 i n koji su djeljivi sa sumom svojih cifara,
pri čemu se n unosi sa tastature. U programu se obavezno treba nalaziti funkcija sumaCifara.
Po završetku zadatak treba postaviti na GitHub koristeći isključivo funkcionalnosti IntelliJ IDEA okruženja!
 */

package ba.unsa.etf.rpr;
import java.util.Scanner;

public class DjeljiviSumom {

    public static void main(String[] args) {
	    Scanner ulaz=new Scanner(System.in);
	    System.out.println("Unesite broj n: ");
	    int n=ulaz.nextInt();
	    for(int i=1;i<=n;i++){
	        if(i%sumaCifara.main(i)==0) System.out.println(i);
        }
    }
}
