class Perfect
{
	public static void main(String args[])
	{
		int a=15,b=20,c=30;
		if((a>b) && (a>c))
		{
			if(b>c)?b:c;
				
		}
		if((b>c)&&(b>a))
			if(a>c)
				System.out.println(a);
		else 
			if((b>c)&&(b>a))
				if(a>c)
					System.out.println(c);
		
	
	}
}