package Esercizi;
class rettangolo extends quadrilatero
{
	protected String colore;
	public rettangolo(double l1, double l2, String colore)
	{
		super(l1,l2,l1,l2);
		this.colore=colore;
	}
	public void setcolore(String colore)
	{
		this.colore=colore;
	}
	public String getcolore()
	{
		return colore;
	}
	public double area()
	{
		return l1*l2;
	}
}