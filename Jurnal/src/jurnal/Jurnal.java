
package jurnal;
import java.util.Scanner;

public class Jurnal {
   
    
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = 0;
        int hasil = 0;
        
        Scanner sc = new Scanner(System.in);
	System.out.print("Masukkanpa deret fibonacci ? ");
	z = sc.nextInt();
	for(int i=1;i<=z;i++){
            x=y;
            y=hasil;
            int jum = x+y+z;
            System.out.print(jum+" ");
            hasil=x+y;
        }
   
    }
}
