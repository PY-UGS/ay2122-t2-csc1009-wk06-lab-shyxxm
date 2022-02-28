import java.util.HashMap;
import java.util.Random;

public class q4 {
    public static void main(String[]args){
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);
        hash.put(1,3);
        hash.put(2,5);
        hash.put(3,7);
        hash.put(4,9);
        hash.put(5,11);
        System.out.println(hash.toString());

        //Adding
        System.out.println("Values before add: " + hash.toString());
        hash = Addition(hash, 8);
        System.out.println("Values after add: " + hash.toString());

        //Swapping
        System.out.println("Values before swap: " + hash.toString());
        hash = swap(hash,1, 5 );
        System.out.println("Values after swap: " + hash.toString());

        //Random
        HashMap<Integer,Integer> randHash = new HashMap<>();
        Random random = new Random();
        for(int i = 0;i<500;i++){
            int rand = random.nextInt(9999-1000)+1000;
            randHash.put(i,rand);
        }
        System.out.println();
        System.out.println();
        
        int option = random.nextInt(9999-1000)+1000;
        int index = findValue(randHash,option);
        
        System.out.println(index);

    }
    
    public static HashMap<Integer, Integer> Addition(HashMap<Integer, Integer> hash, int addValue){
        int temp = -1;
        boolean added = false;
        for(int i =0; i < hash.size()+1;i++){
            if(added){
                if(i== hash.size()){
                    hash.put(i,temp);
                    break;
                } else {
                    int temp2 = hash.get(i);
                    hash.replace(i, temp);
                    temp = temp2;
                }
            }
            else if (addValue < hash.get(i)){
                temp = hash.get(i);
                added  = true;
                hash.replace(i, addValue);
            }
        }        
        return hash;
    }

    public static HashMap<Integer,Integer> swap(HashMap<Integer,Integer> hash, int index1, int index5){
        int value1 = hash.get(index1);
        int value2 = hash.get(index5);

        hash.replace(index1, value2);
        hash.replace(index5, value1);

        return hash;
    }

    public static int  findValue(HashMap<Integer,Integer>hash,int findval){
        for (int i=0; i < hash.size();i++){
            if (findval == hash.get(i)){
                return i;
            }
        }
        return -1;
    }
    
}
