package Interface;

public class hinhvuong implements hinh {
	public double canh;
	public hinhvuong(double c)
	  {
	      this.canh = c;
	  }
	  public double cv()
	    {
	        return canh*4;
	    }
	    public double dt()
	    {
	        return canh*canh;
	    }
	    public void print() {
	    	System.out.println("Chu vi hình chữ nhật là: " + cv());
	    	System.out.println("Diện tích hình chữ nhật là: " + dt());
	    }
}
