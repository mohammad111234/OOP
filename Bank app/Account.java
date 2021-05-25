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
public class Account {
    
    private String name;
    private String surname;
    private String email;
    private int balance;
    private int accounNo;
    private int tel;

    public Account(String name, String surname, String email,int balance, int accounNo, int tel) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.accounNo = accounNo;
        this.tel = tel;
        this.balance = balance;
    }
    
    public Account(){
    
    
    }
    
    public void putMoney(int money){
    
    balance = balance+money;
        System.out.println("your new balance is: "+balance);
    }
    public void takeMoney(int money){
    balance = balance - money;
        System.out.println("your balance is: "+balance);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccounNo() {
        return accounNo;
    }

    public void setAccounNo(int accounNo) {
        this.accounNo = accounNo;
    }

    public int getTel() {
       return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    
    
}
