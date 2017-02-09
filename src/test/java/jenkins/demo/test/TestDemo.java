package jenkins.demo.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by chanhlt on 08/02/2017.
 */
public class TestDemo {
    @Test
    public void test01(){
        System.out.println("OK 01 ");
    }

    @Test
    public void test02(){
        System.out.println("OK 02 ");
        assertTrue(true);
    }

    @Test
    public void test03(){
        System.out.println("OK 03 ");
        assertFalse(false);
    }

    @Test
    public void test04(){
        System.out.println("OK 04 ");

        assertEquals("Equals test", 1L, 1L);
    }
}
