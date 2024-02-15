class Node
{
	Node prev;
	int data;
	Node next;
}

class Test
{
	public static void main(String[] args)
	{
	 Node f=new Node();
	 Node s=new Node();
	 Node t=new Node();
	 f.prev=t;
	 f.data=10;
	 f.next=s;
	 s.prev=f;
	 s.data=20;
	 s.next=t;
	 t.prev=s;
	 t.data=30;
	 t.next=f;
	 Node ptr=f;
	 
	 System.out.println("element in forward direction");
	  do
	 {
	 	
	   System.out.println(ptr.data);//10
	   ptr=ptr.next;
	 }while(ptr!=f);
	 ptr=f.prev;
	 System.out.println("element in backward direction");
	  do
	 {
	 	
	   System.out.println(ptr.data);
	   ptr=ptr.prev;
	 }while(ptr!=t);

	}
  }


