/**
 * Creates a Binary Search Tree that stores Word objects and allows you to add, prit and search for values.
 * 
 * @author Gregory Abellanosa <gregoryabellanosa@gmail.com>
 *
 */
public class BST {
		
		/** the primary parent Node */
		private Node root;
		
		/** 
		 * Constructs a null Binary Search Tree with a null root
		 */
		public BST()
		{
			root = null;
		}
		
		/**
		 * Checks if the Binary Search Tree is empty 
		 * 
		 * @return true or false depending on whether or not the Binary Search Tree is empty
		 */
		public boolean isEmpty()
		{
			return root == null;
		}
		
		/**
		 * Adds a Word object into the Binary Search Tree
		 * 
		 * @param w the Word object to be added into the Binary Search Tree
		 */
		public void add(Word w)
		{
			root = add(w, root);
		}
		
		/**
		 * Facade function to add a given Word object into a Binary Search Tree, first
		 * checking if the tree is null, then finding it's proper ordered position within the
		 * tree
		 * 
		 * @param w the Word object to be added into the Binary Search Tree
		 * @param tree the primary parent Node
		 * @return the Node that the word was added into
		 */
		private Node add(Word w, Node tree)
		{
			if (tree == null)
			{
				return new Node(w);
			}
			else
			{
				if (w.compareTo(tree.getWord()) > 0)
				{
					tree.setLeft(add(w, tree.getLeft()));
				}
				else if (w.compareTo(tree.getWord()) < 0)
				{
					tree.setRight(add(w, tree.getRight()));
				}
				else 
				{
					tree.getWord().up();
				}
				return tree;
			}
		}
		
		/**
		 * Searches a Binary Search Tree for a given String value
		 * 
		 * @param w the String to look for
		 * @return the Node containing the string that was being searched for
		 */
		public Node search(String w)
		{
			if (root == null)
			{
				System.out.println("No items to search");
				return null;
			}
			else
			{
				return search(w, root);
			}
		}
		
		/**
		 * Facade function that searches the Nodes a Binary Search Tree for a given String value
		 * 
		 * @param w the String to look for
		 * @param n the Node being analyzed
		 * @return the Node containing the String value being searched for
		 */
		private Node search(String w, Node n)
		{
			if (w.compareTo(n.getWord().getWord()) == 0)
			{
				return n;
			}
			if (w.compareTo(n.getWord().getWord()) < 0)
			{
				if (n.getLeft() == null)
				{
					System.out.println("Item Not Found");
					return null;
				}
				else
				{
					return search(w, n.getLeft());
				}
			}
			else
			{
				if (n.getRight() == null)
				{
					System.out.println("Item Not Found");
					return null;
				}
				else
				{
					return search(w, n.getRight());
				}
			}
		}

		/**
		 * Prints the values of a Binary Search Tree in ascending order
		 */
		public void printOrderedBST()
		{
			if (root == null)
			{
				System.out.println("No items to print.");
			}
			else 
			{
				printOrderedBST(root);
			}
		}
		
		/**
		 * Facade function that analyzes Nodes to print the values of a Binary Search Tree in ascending order
		 * 
		 * @param n current Node being printed
		 */
		private void printOrderedBST(Node n)
		{
			if (n.getLeft() != null) 
			{
				printOrderedBST(n.getLeft());
			}
			System.out.println(n.getWord() + "\t\t"); 
			if (n.getRight() != null) 
			{
				printOrderedBST(n.getRight()); 
			}
		}
}
