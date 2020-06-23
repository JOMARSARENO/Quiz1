/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg1;
import quiz.pkg1.Person;


/**
 *
 * @author Oneras
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person jomarSareno = new Person("jomar","sareno","matina");
        jomarSareno.printFirstname();
        jomarSareno.printLastname();
        jomarSareno.printAddress();
        jomarSareno.printFullname();
        
    }
    
}
