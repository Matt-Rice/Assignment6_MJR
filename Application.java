
/**
 * Class to test the methods of the Tree, Node, and DepthFirstSearch classes
 * @author Nathan Johnson, Bellarmine University & Matthew Rice
 * @version 12-1-22
 * Application.java
 * Fall 2022
 */
public class Application {
	
	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args) {
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);//generates a tree of height 5
		System.out.println();
		DepthFirstSearch aSearch=new DepthFirstSearch();//creates DepthFirstSearch object
		aSearch.DFS(root);//performs DFS on the generated tree
		System.out.println("The height of the tree: " + aSearch.getTreeHeight(root));//prints the height of the generated tree
	}//end main

}//end application