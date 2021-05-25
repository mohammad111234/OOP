/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_application;

/**
 *
 * @author Mohammad
 */
public class Bank_application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Account acc = new Account();
      acc.setAccounNo(1);
      acc.setBalance(4000);
      acc.setEmail("mohammad@gmail.com");
      acc.setName("mohammad");
      acc.setSurname("matpoly");
      acc.setTel(01055);
      
      acc.putMoney(10);
      acc.takeMoney(500);
      
      
      
      
    }
    
}
