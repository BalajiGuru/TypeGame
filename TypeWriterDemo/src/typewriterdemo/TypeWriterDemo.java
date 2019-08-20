/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typewriterdemo;

import java.util.Scanner;

/**
 *
 * @author Balaji
 */
class TypeGame
{
    String usr1,usr2;
    Scanner sc=new Scanner(System.in);
    //TypeGame2 t;
    Level2 l;
    public TypeGame(Level2 t)
    {
        l=t;
    }
    
    synchronized void level1(String usr1,String lvl1)
    {
        try{
    
        {
         if(usr1.equals(lvl1))
        {
           
            System.out.println("Your Entered Character is Right");
            System.out.println("Now go to Second Level"); 
            l.start();
        }
        else
        {
            System.out.println("You have Entered wrong character");
        }   
        }
        }
        catch(NullPointerException e)
         {
             System.out.println("Time is UP");
             System.out.println("You have not entered anything");
          }
        }
        
    
    
}
class TypeGame2
{
    String usr1,usr2;
    Scanner sc=new Scanner(System.in);
    
    synchronized void level2(String usr1,String lvl1)
    {
        try{
    
        {
         if(usr1.equals(lvl1))
        {
            System.out.println("Your Entered Character is Right");
            System.out.println("You have successfully completed both levels");
        }
        else
        {
            System.out.println("You have Entered wrong character");
        }   
        }
        }
        catch(NullPointerException e)
         {
             System.out.println("Time is UP");
             System.out.println("You have not entered anything");
          }
        }
        
    
    
}

class Level1 extends Thread
{
    //int timer=5;
    String usr1;
    String lvl1="down";
    Scanner sc=new Scanner(System.in);
    public void run()
    {
        
        System.out.println("Level 1 : ");
        System.out.println("You have to enter this '"+lvl1+"'");
        System.out.println("YOu have 5 seconds");
       System.out.println("Time starts now");
       
        System.out.println("Please enter the String");
        //System.out.println("");
        usr1=sc.nextLine();
        
        
        
    }
}
class Level2 extends Thread
{
     String usr2;
     String lvl2="step";
    Scanner sc=new Scanner(System.in);
    public void run()
    {
        
        System.out.println("Level 2 : ");
        System.out.println("You have to enter  "+lvl2);
        System.out.println("YOu have 5 seconds");
       System.out.println("Time starts now");
       
        System.out.println("Please enter the String '"+lvl2+"'");
        //System.out.println("");
        usr2=sc.nextLine();
        
        
        
    }
}
public class TypeWriterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Level1 t=new Level1();
        TypeGame2 g2=new TypeGame2();
        Level2 l2=new Level2();
        TypeGame g=new TypeGame(l2);
    
        int timer;
        boolean flag=true;
               t.start();
        
    
   for( timer=5;timer>=1;timer--)
        {
            
            try
            {
            Thread.sleep(1000);
            }   
            
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            
        }
   
   
        g.level1(t.usr1, t.lvl1);
   
try
{if (!t.usr1.isEmpty() && t.usr1.equals(t.lvl1))
    {
   for( timer=5;timer>=1;timer--)
        {
            
            try
            {
            Thread.sleep(1000);
            }   
            
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            
        }
        
        if(timer<1)
        {
            
            System.out.println("Time is Up");
            l2.stop();
            
        }
        
        g2.level2(l2.usr2,l2.lvl2);
    
    }
    }
    
    catch(NullPointerException e)
    {
        
    }
    
}
}