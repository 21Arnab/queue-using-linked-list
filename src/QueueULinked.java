
public class QueueULinked 
{
	Node front;
	Node rear;
	Node n;
	
	public void enque(int data)
	{
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(front==null)
		{
			front=node;
			rear= node;
			
		}
		else
		
			{
			   Node	rear;
				rear= front;
				
				while(rear.next!=null)
				{
					rear=rear.next;
				}
				rear.next=node;
				node.next=null;
			}
		
	}
	public int deque()
	{
		n=front;
		if(front==null)
		{
			System.out.println("The queue is empty");
		}
		else
		{
		front=front.next;
		//n=null;
		
		}
		return n.data;
	
	}
	public void show()
	{
	   Node p;
	   p=front;
	   System.out.println("The queue is:");
	   while(p.next!=null)
	   {
		   System.out.println(p.data);
		   p=p.next;
	   }
		
	}

	
}
