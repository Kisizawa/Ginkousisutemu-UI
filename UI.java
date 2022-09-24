
public class UI {

	public static void Start() {
		System.out.println("what do?");
		System.out.println("1.アカウントの作成\n2.預金の確認\n3.預入\n4.引き出し");
		
	}
	public static int selectaNum(int a) {
		if(a==1) {
			System.out.println("アカウントを作成します");
			Account.next(1);
		}else if(a==2) {
			System.out.println("預金の確認をします");
			
		}else if(a==3) {
			System.out.println("預金の預け入れをします");
		}else if(a==4) {
			System.out.println("預金の引き出しをします");
		}else {
			Start();
			
		}
		
		return a;
	}
}
