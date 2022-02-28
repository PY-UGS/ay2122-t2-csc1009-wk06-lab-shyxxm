import java.util.LinkedList;
import java.util.Random;

class q2 {
    public static void main(String[] args)
    {
  
        LinkedList<Integer>  list = new LinkedList<>();
  
        // Adding elements to Linked List
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);

        //Element to add
        int element3 = 13;

        System.out.println("Linked List Before Adding :-");

        for (int i : list) {
            System.out.print(i + " ");
        }

        addAndSort(list,element3); //function call
        System.out.println();
        System.out.println();

        System.out.println("Linked List After Adding :-");
        
        for (int i : list) {
            System.out.print(i + " ");
        }

        // Elements to swap
        int element1 = 3;
        int element2 = 11;
        
        System.out.println();
        System.out.println();
        System.out.println("Linked List Before Swapping :-");
  
        for (int i : list) {
            System.out.print(i + " ");
        }

        // Swapping the elements
        swap(list, element1, element2); //function call
        System.out.println();
        System.out.println();
  
        System.out.println("Linked List After Swapping :-");
  
        for (int i : list) {
            System.out.print(i + " ");
        }

        //random 
        LinkedList<Integer>  randlist = new LinkedList<>();
        Random random = new Random();
        for(int i =0;i <500;i++){
            int rand = random.nextInt(9999 - 1000) + 1000;
            randlist.add(rand);
        }
        
        System.out.println();
        System.out.println();
       
        int option = random.nextInt(9999 - 1000) + 1000;

        int index = findValue(randlist,option); //function call

        System.out.println(index);
 
    }

    //Swap Function
    public static void swap(LinkedList<Integer> list,
                            int ele1, int ele2)
    {
  
        // Getting the positions of the elements
        int index1 = list.indexOf(ele1);
        int index2 = list.indexOf(ele2);
  
        // Returning if the element is not present in the
        // LinkedList
        if (index1 == -1 || index2 == -1) {
            return;
        }
  
        // Swapping the elements
        list.set(index1, ele2);
        list.set(index2, ele1);
    }

    //addAndSort Function
    public static void addAndSort(LinkedList<Integer> list, int ele3){
        for(int i=0; i < list.size();i++){
            if (ele3 <= list.get(i)){
                list.add(i,ele3);
                break;
            }
            else if (ele3 > list.getLast())
            {
                 list.add(ele3);
                 break;
            }
        }
    }

    //random number Function
    public static int findValue(LinkedList<Integer> randlist, int opt){
        for (int i = 0; i < randlist.size();i++){
            if( opt == randlist.get(i)){
                return i;
            }
        }
        return -1;
    }


}