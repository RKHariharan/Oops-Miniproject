package atmmachine;//main file to run all the modules
public class mainfile {
   public static void main(String[] args)
   {  
      ATM theATM = ATM.getinstance();
      
      theATM.run();
   } // end main
} 
