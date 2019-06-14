package ham;

import java.util.Random;

public class vd4 {

	public static float getRandomNumber() {
		float result;
		Random r = new Random();
		result = r.nextFloat();
		System.out.println("Số vừa được sinh ra là: "+ result);
		return result;
	}
	public static void main(String[] agrs) {
		float x;
		x = getRandomNumber();
	}

}
