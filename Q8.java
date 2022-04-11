public class Q8 {

   public static void main(String args[]) 
   {
      Circle encap = new Circle();
      encap.setRadius(5);
      encap.setArea(5);

      System.out.print("Radius : " + encap.getRadius() + " Area : " + encap.getArea());
   }
}

class Circle 
{
	private double radius;
	private double area;
	
	public void setRadius(int rad)
	{
		radius = rad;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setArea(int rad)
	{
		float pi = 3.14f;
		area = 2*pi*rad;
	}
	
	public double getArea()
	{
		return area;
	}
}