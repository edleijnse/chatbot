import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class ClassifierTest {
    Classifier testee = new Classifier();

    @Test
    public void addCategory() throws Exception {
        testee.addCategory("one", "category1");
        testee.addCategory("two", "category1");
        testee.addCategory("three", "category1");
        System.out.println(testee.getCategory("one"));
        assertEquals("category1",testee.getCategory("one"));
        assertEquals("",testee.getCategory("ohne"));
    }

    @Test
    public void getCategory() throws Exception {
    }

}