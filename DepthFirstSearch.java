
/**
 * Contains methods to do a depth-first preorder search on a binary tree and to get the height of a binary tree
 * @author Matt Rice
 * @version 12-1-22s
 * DepthFirstSearch.java
 * Fall 2022
 */
public class DepthFirstSearch {       
       Node root;
       private int count=1;
       private int lHeight=0;
       private int rHeight=0;
       private int max;
       /**
        * Creates a constructor that will be used in order to perform the methods of the DepthFirstSearch class
        */
       public DepthFirstSearch(){               
                   System.out.println("Call DFS with root node to do a Depth First Search.");
       }//end DepthFirstSearch
       /**
        * Performs a Preorder Depth-First search on a tree, prints the values of the nodes that were traversed and the number of nodes traversed
        * @param node the root of the tree or subtree that will be used to traverse the tree
        */
       public void DFS(Node node){
         
        		if (node == null) {
                	return;//checks to see if the node is a leaf
                }//end if statement that determines if node is a leaf or not
                System.out.println("Value of the node that is traversed: " + node.getData() + "\nNumber of nodes traversed: " + count++);
                DFS(node.getlChild());//traverses the left child
                
                DFS(node.getrChild());//traverses the right child
       }//end DFS
       /**
        * Gets the height of a binary tree using a depth first search algorithm
        * @param node the root of the tree or subtree that will be used to traverse the tree
        * @return the max height of the tree
        */
        public int getTreeHeight(Node node) {
        	if(node == null) 
        		return 0;//end if that checks if node is a leaf
        	  
        		lHeight = getTreeHeight(node.getlChild());//if statement that traverses the left subtree in order to find the height of the left
        		rHeight = getTreeHeight(node.getrChild());//if statement that traverses the right subtree to find the height of the right
        	
        	//finds the maximum height of the tree
        	if(lHeight >= rHeight)
        		max = lHeight;
        	else 
        		max = rHeight;
        	return max + 1;
        }//end getTreeHeight
}//end DepthFirstSearch

