/*
 * Classe pour tester les méthodes de la classe Cercle
 * UtiliseCercle.java
 */
package semestre2.exception.exercice;

import java.util.Scanner;

/**
 * Cette classe contient une fonction pour effectuer quelques tests des méthodes
 * perimetre et surface de la classe Cercle. 
 * @author INFO1
 * @version 1.0
 */
public class UtiliseCercle {

   
    /**
     * Programme principal
     * @param args non utilisé
     */
    public static void main(String[] args) {
        
        // déclaration d'un objet Scanner pour effectuer les saisies
        Scanner entree = new Scanner(System.in);

        double rayon;           // rayon du cercle entré par l'utilisateur
        double diametre;        // diamétre du cercle calculé a l'aide du rayon 
        double hauteur;         // hauteur du cylindre entré par l'utilisateur
        
        // saisie du rayon du cercle
        System.out.print("Donnez le rayon du cercle : ");
        rayon = entree.nextDouble();

        // affichage des résultats : périmètre et surface du cercle
        System.out.println("Le perimetre du cercle est "
                           + Cercle.perimetre(rayon) 
                           + "\nLa surface du disque est "
                           + Cercle.surface(rayon) );   
        
        
        
        // saisie de la hauteur du cylindre et du diametre du cyclindre
        System.out.print("\nDonnez le diametre du cylindre : ");
        diametre = entree.nextDouble();
        System.out.print("Donnez la hauteur du cylindre : ");
        hauteur = entree.nextDouble();
        
        
        // affichage des résultats : du volume du cylindre
        System.out.println("Le volume du cylindre est "
                           + Cercle.volume(diametre, hauteur));
    }

}