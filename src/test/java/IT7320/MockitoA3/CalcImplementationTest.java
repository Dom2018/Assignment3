package IT7320.MockitoA3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalcImplementationTest extends TestCase {
	
	CalcImplementation obj;
	int x;
	int y;
	
	protected void setUp() throws Exception {
	
		obj = new CalcImplementation();
		x = 7;
		y = 10;
		
		CalcInterface mockobj = mock(CalcInterface.class);
		when(mockobj.add(x, y)).thenReturn(x+y);
		obj.setIntobj(mockobj);
	}

	protected void tearDown() throws Exception {
		
		obj = null;
		x = 0;
		y = 0;
	}

	public void testAddTwosNums() {
	
		assertEquals(17, obj.addTwosNums(x, y));
	}

}
