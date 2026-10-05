package VolumeCilindro;
class Cerchio
{
	public Cerchio(double raggio) 
	{
	    this.raggio = raggio;
	}
	private double raggio;
	public void setRaggio(double r)
	{
		raggio=r;
	}
	public double area()
	{
		return (raggio*raggio*Math.PI);
	}
}