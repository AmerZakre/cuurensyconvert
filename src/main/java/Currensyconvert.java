 public class Currensyconvert {
  public static final double SEK_TO_USD=0.094;
 public static final double USD_to_SEK=10.53;
 public static final double SEK_TO_Euro=0.087;
 public static final double Euro_to_SEK=11.38;
   


   public static void main(String[] args) {

         Currensyconvert convert = new Currensyconvert();
         Scanner scanner = new Scanner(System.in );
          boolean isAdult= true;
 
         while (isAdult){
         int Currensyconvert = scanner.nextInt();
 
         System.out.println("Currensyconvert menue" );
       System.out.println( "1. convert SEK to USD");
        System.out.println("2. convert USD  to SEK");
       System.out.println("3.convert SEK to Euro ");
       System.out.println("4. convert Euro to SEK");
         System.out.println( "5. Exit");
 
         int choice= scanner

        switch (choice){

            case 1:

               Currensyconvert convert ( Scanner,"SEK","USD");
               System.out.println("SEK valuate to USD");

                           break;
            case 2:
                Currensyconvert convert  ( Scanner,"USD","SEK");
                System.out.println("USD valuate to SEK");

                          break;

            case 3:

                Currensyconvert Convert   (scanner,"SEK","Euro");
                System.out.println("SEK valuate to Euro");

                         break;

           case 4:

               Currensyconvert Convert  (Scanner,"Euro","SEK");
                System.out.println("Euro valuate to SEK");

                        break;

            case 0:

                Currensyconvert convert   ("Exit THE PROGRAM");
               System.out.println ("Exit prgram ");

                        break;
            isAdult = false;

       }




          }



 }

 
     }
