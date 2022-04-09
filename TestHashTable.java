import java.util.*;
import java.nio.file.*;


class TestHashTable
{
   HashTable h = new HashTable ();
   static HashTableFunctions htf = new HashTableFunctions();
 

   public void setHashTableFunction(HashTableFunctions newHtf) {
     h.setHashTableFunction(newHtf);
   }

   void run ( int threshold )
   {

      int hit1=0, miss1=0, hit2=0, miss2=0;
      List<String> lines = null;
      List<String> linesmiss = null;

      try {
         lines = Files.readAllLines (Paths.get ("names36.txt"));
         linesmiss = Files.readAllLines (Paths.get ("namesmiss.txt"));
      } catch (Exception e) {
         System.out.println (e.toString ());
      }

      for ( int i=0; i<lines.size (); i++ )
      {
         h.insert (lines.get (i));
      }

      for ( int i=0; i<lines.size (); i++ )
      {
         if (h.find (lines.get(i)))
            hit1++;
         else
            miss1++;
      }

      for ( int i=0; i<linesmiss.size (); i++ )
      {
         if (h.find (linesmiss.get(i)))
            hit2++;
         else
            miss2++;
      }

      // Only print when we  encouter a perfect hash
      if (h.getCollisions () <= threshold) {
       
         System.out.println("Collissions = "+h.getCollisions()+" "+htf.getWeights());
      }

  
   }

   public void main ( String [] args )
   {

      htf.setWeights(args[1]);
      TestHashTable tht = new TestHashTable();
      tht.setHashTableFunction(htf);
      tht.run(Integer.valueOf (args[0]));
      
   }
}
