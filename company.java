class Company
{
	public static void main(String args[])
	{
		int a=15,b=20,c=30;
		if(((a>b)&&(a>c))||((a<b)&&(a<c)))
			System.out.println(a);
		else if(((b<a)&&(b<c))||((b>a)&&(b>c)))
			System.out.println(b);
		else
			System.out.println(c);
			
	}

}
