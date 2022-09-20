package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler=new String[3][3];
		
		sehirler[0][0]="istanbul";
		sehirler[0][1]="amasya";
		sehirler[0][2]="urfa";
		sehirler[1][0]="gaziantep";
		sehirler[1][1]="merzifon";
		sehirler[1][2]="nigde";
		sehirler[2][0]="tokat";
		sehirler[2][1]="sakarya";
		sehirler[2][2]="ankara";
		
		
		for(int i=0;i<3;i++) {
			System.out.println("----------------");
			
			for(int j=0;j<3;j++) {
				System.out.println(sehirler[i][j]);
			}
		}

	}

}
