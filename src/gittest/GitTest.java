/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittest;
import com.google.gson.Gson;

/**
 *
 * @author 873636
 */
public class GitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Testing");
        newDevelopmentMehtod();
        hotfixMethod();
        SecondClass secondClass = new SecondClass(1, "test");
        secondClass.output();
        
    }
    
    
    public static void hotfixMethod(){
        System.out.println("hotfix method");
    }
    
    public static void newDevelopmentMehtod(){
        System.out.println("new dev method");
    }
    
}
