package Exception_Handling;
class Manju extends Exception
{
	public Manju(String msg)
	{
		super(msg);
	}
	public static void check() throws Manju
	{
		throw new Manju("Manju");
	}
}
public class CustomisedExcepiton {

	public static void main(String[] args) {
		try {
			Manju.check();
		} catch (Manju e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
