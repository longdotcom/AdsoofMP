Implementing a String collection class

WordStoreIMP implements an interface called WordStore. This interface defines a collection which stores Strings. It has methods:

* public void add(String word) 
Adds a String to the collection 
* public int count(String word) 
Returns the number of times a String is in the collection 
* public void remove(String word) 
Removes one occurrence of a String from the collection, or leaves the collection unchanged if the String does not occur in it. 

The data structure is built to handle n amount of words generated as an argument given. Little to no built in methods or libraries are used as a way to practice complete implementation, including my own made hash function. LinkedLists are used for collision handling within a hash table. 

Although not the most efficient implementation, this was built many years ago as practice 
