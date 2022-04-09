# Hash-Tables-with-java

CSC2001F 2022 Assignment 3
Instructions
The goal of this assignment is to write a perfect hash function for a set of simple textual data.

The dataset provided is 36 student IDs stored in the names36.txt file.

The hash table implementation stores simple String data items, so can only track if an item is in the data structure or not.

A skeleton program is provided.  You are required to complete 2 pieces of code that are contained in HashTableFunctions.java:

the weights array, which is used to compute the hash function. 
the find (s) function, which determines if a string is in the data structure or not.
The hash function uses the weights (with values 0-4) to create a linear combination of the 9 characters in a student ID:

h(s) = weights[0] * s[0] + weights[1] * s[2] + ... + weights[8] * s[8]

The TestHashTable program loads the test dataset into the data structure, then performs find operations on all the test data items, followed by find operations on a disjoint set of unseen data items.

Begin by studying the skeleton program provided and first write the find function.  When your find function is working, the output from the TestHashTable program will give you a maximum hit value and zero miss value for the test data, and the opposite for the unseen data.

TestHashTable takes a single command-line argument that is the threshold to test for; this threshold is the number of collision-related additional comparisons performed in the insert function.  Your goal in designing your hash function is to minimise this value, ideally reaching a value of 0 (thus indicating a perfect hash function).  The marking script will test your program with decreasing values of this threshold.  The key part of finding the solution is finding the correct weights - there are about 2 million combinations (5^9) and less than 10 will give you a perfect hash function. 

Write a program to check every option to find the optimal solution. 

Submit your solution as a ZIP file to the Automatic Marker.  You need to submit the HashTableFunctions.java file and all other code you used to find the solution.  This assignment is automatically-marked but must still document all your code.  There is no requirement for a Makefile, javadocs output, git or a report.  A tutor may, however, check your code manually to ensure that you have answered the question.


# To execute this 
$ javac *.java
$ java MyThread
