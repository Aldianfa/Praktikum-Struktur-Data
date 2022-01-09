package Tugas_5;
import java.util.Scanner;

public class MenaraHanoi {
    int urutan = 1;
    public static void main(String[] args) {
        MenaraHanoi hanoi=new MenaraHanoi();
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Jumlah cakram :");
        int cakram=scanner.nextInt();
        
        System.out.println("Hasil Rekursi :");
        hanoi.doMenara(cakram,'A' ,'C', 'B');
    }
    public void doMenara(int cakram, char first,char last, char mid){
        if (cakram==1) {
            System.out.println((urutan++)+". Pindahkan cakram "+cakram+" dari "+first+" ke "+last);
        }
        else{
            doMenara(cakram-1, first, mid, last);
            System.out.println((urutan++)+". Pindahkan cakram "+cakram+" dari "+first+" ke "+last);
            doMenara(cakram-1, mid, last, first);
        }
    }
    
}
