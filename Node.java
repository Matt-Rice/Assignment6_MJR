/**
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Node {
	private int data;
	private Node lChild;
	private Node rChild;
	/**
	 * Node constructor that sets left child and right child to null and allows the user to input data
	 * @param data the data value the user wants to store in the node
	 */
	public Node(int data){
		lChild=null;
		rChild=null;
		this.data=data;
	}//end Node
	
	/**
	 * Return the data stored within the node
	 * @return the data value of the node
	 */
	public int getData() {
		return data;
	}//end getData
	/**
	 * Sets the data of a node
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}//end setData
	/**
	 * @return the lChild
	 */
	public Node getlChild() {
		return lChild;
	}//end getlChild
	/**
	 * @param lChild the lChild to set
	 */
	public void setlChild(Node lChild) {
		this.lChild = lChild;
	}//end setlChild
	/**
	 * @return the rChild
	 */
	public Node getrChild() {
		return rChild;
	}//end getrChild
	/**
	 * @param rChild the rChild to set
	 */
	public void setrChild(Node rChild) {
		this.rChild = rChild;
	}//end setrChild
	
}//end Node