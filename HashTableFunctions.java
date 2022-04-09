import java.util.*;

class HashTableFunctions
{
   // hash function weights
   // 9 integers, each in the range 0-5 to act as weights for the characters in the keys
   int [] weights = {1, 1, 1, 1, 1, 1, 1, 1, 1};
   // ADD YOUR WEIGHTS INSTEAD OF 1s

   // returns True if the hash table contains string s
   // return False if the hash table does not contain string s
   boolean find ( String s, int h, int hashTableSize, String [] hashTableArray ){
      boolean flag = false;
      for(element : hashTableArray){
         if(s == element){
            flag = true;
            break;
         }
      }
      return flag;
   }

   public void setWeights(String newWeights) {
     String[] sa = newWeights.split("");
     int[] ia = new int[sa.length];
     for (int index=0; index < sa.length; index++)
     {
        ia[index] = Integer.parseInt(sa[index]);
     }
     this.weights = ia;
     //System.out.println("Weights array: "+Arrays.toString(weights));
  }

  public String getWeights() {
      return Arrays.toString(weights);
  }
}
