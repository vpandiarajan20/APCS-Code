package com.company;

public class BankAccount {
    // Class (static) variables
    static int numberOfTransactions=0;
    static int numberOfBankAccounts=0;
    // Instance (nonstatic) variables
    String firstName, lastName, middleInitial; // Mid initial no period
    String name = firstName + " " + middleInitial + ". " + lastName;
    Money balance;
    String bankName;
    //Getters/Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public Money getBalance() {
        return balance;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public void deposit(Money depositAmount){
        Money newMoney = new Money(0,0);
        newMoney.add(depositAmount);
        newMoney.add(getBalance());
        setBalance(newMoney);
        numberOfTransactions++;
    } //Increment the number of transactions
    public void withdraw(Money withdrawAmount){
        Money newMoney = new Money(0,0);
        newMoney.add(getBalance());
        newMoney.sub(withdrawAmount);
        setBalance(newMoney);
        numberOfTransactions++;
    } //Increment the number of transactions
    // Constructors
    public BankAccount(){}
    public BankAccount(String first, String last, String middle, Money b, String bName){
        setFirstName(first);
        setLastName(last);
        setMiddleInitial(middle);
        setBankName(bName);
        setBalance(b);
    }
    public BankAccount(String name, Money b, String bName){
        setBankName(bName);
        setName(name);
        setBalance(b);
    } // name = "Al C. Kim" "Stephanie Shoa"
    // Other Functions
    public String toStr(){
        return bankName + " " + "bank account for" + name + ": $" + balance.dollars + " " + balance.cents;
    }
    // "Bank of America bank account for Al C. Kim: $10.02"
    public String fullName(){
        return name;
    }
    // returns first, mid, last. Ex, "Al C. Kim" (don't forget the period)


}
