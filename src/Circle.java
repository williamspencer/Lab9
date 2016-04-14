import java.text.DecimalFormat;

public class Circle {
	
	private double radius;
	private static DecimalFormat df2 = new DecimalFormat(".##");
	
	public Circle(double r){
		radius = r;
	}
	
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	
	
	public double getCircumference()
	{
		 return (2 * Math.PI * radius);
		 
	}
	
	private String formatNumber(double x)
	{
		return df2.format(x);
		
	}
	
	public String getFormattedCircumference()
	{
		return formatNumber(getCircumference());
	}
	
	public String getFormattedArea()
	{
		return formatNumber(getArea());
	}
}

