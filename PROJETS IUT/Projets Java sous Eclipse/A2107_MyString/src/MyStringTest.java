import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyStringTest {
	
	String str;
	String empty;
	
	char[] tableauCaracteres;
	char[] tableauVide;
	
	MyString myStringTest;
	MyString myStringVide;

	@Before
	public void setUp() throws Exception {
		this.str = "abca";
		this.tableauCaracteres = this.str.toCharArray();
		this.myStringTest = new MyString(this.tableauCaracteres);
		
		this.empty = "";
		this.tableauVide = empty.toCharArray();
		this.myStringVide = new MyString(this.tableauVide);
	}

	@After
	public void tearDown() throws Exception {
		this.tableauCaracteres = null;
	}

	@Test
	public void testConstructeurArrayRecopieAndIsNotSame() {
		char[] value = str.toCharArray();
		MyString test = new MyString(value);
		assertNotSame(value, test.value);
		assertArrayEquals(value, test.value);
	}
	
	@Test
	public void testConstructeurBufferRecopieAndIsNotSame() {
		StringBuffer sb = new StringBuffer("abc");
		MyString test = new MyString(sb);
		assertArrayEquals(sb.toString().toCharArray(), test.value);
	}
	
	@Test
	public void testLength() {
		assertEquals(myStringTest.length(),4);
	}
	
	@Test
	public void testIsEmptyTrue() {
		assertEquals(myStringVide.length(),0);
		assertTrue(myStringVide.isEmpty());
	}
	
	
	@Test
	public void testIsEmptyFalse() {
		assertFalse(myStringTest.isEmpty());
	}
	
	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testCharAtIndexNegatif() {
		this.myStringTest.charAt(-1);
	}
	
	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testCharAtIndexTropGrand() {
		this.myStringTest.charAt(6);
	}
	
	@Test
	public void testCharAtIndex() {
		assertEquals(this.myStringTest.charAt(0), 'a');
	}
	
	/*@Test
	public void testEqualsArgumentNul() {
		this.myStringTest.equals(null);
	}*/
	
	@Test 
	public void testEqualsSameObject() {
		assertTrue(this.myStringTest.equals(this.myStringTest));
	}	
	
	@Test
	public void testEqualsSameValue() {
		MyString myStringTest2 = new MyString(this.tableauCaracteres);
		assertTrue(this.myStringTest.equals(myStringTest2));
	}
	
	@Test
	public void testEqualsDifferentValue() {
		assertFalse(this.myStringTest.equals(this.myStringVide));
	}
	
	@Test
	public void testEqualsNull() {
		assertFalse(this.myStringTest.equals(null));
	}
	
	@Test
	public void testEqualsIgnoreCase() {
		
	}
	
	@Test
	public void testIndexOfExistant() {
		assertEquals(this.myStringTest.indexOf('a'), 0);
	}
	
	@Test
	public void testIndexOfNonExistant() {
		assertEquals(this.myStringTest.indexOf('d'), -1);
	}
	
	@Test
	public void testLastIndexOfExistant() {
		assertEquals(this.myStringTest.lastIndexOf('a'), 3);
	}
	
	@Test
	public void testLastIndexOfNonExistant() {
		assertEquals(this.myStringTest.lastIndexOf('x'), -1);
	}
	
	@Test
	public void testConcatVide() {
		this.myStringTest.concat(this.myStringVide);
		StringBuffer buffer = new StringBuffer("abca");
		MyString myStringCompare = new MyString(buffer);
		assertEquals(this.myStringTest,myStringCompare);
	}
	
	@Test
	public void testConcat() {
		StringBuffer s = new StringBuffer("s");
		MyString ms = new MyString(s);
		MyString ms2 = this.myStringTest.concat(ms);
		
		StringBuffer buffer = new StringBuffer("abcas");
		MyString myStringCompare = new MyString(buffer);
		assertEquals(myStringCompare, ms2);
	}
	
	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testSubStringIndexDebutNegatif() {
		this.myStringTest.substring(-1, 2);
	}
	
	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testSubStringIndexDebutDepasse() {
		this.myStringTest.substring(1, 5);
	}
	
	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testSubStringIndexDebutSuperieurIndiceFin() {
		this.myStringTest.substring(2, 1);
	}
	
	@Test
	public void testSubStringThisTrue() {
		MyString ms = this.myStringTest.substring(0, this.myStringTest.length());
		assertEquals(ms, this.myStringTest);
	}
	
	@Test
	public void testSubStringThisFalse() {
		MyString ms = this.myStringTest.substring(1, this.myStringTest.length());
		assertNotEquals(ms, this.myStringTest);
	}
	
	@Test
	public void testSubStringThisFalse2() {
		MyString ms = this.myStringTest.substring(0, 2);
		assertNotEquals(ms, this.myStringTest);
	}
	
	@Test
	public void testSubStringNew() {
		MyString ms = this.myStringTest.substring(0, 2);
		StringBuffer s = new StringBuffer("ab");
		MyString ms2 = new MyString(s);
		assertEquals(ms, ms2);
	}
	
	

}
