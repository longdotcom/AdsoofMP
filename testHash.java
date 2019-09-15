

public class testHash
{
    
    public static void main(String[]args)
    {
    
        int hashReturn = hash("cheese");
        System.out.println(hashReturn);
        hashReturn = hash("book");
        System.out.println(hashReturn);
        hashReturn = hash("dinosaur");
        System.out.println(hashReturn);
    
    
    }
    
    public static int hash(String toHash) 
    {
        int sizeOfArray = 1000000;
        int hashKey = 0;

        for (int i = 0; i < toHash.length(); i++) 
        {
            // 'a' has the character code of 97 so subtract
            // to make our letters start at 1

            int charCode = toHash.charAt(i) - 96;

            //int hKVTemp = hashKey;

            // Calculate the hash key using the 26 letters plus blank

            hashKey = (hashKey * 27 + charCode) % sizeOfArray;
            
            //System.out.println(charCode + " " +hashKey);

        }

        return hashKey;

    }
   
}
