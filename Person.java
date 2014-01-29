/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class Person {
    
    public String getInitials(String fullName) { 
        String result = "";
        String[] words = fullName.split(" "); 
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() !=0){   
        String nextInitial = "" + words[i].charAt(0);
        result = result + nextInitial.toUpperCase(); 
        
        }}
      return result;
     }
    }
