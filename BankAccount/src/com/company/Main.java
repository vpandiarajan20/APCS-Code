package com.company;

public class Main {

    public static void main(String[] args){
        //Task 1
        BankAccount Vignesh = new BankAccount();
        BankAccount Kim = new BankAccount();
        BankAccount John = new BankAccount();
        //Task 2
        BankAccount[] People = new BankAccount[3];
        People[0] = Vignesh;
        People[1] = Kim;
        People[2] = John;
        for(int i = 0; i<100; i++){
            Money counter = new Money(i+1,0);
            People[(i%3)].deposit(counter);
        }
        //Task 3
        Vignesh.withdraw(new Money(20,0));
        Kim.deposit(new Money(10,0));
        John.deposit(new Money(10,0));
        //Task 4
        BankAccount[] ramakrishnans = new BankAccount[26];
        String alphabet[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for(int i=0; i<26; i++){
            ramakrishnans[i] = new BankAccount("Bob",alphabet[i],"Ramakrishnan",new Money(10,0),"BOA");
            if(i == 23)
                ramakrishnans[i].deposit(new Money(100,0));
        }
    }
}
