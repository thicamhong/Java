
public class Point
{

	public int x;
	public int y;
	
	
	public void display()
	{
		System.out.println("\nx="+x);
		System.out.println("\ny="+y);
	}
	
	
	public void move(int newX, int newY)
	{
		x = newX; 
		y = newY;
	}
	
	
	public int getX()
	{
		return x;
	}
	
	
	public int getY()
	{
		return y;
	}
	
	
	
}

