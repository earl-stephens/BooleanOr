package application;

public class App {

	public static void main(String[] args) {
		
		boolean isRaining = false;
		boolean mightRain = true;
		boolean takeUmbrella = false;
		
		/*
		if(isRaining || mightRain) {
			takeUmbrella = true;
		}
		*/
		
		//can set a boolean this way as well:
		takeUmbrella = isRaining || mightRain;
		System.out.println(takeUmbrella);

	}

}
