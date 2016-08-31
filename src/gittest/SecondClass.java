/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittest;

/**
 *
 * @author 873636
 */
public class SecondClass {

    
    
    SecondClass(int i, String s){
        setI(i);
        setS(s);
        //adding comment
    }
    
    public void output(){
        System.out.println(getI());
        System.out.println(getS());
    }
    
    
    
    private int i;
    private String s;

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    private void setI(int i) {
        this.i = i;
    }

    /**
     * @return the s
     */
    public String getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    private void setS(String s) {
        this.s = s;
    }
    
}
