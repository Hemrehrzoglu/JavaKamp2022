package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {

		String[][] bölge = new String[3][4];

		bölge[0][0] = "Sakarya";
		bölge[0][1] = "İstanbul";
		bölge[0][2] = "Gebze";
		bölge[0][3] = "Düzce";
		bölge[1][0] = "Trabzon";
		bölge[1][1] = "Rize";
		bölge[1][2] = "Tokat";
		bölge[1][3] = "Sinop";
		bölge[2][0] = "Diyarbakır";
		bölge[2][1] = "Gaziantep";
		bölge[2][2] = "Elazığ";
		bölge[2][3] = "Urfa";

		int a = 1;

		for (int i = 0; i < 3; i++) {
			System.out.println("-------------------------------------------------");
			System.out.println(a + ". bölge");
			a++;
			for (int j = 0; j < 4; j++) {
				System.out.println(bölge[i][j]);

			}

		}

	}

}
