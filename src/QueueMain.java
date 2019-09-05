
public class QueueMain {

	public static void main(String[] args) 
	{
		QueueULinked link = new QueueULinked();
		link.enque(1);
		link.enque(2);
		link.enque(3);
		link.enque(4);
		link.enque(5);
		link.enque(5);
		link.enque(5);
		
		
		try {
			System.out.println("The delete Eliment is: " +link.deque());
			System.out.println("The delete Eliment is: " +link.deque());
			System.out.println("The delete Eliment is: " +link.deque());
			//System.out.println("The delete Eliment is: " +link.deque());
			//System.out.println("The delete Eliment is: " +link.deque());
			//System.out.println("The delete Eliment is: " +link.deque());
			}
		catch(NullPointerException e) 
		{
			System.out.println("you can't delete");
			
		}
		
		link.show();

	}

}
