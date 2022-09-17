package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		boolean isPrime = true;

		
		int number = 1;
		
		if(number == 1) {
			isPrime =false ;
			
			
		}else if(number == 2) {
			
			isPrime=true;
		}else {
			for (int i = 2; i <number; i++) {
				
				if(number%i==0) {
					isPrime = false;
				}
				
		}
		
			
		}//else parantezi
		
		if(isPrime) {
			System.out.println("Sayı asaldır");
		}else {
			System.out.println("Sayı asal değildir");
		}

		
	}

}
