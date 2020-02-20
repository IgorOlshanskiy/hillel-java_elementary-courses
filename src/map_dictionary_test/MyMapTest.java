package map_dictionary_test;

/*
In my map i have methods
 get - done
 put - done
 remove - done
 print - done
 size - done
 */

import org.junit.*;

public class MyMapTest {
    MyMap myMap;


    @BeforeClass
    public static void setUpAll() {
        System.out.println("Before All");
    }

    @AfterClass
    public static void tearDownAll() {
        System.out.println("After All");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
        myMap = new MyMap();
        myMap.put("Hello", "Privet");
        myMap.put("Yo dawg", "Privet bro");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
        myMap.clear();
    }

    @Test
    public void sizePlusOne(){
        System.out.println("Test 1");
        Assert.assertEquals(2, myMap.size());
    }

    @Test
    public void sizeMinusOne(){
        System.out.println("Test 2");
        myMap.remove("Hello");
        Assert.assertEquals(1, myMap.size());
    }

    @Test
    public void myMapNotNull(){
        System.out.println("Test 3");
        Assert.assertNotNull(myMap);
    }

    @Test
    public void get(){
        System.out.println("Test 4");
        Assert.assertEquals("Privet", myMap.get("Hello"));
    }

    @Test
    public void getNot(){
        System.out.println("Test 4");
        Assert.assertNotEquals("Privet bro", myMap.get("Hello"));
    }

    @Test
    public void getNull(){
        System.out.println("Test 5");
        Assert.assertSame(null, myMap.get("Privet"));
    }


}
