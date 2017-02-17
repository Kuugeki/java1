/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

/**
 *
 * @author ryuujin
 */
public class HelloTest {
    public static class Item {
        public int a;
        public Item() {
            a = 10;
        }
        
        public Item(int a) {
            this.a = a;
        }
    }
    
    public static void opOn(Item a) {
        a.a *= 10;
    }
    
    public static void opNew(Item a) {
        a = new Item(3);
    }
    
    public static void main(String[] args) {
        Item i = new Item(10);
        
        opOn(i);
        System.out.println(i.a);
        
        opNew(i);
        System.out.println(i.a);
        
    }
    
    
}
