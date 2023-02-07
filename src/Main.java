import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = {1,2,3,4,5,6,7,8,9,10};
        int[] ciftSayi = new int[sayilar.length];
        int sayi = 0;
        for(int i :sayilar){
            if(i%2==0){
                ciftSayi[sayi++] = i;
            }
        }

        for(int c:ciftSayi){
            if(c!=0){
                System.out.println(c);
            }
        }
    }
}
