package com.sravan;

import java.util.Optional;

public class OptionalTest {  
    public static void main(String[] args) {/*
       //Creating Optional object from a String
       Optional<String> GOT = Optional.empty();        
       //Optional.empty() creates an empty Optional object        
       Optional<String> nothing = Optional.of("ff");
        isPresent() method: Checks whether the given Optional         
        * Object is empty or not.         
                
       if (GOT.isPresent()) {          
          System.out.println("Watching Game of Thrones");       
       } 
       else {            
          System.out.println("I am getting Bored");      
       }
        ifPresent() method: It executes only if the given Optional         j
        * object is non-empty.         
                
       //This will print as the GOT is non-empty        
       GOT.ifPresent(s -> System.out.println("Watching GOT is fun!"));                
       //This will not print as the nothing is empty        
       nothing.ifPresent(s -> System.out.println("I prefer getting bored"));
 */
    	
    	//Creating Optional object from a String
        Optional<String> GOT = Optional.of("Game of Thrones");        
        //Optional.empty() creates an empty Optional object        
        Optional<String> nothing = Optional.empty();

        //orElse() method
        System.out.println(GOT.orElse("Default Value")); 
        System.out.println(nothing.orElse("Default Value")); 

        //orElseGet() method
        System.out.println(GOT.orElseGet(() -> "Default Value")); 
        System.out.println(nothing.orElseGet(() -> "Default Value")); 

    
    }
}