package com.assignment.arrays;

public class VowelsAndConsonantTogether {
		    
	
      static void putVowelConsonantTogether(char [] carr,  int len) {
    	  
    	  char [] temp = new char[len];
    	  int size=0;
    	  
    	  for(int i = 0; i < len; i ++) {
    		  if(Character.toLowerCase(carr[i])=='a' 
			  || Character.toLowerCase(carr[i])=='e' 
			  || Character.toLowerCase(carr[i])=='i' 
			  || Character.toLowerCase(carr[i])=='o' 
			  || Character.toLowerCase(carr[i])=='u')
    		  {
				  temp[size]= carr[i];
    					  size++;
    			}
    		  
    	  }
    	  
    	  for(int i=1; i<len-1; i++){
              if(Character.toLowerCase(carr[i]) != 'a' 
          	|| Character.toLowerCase(carr[i]) != 'e'
          	|| Character.toLowerCase(carr[i]) != 'i' 
          	|| Character.toLowerCase(carr[i]) != 'o' 
          	|| Character.toLowerCase(carr[i]) != 'u')
           {
              if(size != len){
              temp[size]=carr[i];
              
              size++;
              }
            }
    	  }
              System.out.println("Original Array:"); 
 	         for (char c:carr) {  
 	        System.out.println(c); }
 	         System.out.println("New Array:"); 
 	         for (char c:temp) {  
 	        System.out.println(c);
 	         }
 	      
 	    }
    	  
    	  public static void main(String[] args)
  	    {
  	        
  	        char[] carr = {'a', 'b', 'c', 'd','g', 'e'}; 
  	        int len= carr.length;
  	      putVowelConsonantTogether(carr,len);
  	        
  	       
  	    }
          
      }
    	  
      
	
	
	
	
	
	
	

