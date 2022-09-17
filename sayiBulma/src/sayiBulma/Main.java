package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int [] sayilar = {1,2,5,7,9,0};
		int aranacak = 9;
		String durum = "Malesef bulamadınız.";
		
		for(int ara : sayilar) {
			
			if(ara == aranacak) {
				durum = "Buldunuz.";
			}
			
		}
		System.out.println(durum);

	}

}
