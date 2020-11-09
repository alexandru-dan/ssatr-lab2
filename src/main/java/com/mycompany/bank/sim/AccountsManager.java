/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bank.sim;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Alexandru
 */
public class AccountsManager {
    
    BankAccount[] list;
    
    public AccountsManager(){
        this.list= new BankAccount[10];
    }
    
    void addAccount(BankAccount b){
        for (int i = 0 ; i < this.list.length; i++ ){
            if (this.list[i] == null) {
                this.list[i] = b;
                System.out.println("New account added.");
                return;
            }
        }
        System.out.println("No empty position found");
    }
    
    String getTotalBalance(){
        int total=0;
        for (BankAccount bc : this.list){
            if(bc!=null){
                total+= bc.getBalance();
            }
        }
        return "Total is: " + total + ".";
    }
    
    String getAllAccounts(){
        String all = "";
        int i = 1;
        for (BankAccount bc: this.list){
            if (bc!=null){
                     
                   String line = "Account nr. " + i + " with Owner " + bc.getOwner() + " has " + bc.getBalance() + " in the balance." + "\n";
                    i+=1;
                    all+=line;
                }
        }
        return all;
    }
    
    BankAccount getUser(String name){
        for(BankAccount bc : this.list){
            if(bc!=null && bc.getOwner().equals(name)){
                return bc;
            }
        }
        return null;
    }
    
    boolean transfer(String sender, String receiver, int amount){
        BankAccount from = getUser(sender);
        BankAccount to = getUser(receiver);
        if(from !=null && to !=null){
        if((from.getBalance()-amount)<0){
            return false;
        } else {
            from.setBalance(from.getBalance()-amount);
            to.setBalance(to.getBalance()+amount);
        return true;
            } 
        }
        return false;   
    }
}
