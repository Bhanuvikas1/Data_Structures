
public class code {
	
	Node head;
	
	public void add(int data) {
		Node node = new Node();
		
		node.data = data;
		node.next = null;
		
		if(head == null)
		{
			head = node;
		}
		else {
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = node;
			
		}
	}
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
	
	public void insertAtParticularPosition(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index==0)
		{
			insertAtStart(data);
		}
		Node d = head;
		for(int i=0;i<index-1;i++)
		{
			d = d.next;
		}
		node.next = d.next;
		d.next = node;
	}
	
	public void deleteFirstNode() {
		Node dummy = head;
		head = head.next;
		dummy.next = null;	
	}
	public void deleteLastNode() {
		
		if(head==null||head.next==null) {
			head = null;
		}
		Node first = head;
		Node second = null;
		
		while(first.next!=null)
		{
			second = first;
			first = first.next;
		}
		second.next = null;
	}
	
	public void deleteAtParticularPosition(int position) {
		if(position==1) {
			deleteFirstNode();
		}
		else {
			Node temp = head;
			int count = 1;
			while(count<position-1)
			{
				temp = temp.next;
				count++;
			}
			Node temp2 = temp.next;
			temp.next = temp2.next;
		}
	}
	public void show() {
		Node n = head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

}
