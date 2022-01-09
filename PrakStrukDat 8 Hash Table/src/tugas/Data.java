package tugas;
/**
 *
 * @author Ijul
 */
public class Data {
    private int data;
    public Data(int data){
        this.data=data;
    }
    
    public int getKey(){
        return data;
    }
    
    public void displayFind(){
        System.out.println("Found : "+data);
    }
    
}
