package AreaDelCerchioPublic;
class Cerchio
{
	//attributo
	public double raggio;
	//metodo1
	public void setRaggio(double r)
	{
		raggio=r;
	}
	//metodo 2
	public double area()
	{
		return (raggio*raggio*Math.PI);
	}
}
