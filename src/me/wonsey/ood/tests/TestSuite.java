package me.wonsey.ood.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Iterator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSuite
{

   private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
   private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
   private final PrintStream originalOut = System.out;
   private final PrintStream originalErr = System.err;
   
   @Before
   public void setUp() throws Exception
   {
      System.setOut(new PrintStream(outContent));
      System.setErr(new PrintStream(errContent));
   }
   
   @After
   public void tearDown() throws Exception
   {
      System.setOut(new PrintStream(originalOut));
      System.setErr(new PrintStream(originalErr));
   }
   
   @Test
   public void test()
   {
      Cashier c = new Cashier();
      c.readMenu();
      assertTrue(c != null);
      assertEquals("Cookie: 0.99\r\nPie: 4.99\r\nDoughnut: 1.5\r\nGold leaf cake: 420.69\r\n", outContent.toString());
   }

}
