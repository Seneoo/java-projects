package Esercizi;
class Main
{
	public static void main(String args[])
	{
		quadrilatero q=new quadrilatero(1,2,3,4);
		rettangolo r=new rettangolo(5,6,"rosso");
		quadrato qq=new quadrato(7,"verde");
		trapezio t=new trapezio(8,9,10,11,12);
		System.out.println("Il perimetro del quadrilatero è: "+q.perimetro());
		System.out.println("Il perimetro del rettangolo: "+r.perimetro());
		System.out.println("Il colore del rettangolo: "+r.getcolore());
		System.out.println("Il perimetro del quadrato: "+qq.perimetro());
		System.out.println("Il colore del quadrato: "+qq.getcolore());
		System.out.println("Il perimetro del trapezio: "+t.perimetro());
		System.out.println("Area del rettangolo: "+r.area());
		System.out.println("Area del quadrato: "+qq.area());
		System.out.println("Area del trapezio: "+t.area());
	}
}