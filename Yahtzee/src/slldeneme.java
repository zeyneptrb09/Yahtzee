
public class slldeneme {

	private Node head1;
	private Node head2;
	
	public slldeneme() {
		head1 = null;
		head2 = null;
	}					
	public void addsort(Integer dataToAdd,Integer data2) {       
        
        if(head1 == null && head2 == null) {    
        	Node newNode = new Node(dataToAdd); 
        	Node newNode2 = new Node(data2); 
            head1 = newNode; 
            head2=newNode2;
               
        } 
        else if (dataToAdd > (int)head1.getData()) {
        	Node newnode = new Node(dataToAdd);
        	Node newnode2 = new Node(data2);
        	newnode.setLink(head1);
        	newnode2.setLink(head2);
        	head1=newnode;
        	head2=newnode2;
        	}
        else if (dataToAdd == (int)head1.getData()) {
        	Node newnode = new Node(dataToAdd);
        	Node newnode2 = new Node(data2+1);
        	newnode.setLink(head1);
        	newnode2.setLink(head2);
        	head1=newnode;
        	head2=newnode2;
        	}
        else {
        	 Node temp1=head1;
 	        Node previous1=null;
 	       Node temp2=head2;
	        Node previous2=null;
 	        
 	        while(temp1!=null  && temp2 != null && (Integer)dataToAdd < (Integer)temp1.getData()) 
 	        {
 	        	previous1=temp1;
 	        	temp1=temp1.getLink();
 	        	previous2=temp2;
 	        	temp2=temp2.getLink();
 	        }
 	        if(temp1==null  && temp2 == null) {
 	        	Node newnode =new Node(dataToAdd);
 	        	Node newnode2 =new Node(data2);
 	        	previous1.setLink(newnode);
 	        	previous2.setLink(newnode2);
 	        	
 	        }
 	        else {
 	        	Node newnode =new Node(dataToAdd);
 	        	Node newnode2 =new Node(data2);
 	        	 if(previous1!=null) {
	        	 newnode.setLink(temp1);
	        	 previous1.setLink(newnode);
	        	 newnode2.setLink(temp2);
	        	 previous2.setLink(newnode2);
        	 	}
        	 	else {
        		 newnode.setLink(head1);
                 	head1 = newnode;
                 newnode2.setLink(head2);
                 	head2 = newnode2;
        	 	}
 	        }
        }
        
     
    }    
}
