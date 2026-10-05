package Esercizio;
class automobile
{
	private String targa,marca,modello,colore;
	public String getTarga() {
		return targa;
	}
	private int anno;
	public automobile(String targa, String marca, String modello, String colore, int anno) {
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.colore = colore;
		this.anno = anno;
	}
	void stampa()
	{
		System.out.println("------------------------");
		System.out.println("Targa: "+targa);
		System.out.println("Marca: "+marca);
		System.out.println("Modello: "+modello);
		System.out.println("Colore: "+colore);
		System.out.println("Anno: "+anno);
		System.out.println("------------------------");
	}
	void remove(String targa)
	{
		for(int i=0;i<10;i++)
		{
			if(this.targa.equals(targa))
			{
				this.targa=null;
				this.marca=null;
				this.modello=null;
				this.colore=null;
				this.anno=0;
			}
		}
	}
}