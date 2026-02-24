class Account{

  //Instance or global variables 

  public String name;
  public String surname;
  public double balance;

  public Account(String name, String surname, double balance){

    this.name = name;
    this.surname = surname;
    this.balance = balance;
  
  }

//Set Methods
  public String setName(String name) {
    this.name = name;
      return name;
  }

public String setSurname(String surname){
  this.surname = surname;
    return surname;
}
public double deposit(double amount){
  if(amount > 0)
    this.balance += amount;
    return amount;

}
//Get Method
public String getName(){
  return this.name;
  }
public String getSurname(){
  return this.surname;
    }
  public double getBalance(){
   return this.balance;
  }

}










