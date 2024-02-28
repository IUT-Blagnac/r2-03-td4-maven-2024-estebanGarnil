public class TestFonctionPrincipale {

    /** Programme principal, le paramètre du main n'étant pas utilisé ici nous ne commentons pas,
     il devra l'être en cas d'utilisation (cf. suite) 
     */
      public static void main(String[] args) {
          System.out.println("Debut du main");
          afficherTirets(13);
          System.out.println("avec un tableau d'arguments de taille " + args.length);
      }
      
      /**
      * Affiche autant de pfn tirets à l'écran
      * @param  pfn IN nombre de tirets à afficher
       */
      public static void afficherTirets(int pfn) {
          int i;
          String accu = "" ;
          for(i = 0 ; i < pfn ; i++) {
              accu += "-" ;
          }
          System.out.println(accu);
      }
  
  
  }