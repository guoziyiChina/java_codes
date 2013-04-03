package guohao;
import java.unil.*;
class LinkedListTest
{
  public static void main(String[] args)
  {
    LinkedList l = new LinkedList();
	for(int i =0;i<10;i++)
	{
	  l.add("a"+i);
	}
	p(l);
	Collections.shuffer(l);
	p(l);
	Collections.reverse(l);
	p(l);
	Collections.sort(l);
	p(l);
	p(Collections.binarySearch(l,a5));
	
	new LinkedListTest().Test();
	
	public void p(Object o)
	{
	  System.out.println(o);
	}
	
	public void Test
	{
	  LinkedList l1 = new LinkedList();
	  l1.add("guohao");
	  l1.add("guohao"."guoziyi","hold","goahead");
	  p(l1);
	  l1.set(3,"holdOn");
	  p(l1);
	  l1.get(3);
	  l1.remove(1);
	  p(l1);
	}
	
	
  
  }
}
