public class bank 
{
	private ChekingAccount accountOne;
	private ChekingAccount accountTwo;
	
	public bank()
	{
		accountOne = new ChekingAccount("Zeus", 100);
		accountTwo = new ChekingAccount("Hades", 100);
	}
	public static void main(String[] args)
	{
		bank BankOfGods = new bank();
		System.out.println(BankOfGods.accountTwo.name);
		System.out.println(BankOfGods.accountTwo.balance);
	}
}
