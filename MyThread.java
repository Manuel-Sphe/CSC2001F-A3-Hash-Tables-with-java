/**
 * Sphesihle Madonsela
 * The implematation of the java forj-join 
 * using this class to searc for a combination that results to a perfect hash 
 * 
 */
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class MyThread extends RecursiveAction{
    protected int lo,hi;
    protected String [] arr;
    static final int SEQUENTIAL_CUTOFF = 10000; 
    static ForkJoinPool fjPool = new ForkJoinPool();

    public MyThread(int l, int h, String[] a){this.lo = l; this.hi = h; this.arr =a;}

    public void compute(){

        TestHashTable obj  = new TestHashTable();

        if((hi - lo )< SEQUENTIAL_CUTOFF){
            for(int i = lo; i<hi;i++){
                obj.main(new String[] {"0",arr[i]});
            }
        }
        else{

            int mid = (hi +lo)/2;
            MyThread left = new MyThread(lo, mid, arr);
            MyThread right = new MyThread(mid, hi, arr);

            left.fork();
            right.compute(); // hand - optimization
            left.join();
        }
    }

    public static void main(String[] args) {
        try{

            String [] array =  new String[(int) Math.pow(5, 9)];
           
            
            int index = 0;
            Scanner file = new Scanner(new FileInputStream("InputFile.txt"));

            while(file.hasNext()){
              // obj.main(new String [] {"100",file.nextLine()});
              array[index++] = file.nextLine();
            }

            fjPool.invoke(new MyThread(0, array.length, array));
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found!!");
            System.exit(0);
        }
    }
}
