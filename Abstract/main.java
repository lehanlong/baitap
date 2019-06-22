package Abstract;

public class main {

	public static void main(String[] args) {
		movingobject ball = new movingball();
		ball.Move(1);
		ball.Draw();
		movingobject hero = new movinghero(2,5);
		hero.Move(3);
		hero.Draw();
	}

}
