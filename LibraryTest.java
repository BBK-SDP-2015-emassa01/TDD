/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Esha
 */
public class LibraryTest {
    
    @Test
    public void testGetUserName(){
        Library instance = new Library("userName");
        String actualTitle = "userName";
        String expectedTitle = instance.getUserName();
        assertEquals(expectedTitle, actualTitle);    
    }
    
    @Test
    public void testSetLibraryID(){
        Library instance = new Library("test");
        int actualLibraryID = instance.setLibraryID();
        int expectedLibraryID = 3;
        assertEquals(expectedLibraryID, actualLibraryID);
    }
    
    @Test
    public void testGetLibraryID(){
        Library instance = new Library("test");
        int actualLibraryID = instance.getLibraryID();
        int expectedLibraryID = 0;
        assertEquals(expectedLibraryID, actualLibraryID);
    }
    
    
    
    
}
