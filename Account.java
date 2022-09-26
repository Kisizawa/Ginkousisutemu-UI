
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class Account {
	static Map<Integer,String> account=new HashMap<Integer,String>();
	static Map<String,Integer> account2=new HashMap<String,Integer>();
	
	static AccountNumber Num=new AccountNumber();
	
	public void Start() {
		
	}
	//アカウント番号+アカウント名
	public static void AccountArray() {
		Map<Integer,String> account=new HashMap<Integer,String>();
		account.put(AccountNumber.getAccountNum(), AccountName.getName());
	}
	public static String AccountArrayName(int a) {
		return account.get(a);
		
	}
	
	
	//アカウント名+アカウントの預金
	public static void AccountMonyeArray() {
		Map<String,Integer> account2=new HashMap<String,Integer>();
		account2.put(AccountName.getName(), AccountMoney.getMoney());
		
	}
	public static int AccountArrayMoney(String string) {
		return account2.get(string);
		
	}
	
	
	public static int next(int a) {
		// TODO 自動生成されたメソッド・スタブ
		if(a==1) {
			try {
				Num.next(a);
			} catch (Exception e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
		}
		if(a==2) {
			System.out.println("アカウント番号を入力してください");
			int Number=new java.util.Scanner(System.in).nextInt();
			int mon=AccountArrayMoney(AccountArrayName(Number));
			System.out.println("あなたの預金は"+mon);
			
		}
		if(a==3) {
			
		}
		if(a==4) {
			
		}
		
		
		return 0;
	}

	
	

}
