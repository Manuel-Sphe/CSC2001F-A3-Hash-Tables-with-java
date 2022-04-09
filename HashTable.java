class HashTable
{
   // hash table size
   int hashTableSize = 37;

   // array to store items
   String [] hashTableArray;
   // for counting the number of additional comparisons due to collisions
   int collisions;

   HashTableFunctions htf;

   // constructor
   public HashTable ()
   {
      hashTableArray = new String [hashTableSize];
      for ( int i=0; i<hashTableSize; i++ )
         hashTableArray[i] = "";
      collisions = 0;
   }

   public void setHashTableFunction(HashTableFunctions newHtf) {
     this.htf = newHtf;
   }


   // return number of additional collision comparisons
   public int getCollisions ()
   { return collisions; }

   // hash function based on external weights
   public int hash ( String s )
   {
       // = new HashTableFunctions ();
      int val = 0;
      for ( int i=0; i<9; i++ )
         val += htf.weights[i] * s.charAt (i);
      return val % hashTableSize;
   }

   // inserts string s into the hash table
   public void insert ( String s )
   {
      int h = hash (s);
      while (! hashTableArray[h].equals (""))
      {
         h = (h+1) % hashTableSize;
         collisions++;
      }
      hashTableArray[h] = s;
   }

   // stub to point to external function
   boolean find ( String s )
   {
      HashTableFunctions htf = new HashTableFunctions ();
      return htf.find (s, hash (s), hashTableSize, hashTableArray);
   }
}
