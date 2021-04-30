package Project;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

import junit.framework.TestCase;

public class LargeNumberComputationTest extends TestCase{
	
    protected Vector first;
    protected Vector second;
    protected Vector add;
    protected Vector subtract;
    
    protected void setUp() {   

        first= new Vector();             
        second= new Vector();
        add= new Vector();
        subtract= new Vector();
        
    }
	
    @Test                                    
    public void testMain() {    
    	double first = 20.0;
    	double second = 5.10;
    	
    	double add = first + second;
        double subtract = first - second;
        
        assertEquals(add == 25.10, subtract == 14.90);  
    }                                      
    }