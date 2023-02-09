package first.workshop;


import java.util.List;

public class MainImperativo {
	public static void main(String[] args) {
		
		// First WorkShop
		
		List<Integer> numbers= List.of(18,6,4,15,55,78,12,9,8);

		int count=0;
		for (int numero:numbers) {
			if(numero>10) {
				count++;
			}
		}
		System.out.println(count);
		
		
}
}
