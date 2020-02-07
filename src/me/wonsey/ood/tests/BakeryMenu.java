package me.wonsey.ood.tests;

import java.util.Iterator;

public class BakeryMenu implements Menu
{
   private static final int MAX_MENU_SIZE = 5;
   MenuItem[] menu;
   private int menuItemCount;
   
   public BakeryMenu()
   {
      menu = new MenuItem[MAX_MENU_SIZE];
      menuItemCount = 0;
      
      addMenuItem("Cookie", 0.99);
      addMenuItem("Pie", 4.99);
      addMenuItem("Doughnut", 1.50);
      addMenuItem("Gold leaf cake", 420.69);
   }
   
   public void addMenuItem(String name, double cost)
   {
      MenuItem mi = new MenuItem(name, cost);
      if (menuItemCount == MAX_MENU_SIZE)
      {
         System.err.println("Could not add item to menu");
      }
      else
      {
         menu[menuItemCount] = mi;
         menuItemCount += 1;
      }
   }

   public Iterator<MenuItem> createIterator()
   {
      return new BakeryMenuIterator(menu);
   }

}
