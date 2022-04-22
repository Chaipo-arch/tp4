/*
 * UtilisationDuree.java
 */

package tp2.lesdurees;

import java.util.Scanner;

/**
 * Utilisation des méthodes traitant les durées
 */
public class UtilisationDuree {
    
    
    /**
     * TODO commenter le rôle de cette méthode (SRP)
     *
     */
    public static void testCombienDifferente() {
        int[] d1; // première durée
        int[] d2; // deuxième durée
        int[] d3; // troisième

        d1 = DureeHMS.saisirDuree("Saisie de la première durée : ");
        d2 = DureeHMS.saisirDuree("Saisie de la deuxième durée : ");
        d3 = DureeHMS.saisirDuree("Saisie de la troisième durée : ");

        System.out.println("Parmi ces 3 durées, "
                + DureeHMS.combienDifferentes(d1, d2, d3)
                + " sont différentes.");

    }
    
    /**
     * TODO commenter le rôle de cette méthode (SRP)
     *
     */
    public static void testOrdre() {
        int[] d1; // première durée
        int[] d2; // deuxième durée
        int[] d3; // troisième

        d1 = DureeHMS.saisirDuree("Saisie de la première durée : ");
        d2 = DureeHMS.saisirDuree("Saisie de la deuxième durée : ");
        d3 = DureeHMS.saisirDuree("Saisie de la troisième durée : ");

        System.out.println("ces 3 durées sont "
                + (DureeHMS.ordre(d1, d2, d3) ? " ordonnées " : " dans le désordre"));

    }

  
    /**
     * TODO commenter le rôle de cette méthode (SRP)
     *
     */
    public static void testEstChaineDuree() {
        Scanner entree = new Scanner(System.in);
        String phrase;
        System.out.print("Entrez une chaine : ");
        phrase = entree.nextLine();
        if (DureeHMS.estChaineDuree(phrase)) {
            System.out.println("vous avez entré une durée de la forme"
                    + "hh:mm:ss la chaine respecte bien le format");
        } else {
            System.out.println("ERREUR !!! ");
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         testEstChaineDuree();
    }

}
