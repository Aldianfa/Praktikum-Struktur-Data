
package Tugas_5;

public class Eksponen {
    
    public int hitungexponen (int base,int exp){
        if (exp == 0){
            return 1;
        }
        return (base*hitungexponen(base, exp-1));
        
    }  
    public static void main(String[] args) {
        Eksponen ex = new Eksponen();
        
        
        System.out.println("2^6 = "+ex.hitungexponen(2, 10));
        System.out.println("3^5 = "+ex.hitungexponen(3, 5));
        System.out.println("3^16 = "+ex.hitungexponen(3, 16));
//        System.out.println("3^0  = "+ex.hitungexponen(3, 0));S
//        System.out.println("6^1  = "+ex.hitungexponen(6, 1));
    }
}
