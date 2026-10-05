package AreaDelCerchio;
class ProgCerchio
{
	public static void main(String[] args)
	{
		//dichiarazione dell'oggetto
		Cerchio tavolo;
		//creazione dell'istanza
		tavolo=new Cerchio();
		tavolo.setRaggio(0.75);
		System.out.println("Area del tavolo ="+tavolo.area());
		Cerchio cer1,cer2;
		cer1=new Cerchio();
		cer2=new Cerchio();
		cer1.setRaggio(3);
		cer2.setRaggio(10);
		System.out.println("Area del cerchio 1:"+cer1.area());
		System.out.println("Area del cerchio 2:"+cer2.area());
	}
}