class Q45
{  
    public static void main(String[] args)
	{  
        String a = "Andrew";  
        String b = "Andrew";  
  
        if(a.equals(b))
		{ 
            System.out.println("Hashcodes are : " + a.hashCode() + " & " + b.hashCode());  
        }  
  
        String c = "Maria";  
        String d= "Julie";  
  
        if(!c.equals(d))
		{
            System.out.println("Hashcodes are : " + c.hashCode() + " & " + d.hashCode());  
              
        }  
    }  
}  