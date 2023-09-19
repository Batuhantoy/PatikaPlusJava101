import java.util.Arrays;
import java.util.stream.Stream;

public class MatrixTranspose {

	public MatrixTranspose() {
		
		int[][] matris = new int[2][3];
		matris[0]= new int[]{2,3,4};
		matris[1]= new int[]{5,6,4};
		
		int[][] transpose = new int[3][2]; 	
		
		for(int i=0;i<transpose.length;i++) {
			for(int j=0; j<transpose[i].length; j++) {
				transpose[i][j]=matris[j][i];
			}
		}
		
		
		Stream.of(transpose).map(Arrays::toString).forEach(System.out::println);
	}

}
