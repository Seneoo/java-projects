package AreaDelCerchioPublic;
class ProgCerchio
{
	public static void main(String[] args)
	{
		//dichiarazione dell'oggetto
		Cerchio tavolo;
		//creazione dell'istanza
		tavolo=new Cerchio();
		tavolo.raggio=0.75;
		System.out.println("Area del tavolo ="+tavolo.area());
		Cerchio cer1,cer2;
		cer1=new Cerchio();
		cer2=new Cerchio();
		cer1.raggio=3.0;
		cer2.raggio=10.0;
		System.out.println("Area del cerchio 1:"+cer1.area());
		System.out.println("Area del cerchio 2:"+cer2.area());
	}
}
