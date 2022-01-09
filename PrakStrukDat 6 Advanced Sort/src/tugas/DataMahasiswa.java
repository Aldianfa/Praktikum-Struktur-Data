package tugas;
/**
 *
 * @author Ijul
 */
public class DataMahasiswa {
    public static void main(String[] args) {
        int max=100;
        Advance_sort arr;
        arr=new Advance_sort(max);
        
        arr.insert(16650210, "Aldian", "Malang");
        arr.insert(16650200, "Faizzul", "Sulawesi");
        arr.insert(16650240, "Izzul", "Gresik");
        arr.insert(16650230, "Ijul", "Jakarta");
        arr.insert(16650220, "Amerta", "Bandung");
        arr.insert(16650280, "Citra", "Surabaya");
        arr.insert(16650270, "Dwiyanti", "Tangerang");
        arr.insert(16650250, "paramitha", "Papua");
        arr.insert(16650260, "Hanif", "bali");
        
        System.out.println("=====Data yg diinputkan=====");
        arr.display();
        
        arr.mergeSort();
        arr.display();
        arr.ShellSort();
        arr.display();
        arr.QuickSort();
        arr.display();  
    }
}
