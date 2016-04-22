/**
 * Creates a Word object that stores a word and its frequency.
 * 
 * @author Gregory Abellanosa <gregoryabellanosa@gmail.com>
 *
 */
public class Word {

		/** the String object to store in the Word object*/
		private String word;
		
		/** keeps track of how often a word occurs */
		private int frequency;
		
		/**
		 * Constructs a Word object that stores a word and its frequency. Frequency is initialized to
		 * 1 since its first occurrence is when it is constructed.
		 * 
		 * @param s the String object to store in the word
		 */
		public Word(String s)
		{
			word = s;
			frequency = 1;
		}
		
		/**
		 * Gets the String object stored in the Word
		 * 
		 * @return the String object
		 */
		public String getWord()
		{
			return word;
		}
		
		/**
		 * Gets the amount of times a word occurs
		 * 
		 * @return a word's frequency
		 */
		public int getFreq()
		{
			return frequency;
		}
		
		/**
		 * Increments a Word object's frequency
		 */
		public void up()
		{
			frequency += 1;
		}
		
		/**
		 * Lexicographically compares the String values of two different word objects
		 *  
		 * @param w the Word object being compared with
		 * @return -1, 0, 1, depending on the comparisons between the two String values
		 */
		public int compareTo(Word w)
		{
			if (w.getWord().compareTo(getWord()) == 0)
			{
				return 0;
			}
			else if (w.getWord().compareTo(getWord()) > 0)
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
		
		/**
		 * Prints the String value and frequency of a Word object
		 * 
		 * @return a string representation of a word object
		 */
		@Override
		public String toString()
		{
			String s = "Word: " + getWord() + "\tFrequency: " + getFreq();
			return s;
		}
}
