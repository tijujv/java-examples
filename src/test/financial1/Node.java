package test.financial1;

class Node {
	private Node leftChild, rightChild;

	public Node(Node leftChild, Node rightChild) {
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public Node getLeftChild() {
		return this.leftChild;
	}

	public Node getRightChild() {
		return this.rightChild;
	}

	public int height1() {
		if (this.leftChild == null && this.rightChild == null) 
            return 0; 
		else {
			int leftHeight = this.leftChild.height(); 
	        int rightHeight = this.rightChild.height();
	        if (leftHeight > rightHeight) 
	            return (leftHeight + 1); 
	         else 
	            return (rightHeight + 1); 
		}
		
	}
	public int height() {
		return findHeight(this);
	}
	int findHeight(Node root){
	    if(root == null)
	      return 0;

	    return findMax(findHeight(root.leftChild), findHeight(root.rightChild)) + 1;
	  }
	int findMax(int a, int b){
	    if(a >= b)
	      return a;
	    else
	      return b;
	  }


	public static void main(String[] args) {
		Node leaf1 = new Node(null, null);
		Node leaf2 = new Node(null, null);
		Node node = new Node(leaf1, null);
		Node root = new Node(node, leaf2);

		System.out.println(root.height()-1);
	}
}