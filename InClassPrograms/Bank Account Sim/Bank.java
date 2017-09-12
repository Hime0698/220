class BankAccount
{
  private double amount;
  private String holder;

  public BankAccount()
  {
    amount = 0;
    holder = "N/A";
  }

  public BankAccount(String holder, double a)
  {
    this.holder = holder; // this forces to refer to the variable in the object
    if (a > 0)
      {
        amount = a;
      }

    else
    {
      amount = 0;
    }

  }

  public void IncreaseAmount(double a)
  {
    if (a >= 0)
    {
      amount += a;
    }

    else
      {
        System.out.println("Cannot increase by a negative ammount.");

      }
  }

  public void DecreaseAmount(double a)
  {
    if (a >= 0 && a <= amount)
    {
      amount -= a;
    }

    else if (a > amount)
    {
      amount = 0;
      System.out.println("Puhliz.. you are not that rich");
    }

    else
    {
      IncreaseAmount(-a);
    }
  }

  public String toString()
  {
    return "Account Holder: "  + holder + " Amount = $" + String.format("%.2f", amount);
  }
}

class Bank
{
  public static void main(String [] args)
  {
    int x = 9;
    BankAccount john = new BankAccount("john", 0);
    System.out.println(john);
    john.IncreaseAmount(45);
    System.out.println(john);
    john.DecreaseAmount(12);
    System.out.println(john);
    john.DecreaseAmount(100);
    System.out.println(john);
    john.IncreaseAmount(1000);
    System.out.println(john);

    BankAccount doe = new BankAccount("doe", 80.0);
    System.out.println(doe);

  }
}
