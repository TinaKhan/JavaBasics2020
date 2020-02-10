package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class UseOfArrayList40 {
/*
 * Author: Shohag
 */
	public static void main(String[] args) {
		// getting new ArrayList -by default constructor-->initial capacity (ic) 10 
		ArrayList ar = new ArrayList();
		ar.add("Shohag"); // index [0]
		ar.add("Tofael");
		ar.add(5); // different data type is allowed, here int is used
		ar.add(""); // null is allowed for String Type
		ar.add("Manir");
		ar.add("Orfat");
		ar.add("Tofael");// duplicate value is allowed
		ar.add("Imran");
		ar.add(5.5); //? type
		ar.add('M'); // different data type is allowed, here char is used
		ar.add(5, "Nafasat"); // replacing value: adding in index [5]
		ar.add("Mohammad");// ic is [10]-- then capacity will be increased to [ic*(3/2)+1]=16
		
		ar.remove(2);
		
		System.out.println("The size of the ArrayList is: "+ ar.size()+"\n"); //in Array this is length
		
		
		System.out.println("^^^^^^^^^^^^^ Printing single index value ^^^^^^^^^^^^^^^^ ");
		System.out.println("Single index value: " + ar.get(0)); // output: 
		System.out.println("Single index value: " + ar.get(1)); // output: 
		System.out.println("Single index value: " + ar.get(2)); // output: 
		System.out.println("Single index value: " + ar.get(5)); // output: 
		System.out.println("Single index value: " + ar.get(9)); // output: 
		System.out.println("Single index value: " + ar.get(10)); // output: //what will happen if you wanna put 11 after remove of 1 index?
		
		System.out.println("Single index value: " + ar.get(ar.size()-2)); // output: 
		
		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of ArrayList ^^^^^^^^^^^^^^^^ ");
		// to print all elements (for loop, for each loop, iterator()
				for (int i = 0; i < ar.size(); i++) {
					System.out.println(ar.get(i));
				}
				
				
		/*
		 now ar[] index is 16 capacity when we need to add for 10th index it jvm will
		 create new array with capacity 16 elements of the prev. array will be shifted
		 to new array & old array will be ready for garbage collection
		 */


		

        
        //generic comes in java 1.5 -> by defining the type
        ArrayList<String> ar1= new ArrayList();
        ar1.add("Monir");
        
        //user-defined class obj--see the StudyGroup Class
        //Creating obj of the StudyGroup Class by parameterized constructor and passing value:
        StudyGroup s1=new StudyGroup("Muhammad",50,"Tofayel");
        StudyGroup s2=new StudyGroup("Muhammad",40,"Sharif");
        StudyGroup s3=new StudyGroup("Muhammad",30,"Sohag");
        StudyGroup s4=new StudyGroup("Muhammad",30,"Sohag");
        //now we can put the obj of the StudyGroup type obj (s1,s2,s3,s4))
        ArrayList<StudyGroup> ar3=new ArrayList<StudyGroup>();
        ar3.add(s1);
        ar3.add(s2);
        ar3.add(s3);
 
        //print by using for each loop/enhanced for loop/advanced for loop
       for(StudyGroup s :ar3) {
        	System.out.println(s.fname+ " "+s.lname+" "+s.age); 
        	}
        
        //using->addAll()
        ArrayList ar5=new ArrayList(); //creaing new ArrayList
        ar5.add("A");
        ar5.add("B");
        ar5.add("C");
        
        //applied addAll() in ar[]-->now in ar[] we have also ar5[] value too
        ar.addAll(ar5);
        System.out.println("After using addAll method: "+ar);
       //before loop, legacy type
        Iterator ar7= ar.iterator();
        while(ar7.hasNext()) {
        	System.out.println(ar7.next());
        }
        
        
        
/*    //removeAll():
          ar.removeAll(ar5);
          Iterator ar8= ar.iterator();
          while(ar7.hasNext()) {
          System.out.println(ar7.next());*/
        
        
        //retainAll()--only keeps common value between two ArrayList obj
        
        	ArrayList<String> ar9=new ArrayList(); //creating new ArrayList
        	ar9.add("Sohag"); //-------this is common
        	ar9.add("Rahman");
        	ar9.add("salma");
        	//apply retainAll():
        	ar.retainAll(ar9);
        	//ar9.retainAll(ar); //we can also do 
        	for(int i=0;i<ar.size();i++) {
        		System.out.println("After using retainAll: "+ar.get(i));
        	}
        	}
	}
