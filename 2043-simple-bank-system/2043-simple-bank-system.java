class Bank {
private final long[] balance;
    private boolean isValidAccount(int account) {
        return account >= 1 && account <= balance.length; 
    }
    public Bank(long[] balance) {
       this.balance = balance.clone();
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(!isValidAccount(account1) || !isValidAccount(account2)) return false;
        
        if(withdraw(account1,money)){
            return deposit(account2,money);
        }
        return false;
    }
    
    public boolean deposit(int account, long money) {
        if(isValidAccount(account)==false){return false;}
        else{
        balance[account-1] +=money;
        return true;
        }
    }
    
    public boolean withdraw(int account, long money) {
        if(isValidAccount(account)==false){return false;}
        if(balance[account-1]>=money){
        balance[account-1] -=money;
        return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */