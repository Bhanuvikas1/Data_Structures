
public class implementation {
	
	Node head; //first node in the list is referred as head node.
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		else
		{
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
	
	public void insertAtParticularLocation(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(index == 0) {
			insertAtStart(data);
		}
		Node dummy = head;
		for(int i =0;i<index-1;i++)
		{
			dummy = dummy.next;
		}
		node.next = dummy.next;
		dummy.next = node;
	}
	
	public void show() {
		Node node = head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

}
