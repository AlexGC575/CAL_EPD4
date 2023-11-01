import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Integer{
   
    @Test
    public void sum () {
	int n1 = 12;
	int n2 = 2;
	if(n1+n2==14) {
	    assertTrue(true);
	}else {
	    assertTrue(false);
	}
    }
    
    @Test
    public void res () {
	int n1 = 12;
	int n2 = 2;
	if(n1-n2==10) {
	    assertTrue(true);
	}else {
	    assertTrue(false);
	}
    }
    
    @Test
    public void mul () {
	int n1 = 12;
	int n2 = 2;
	if(n1*n2==24) {
	    assertTrue(true);
	}else {
	    assertTrue(false);
	}
    }
    
    @Test
    public void div () {
	int n1 = 12;
	int n2 = 2;
	if(n1/n2 ==6) {
	    assertTrue(true);
	}else {
	    assertTrue(false);
	}
    }
}
