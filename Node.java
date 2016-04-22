/**
 * Provides Nodes to use for creating a Binary Search Tree that stores Word objects
 * 
 * @author Gregory Abellanosa <gregoryabellanosa@gmail.com>
 *
 */
public class Node {

	/** the Word object to be stored in a Node */
	private Word word;
	
	/** the Node to the left of the current Node */
	private Node left;
	
	/** the Node to the right of the current Node */
	private Node right;
	
	/**
	 * Constructs a Node object that stores a Word object
	 * 
	 * @param w the word object to be stored in the Node
	 */
	public Node(Word w)
	{
		word = w;
		left = null;
		right = null;
	}
	
	/**
	 * Sets the Word object that will be stored in the Node
	 * 
	 * @param w the Word object to be set in the Node
	 */
	public void setWord(Word w)
	{
		word = w;
	}
	
	/**
	 * Gets and returns the Word object in a Node
	 * 
	 * @return the Word object in a Node
	 */
	public Word getWord()
	{
		return word;
	}
	
	/**
	 * Sets the Node value to the left of the current Node
	 * 
	 * @param l the left Node
	 */
	public void setLeft(Node l)
	{
		left = l;
	}
	
	/**
	 * Gets the Node to the left
	 * 
	 * @return the left Node
	 */
	public Node getLeft()
	{
		return left;
	}
	
	/**
	 * Sets the Node value to the right of the current Node
	 * 
	 * @param r the right Node
	 */
	public void setRight(Node r)
	{
		right = r;
	}
	
	/**
	 * Gets the Node to the right
	 * 
	 * @return the right Node
	 */
	public Node getRight()
	{
		return right;
	}
}
