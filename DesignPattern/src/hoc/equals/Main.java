/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoc.equals;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        Animal tom = new Animal();
        tom.setName("Tom");
        tom.setAge(3);
        tom.setWeight(5);
        
        Animal jerry = new Animal();
        jerry.setName("Tom");
        jerry.setAge(3);
        jerry.setWeight(5);
        
//        System.out.println(tom.equals(jerry));
        System.out.println(tom);
        
//        Object o = null;
//        Objects.equals(o, null);

//        Animal s = new Student();
//        Animal tom = new Cat();
//        Object obj = new Student();
//        
//        if(tom instanceof Student) {
//            Student student = (Student)tom;
//        }
        
    }
}