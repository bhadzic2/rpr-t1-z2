package ba.unsa.etf.rpr;

public class sumaCifara {
    public static int main(int n){
        int suma=0;
        while(n!=0){
            suma=suma + (n%10);
            n/=10;
        }
        return suma;
    }
}
