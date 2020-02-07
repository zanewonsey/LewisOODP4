package me.wonsey.ood.tests;

import java.util.Iterator;

public class Cashier
{
   private BakeryMenu bakeryMenu;
   
   public Cashier()
   {
      this.bakeryMenu = new BakeryMenu();
   }
   
   public Cashier(BakeryMenu bakeryMenu)
   {
      this.bakeryMenu = bakeryMenu;
   }
   
   public void readMenu()
   {
      Iterator<MenuItem> asdf = this.bakeryMenu.createIterator();
      MenuItem menuItem = null;
      while (asdf.hasNext())
      {
         menuItem = asdf.next();
         System.out.println(menuItem.toString());
      }
   }
}
