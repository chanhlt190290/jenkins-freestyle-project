package jenkins.demo.test;

import org.junit.Test;
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

}
