
 class test
{

    public static void main(String[] args)
    {

        WordStoreImp store = new WordStoreImp(11);
        
        store.add("hello");
        store.add("hello");
        store.add("hello");
        store.add("goodbye");
        store.add("goodbye");
        store.add("chicken");
        store.add("chicken");
        store.add("cheese");
        store.add("book");
        store.add("book");
        store.add("dinosaur");

        
        System.out.println("");

        WordList[] aarray = store.getArray();

        for(int i=0;i<aarray.length;i++)
        {
            System.out.println("  Index: " + i);
            aarray[i].printList();
        }
        
        int count = store.count("hello");
        System.out.println("  Hello: "+count);

        count = store.count("goodbye");
        System.out.println("  Goodbye: " +count);

        count = store.count("chicken");
        System.out.println("  Chicken: " +count);

        count = store.count("cheese");
        System.out.println("  Cheese: "+count);

        count = store.count("book");
        System.out.println("  Book: " + count);

        count = store.count("dinosaur");
        System.out.println("  Dinosaur: " +count);

        
        
        // REMOVE TESTING






        
        store.remove("hello");
        int count = store.count("hello");
        System.out.println("  Hello: "+count);

        store.remove("goodbye");
        count = store.count("goodbye");
        System.out.println("  Goodbye: " +count);

        store.remove("chicken");
        count = store.count("chicken");
        System.out.println("  Chicken: " +count);

        store.remove("cheese");
        count = store.count("cheese");
        System.out.println("  Cheese: "+count);

        store.remove("book");
        count = store.count("book");
        System.out.println("  Book: " + count);

        store.remove("dinosaur");
        count = store.count("dinosaur");
        System.out.println("  Dinosaur: " +count);

        
       
        // System.out.println("");

        // aarray = store.getArray();

        // for(int i=0;i<aarray.length;i++)
        // {

        // System.out.println("Index: " + i);
        // System.out.println("");
        // aarray[i].printList();

         // }

    
        
    }
}
