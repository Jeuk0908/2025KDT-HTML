package w2_4_encapsulation;

class BankAccount {
    //은행 잔고는 곱하거나 나누는 연산이 필요없고, 하면 안되는 대상.
    private double balance; //필드는 private 으로 선언

    public BankAccount(double balance) {
        this.balance = balance;
    }

    //값의 확인 기능은 공개
    public double getBalance() {
        return balance;
    }

    //값의 업데이트, 삭제 같은 수정은
    //정해진 방법으로만.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }
}