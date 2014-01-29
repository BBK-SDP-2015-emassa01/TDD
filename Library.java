/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Esha
 */
public class Library {
    
    protected static int count=0;
    
    public static String USERNAME;
    public static int libraryUserID;
    
    public static int MAX_BOOKS_BORROWED = 3;
    
    public static final String LIBRARYNAME = "Birkbeck";
    
    ArrayList<String> userList = new ArrayList<String>();
    
   
    public Library(String x){
        USERNAME = x;
        userList.add(x);
        count++;       
    }
    
    public String getUserName(){
        return this.USERNAME;
    }
    
    public int getLibraryID(){
        return this.libraryUserID;
    }
    
    public int setLibraryID(){
        libraryUserID = this.count;
        return libraryUserID;
    }
    
    public int getMaxBooks(){
        return this.MAX_BOOKS_BORROWED;
    }
        
    public int getID(String user){
        for (int i = 0; i<userList.size(); i++){
            if (userList.get(i).equals(user))
                return i;
        }   Library newUser = new Library(user);
            int ID = newUser.getLibraryID();
            return ID;
            }
        }
    

