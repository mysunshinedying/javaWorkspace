package ch06.sec02;

public class Savings {
    private String name;
    private int deposit;
    private int interest;
    private int balance;

    public void setName(String nameInput){
        name = nameInput;
    }

    public void setBalance(int balanceInput){
        balance = balanceInput;
    }

    public String getName(){
        return name;
    }

    public void inputDeposit(int depositInput){
        deposit = depositInput;
        balance += deposit;
    }

    public int getInterest() {
        interest = (int)(balance * 0.1);
        balance += interest;
        return interest;
    }

    public int getBalance() {
        return balance;
    }

}
