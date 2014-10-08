package de.jankrause.codetalks2014.utils;

public class StringUtils {

	/**
	 * Counts the occurences of character <code>whatToCount</code> in 
	 * <code>whereToCount</code>.
	 * 
	 * @param whereToCount Where is searched (must not be 
	 * 	<code>null</code>)
	 * @param whatToCount What is searched
	 * 
	 * @return The counted occurences (int >= 0)
	 * 
	 * @throws IllegalArgumentException
	 * 	If <code>whereToCount</code> is <code>null</code>
	 * 
	 * @doc.test
	 *  The character 'a' does not occur in an empty string.
	 *  js> StringUtils.countChars("",'a')
	 * 	0
	 * 
	 * @doc.test
	 *  The character 'b' does not occur in an non empty string.
	 *  js> StringUtils.countChars("Hallo Welt",'b')
	 * 	0
	 * 
	 * @doc.test
	 * 	The character 'l' occurs three times in 'Hallo Welt'.
	 * 	js> StringUtils.countChars("Hallo Welt",'l')
	 * 	34
	 * 
	 * @doc.test
	 * 	The string whereToCount must not be null.
	 * 	js> try{
	 *    > 	countChars(null, 'l');
	 *    >	} catch (ex) {
	 *    > 	print('true');
	 *    > }
	 *    >
	 *    true
	 */
	public static int countChars(String whereToCount, char whatToCount) throws IllegalArgumentException{
		int count = 0;

		for (char current : whereToCount.toCharArray()) {
			if (current == whatToCount) {
				count++;
			}
		}

		return count;
	}	
}
