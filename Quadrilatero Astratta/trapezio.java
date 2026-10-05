package Esercizi;
class trapezio extends quadrilatero
{
	protected double altezza;
	public trapezio(double l1, double l2, double l3, double l4, double altezza)
	{
		super(l1,l2,l3,l4);
		this.altezza=altezza;
	}
	public double area()
	{
		return (l1+l2)*altezza/2;
	}
}