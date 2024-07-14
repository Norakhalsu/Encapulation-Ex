
public class Account {

    private String id ;
    private String name;
    private  int balance=0;

    // constructer 1
     public Account (String id , String name){
        this.id=id;
        this.name=name;
    }

    // constructer 2
    public Account (String id ,String name , int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
     // construct 3
    public Account(){
    }

    // set and get methods
    public void setId(String id){
      this.id=id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getId() {
         return id;
    }
    public String getName(){
         return name;
    }
    public int getBalance() {
         return balance;
    }




   // Class Methods
  public int credit(int amount){
     this.balance +=amount;
      return amount;
  }


  public int debit(int amount){
         if (this.balance < amount){
             System.out.println(" Cannot debit");
         }else
        this.balance-=amount;
       return amount;
  }

   public int transferTo(Account another, int amount){
         this.debit(amount);
         another.credit(amount);
      return amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}


