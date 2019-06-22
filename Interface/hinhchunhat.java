package Interface;

public class hinhchunhat implements hinh {
	public double chieudai, chieurong;
	public hinhchunhat(double d,double r)
	  {
	      this.chieudai = d;
	      this.chieurong = r;
	  }
	  public double cv()
	    {
	        return chieudai*chieurong;
	    }
	    public double dt()
	    {
	        return 2*(chieudai+chieurong);
	    }
	    public void print() {
	    	System.out.println("Chu vi hình chữ nhật là: " + cv());
	    	System.out.println("Diện tích hình chữ nhật là: " + dt());
	    }
	    
}
