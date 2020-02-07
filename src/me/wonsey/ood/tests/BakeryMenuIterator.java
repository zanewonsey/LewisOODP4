package me.wonsey.ood.tests;

import java.util.Iterator;

public class BakeryMenuIterator implements Iterator<MenuItem>
{
   private MenuItem[] list;
   private int position = 0;
   
   public BakeryMenuIterator(MenuItem[] list) {
      this.list = list;
   }

   @Override
   public boolean hasNext()
   {
      boolean bRet = true;
      if (position >= list.length || list[position] == null)
      {
         return false;
      }
      return bRet;
   }

   @Override
   public MenuItem next()
   {
      MenuItem mi = list[position];
      position += 1;
      return mi;
   }

}
