/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg1;

/**
 *
 * @author Oneras
 */
public class Person { 
    String firstname;
    String lastname;
    String address;
    
    public Person(String firstname, String lastname, String address){ 
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }
    
    public void printFirstname(){
        System.out.println(this.firstname);
    }
        
    public void printLastname(){
        System.out.println(this.lastname);
    }
    
    public void printAddress(){
        System.out.println(this.address);
    
    }
    public void printFullname(){
        System.out.println(this.firstname + " " + this.lastname );
    }

 }
    

