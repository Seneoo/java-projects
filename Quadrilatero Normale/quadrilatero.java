package Esercizi;
class quadrilatero
{
	protected double l1,l2,l3,l4;
	public quadrilatero(double l1, double l2, double l3, double l4)
	{
		this.l1=l1;
		this.l2=l2;
		this.l3=l3;
		this.l4=l4;
	}
	public double perimetro()
	{
		return l1+l2+l3+l4;
	}
	public double area()
	{
		return 0;
	}
}