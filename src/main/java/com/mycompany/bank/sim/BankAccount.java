/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bank.sim;

/**
 *
 * @author Alexandru
 */
public class BankAccount {
    private String owner;
    private int balance;
    
    public BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }
    
    public String getOwner(){
        return owner;
    }
    
    public int getBalance(){
        return balance;
    }
}
