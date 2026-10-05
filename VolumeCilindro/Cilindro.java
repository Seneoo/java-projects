package VolumeCilindro;
class Cilindro extends Cerchio
{
	private double altezza;
	public Cilindro (double raggio,double altezza)
	{
		super(raggio);
		this.altezza=altezza;
	}
	public void setAltezza(double altezza)
	{
		this.altezza=altezza;
	}
	public double volume()
	{
		double vol=area()*altezza;
		return vol;
	}
}