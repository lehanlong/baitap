package lop;

public class Rectangle {
	
	private float w,h;
	public Rectangle()
	{
		w = 0.0f;
		h = 0.0f;
	}
	public void setEdges(float W, float H)
	{
		w = W;
		h = H;
	}
	public float chuvi()
	{
		
		return (w+h)/2;
	}
	public float dientich()
	{
		
		return w*h;
	}

	public static void main(String[] args) {
		Rectangle r;
		r = new Rectangle();
		r.setEdges(10.0f, 20.0f);
		float cv = r.chuvi();
		float dt = r.dientich();
		System.out.println("Chu vi hình chữ nhật là: " + cv);
		System.out.println("Diện tích hình chữ nhật là: " + dt);
	}

}
