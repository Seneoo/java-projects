package esercizio;
class MaxMin
{
	public static void main(String[] args)
	{
		System.out.println("Elenco parametri");
		if(args.length<2)
		{
			System.out.println("Non ci sono parametri sufficienti");
			return;
		}
		for(int i=0;i<args.length;i++)
		{
			System.out.println("Parametri:"+args[i]);
		}
		if(!args[0].equals("min")&&!args[0].equals("max"))
		{
			System.out.println("Parametri non accettati, utilizzare:max o min");
		}
		else
		{
			int min=Integer.parseInt(args[1]);
			int max=Integer.parseInt(args[1]);
			if(args[0].equals("max"))
			{
				System.out.println("MAX:"+max);
				for(int i=1;i<args.length;i++)
				{
					int valore=Integer.parseInt(args[i]);
					if(max<valore)
					{
						max=valore;
					}
				}
				System.out.println("MAX:"+max);
			}
			else
			{
				for(int i=1;i<args.length;i++)
				{
					int valore=Integer.parseInt(args[i]);
					if(min>valore)
					{
						min=valore;
					}
				}
				System.out.println("MIN:"+min);
			}
		}
	}
}