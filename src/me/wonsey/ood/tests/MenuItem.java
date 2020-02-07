package me.wonsey.ood.tests;

public class MenuItem
{
   private String name;
   private double cost;
   
   public MenuItem(String name, double cost)
   {
      this.name = name;
      this.cost = cost;
   }
   
   public String getName()
   {
      return this.name;
   }
   
   public double getCost()
   {
      return this.cost;
   }
   
   public String toString()
   {
      return getName()+": "+getCost();
   }
}
