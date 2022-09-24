public class Main {

	public static void main(String[] args) {
		UI ui=new UI();
		ui.Start();
		int nyuuryoku =new java.util.Scanner(System.in).nextInt();
		while(!(nyuuryoku>=1&&nyuuryoku<=4)){
			ui.Start();
			nyuuryoku =new java.util.Scanner(System.in).nextInt();
			
		}
		ui.selectaNum(nyuuryoku);

	}
