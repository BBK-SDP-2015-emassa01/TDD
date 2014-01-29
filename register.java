/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class register extends Library{
    
    public register(String name){ 
    super(name);
    }
    
        public int register(Library x){
        int registeredLibrary = x.libraryUserID;
        return registeredLibrary;
        }
        
        public String getLibrary(){
            Library instance = new Library("test");
            return instance.LIBRARYNAME;
        }
    
}
