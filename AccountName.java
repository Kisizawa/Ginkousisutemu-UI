public class AccountName extends Account{

	static String name;

	public AccountName(String name) {
		
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		AccountName.name = name;
		System.out.println("あなたの名前は"+name+"アカウント番号は"+AccountNumber.getAccountNum());
	}
	
	
	

}
