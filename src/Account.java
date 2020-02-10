// 2020/2/10 Bruce  This program will describe a checking account for a customer of a bank.

public class Account {
    private String first;
    private String last;
    private int acctNum;
    private double balance;

    public Account (String first,String last,double balance) {
        this.first = first;
        this.last = last;
        this.balance = balance;
        acctNum = (int) (Math.random() * 999 + 1);
    }

    public Account(Account recall){
        this(recall.first,recall.last,recall.balance);
    }
    public Account(){
        this.first = "";
        this.last = "";
        this.balance = 0;
        acctNum = (int)(Math.random() * 999 + 1);
    }

    public void setFirst(String first){
        this.first = first;
    }
    public void setLast(String last){
        this.last = last;
    }
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public int getAcctNum(){
        return acctNum;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double num){
        balance += num;
    }

    public boolean withdrawal(double num){
        if(balance - num >= 0) {
            balance -= num;
            return true;
        }
        else
            return false;
    }

    public String toString(){
        return "Customer Name: " + first + " " + last + "\n" + "Account #: " + acctNum + "\n" + "Current Balance: $" + balance;
    }
}