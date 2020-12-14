package Test;

public class test {

	public static void main(String[] args) {
		int row=3;
		int k=0;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=k+1;j++)
			{
				int m=j+k;
				if(m%2!=0)
				{
					System.out.print(m+" ");
				}
			}
			k=k+2;
			System.out.println();
		}
	   }
}





	    

//Select sec = driver.findelement(By.xpath(xpathExpression));
//List<WebElement> list = sec.getOptions();
//Set<String> set = new LinkedHashSet<>();
//for(int i=0;i<list.length();i++)
//{
//	for(String c : i.gettext())
//	{
//		 set.add(c);
//	}
//}
//for(String  c : set)
//{
//  system.out.println(c);
//}
//
// 
 

