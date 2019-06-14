package ham;
public class vd3 {

	public static int findMax(int a, int b) {
		int max;
		if(a>b)
		{
			max = a;
		}
		else
		{
			max = b;
		}
		System.out.println("Số lớn nhất là: " +max);
		return max;
		
	}
		public static void main(String[] args) {
			findMax(1,2);
			findMax(2,4);
	}
}
