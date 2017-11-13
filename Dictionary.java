package packge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Dictionary 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arr=new ArrayList<>();
		arr.add("this");
		arr.add("is");
		arr.add("the");
		arr.add("Program");
		
		while(true)
		{
		String str="";
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Input:");
		String s=sc.nextLine();
		String a[]=s.split(" ");
		int i=0;
			Iterator<String> itr=arr.iterator();
			while(itr.hasNext() && i<a.length)
			{
				String s1=new String(itr.next());
				char m[]=a[i].toCharArray();
				char n[]=s1.toCharArray();
				int c=0;
				if(a[i].length()==s1.length())
				{
					for(int k=0;k<s1.length();k++)
					{
						if(m[k]==n[k])
						{
							c++;
						}
					}
					if(c>=(s1.length()/2))
					{
						str+=s1+" ";
					}
					else
					{
						arr.add(a[i]);
						str+=a[i]+" ";
					}
				}
				else
				{
					arr.add(a[i]);
					str+=a[i]+" ";
				}
				i++;
			}
			for(int j=i;j<a.length;j++)
			{
				arr.add(a[j]);
			}
		System.out.println("Updated Dictionary is: "+arr);
		System.out.println("Output: "+str);
		}
	}
}
