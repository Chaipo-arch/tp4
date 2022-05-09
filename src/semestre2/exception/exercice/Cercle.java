/*
 * Classe avec diff�rents calculs se rapportant aux cercles
 * Cercle.java                                              02/21
 */
package semestre2.exception.exercice;


/**
 * Cette classe contient des m�thodes permettant de calculer le p�rim�tre d'un
 * cercle, la surface d'un disque. Aucune v�rification n'est faite sur la validit�
 * des param�tres.
 * @author INFO1
 * @version 1.0
 */
public class Cercle {


    /**
     * D�termine le p�rim�tre d'un cercle
     * @param leRayon un double �gal au rayon du cercle
     * @return un double �gal au p�rim�tre du cercle
     */
    public static double perimetre(double leRayon) {
        leRayon = 2 *Math.PI * leRayon;
        return leRayon;
    }


    /**
     * D�termine la surface d'un disque
     * @param leRayon un double �gal au rayon du disque
     * @return un double �gal � la surface du dsique
     */
    public static double surface(double leRayon) {
        leRayon = Math.PI * leRayon * leRayon;
        return leRayon;
    }

    
    /**
     * D�termine le volume d'un cylindre
     * @param leDiametre un double �gal au diam�tre du cylindre
     * @param laHauteur un double �gal � la hauteur du cylindre
     * @return un double �gal au volume du cylindre
     */
    public static double volume(double leDiametre, double laHauteur) {
        double volume;
        volume = (Math.PI * leDiametre * leDiametre) * 2 
                + (laHauteur*(Math.PI*leDiametre)) ;
        return volume;
        
    }
    
    
    /**
     * D�termine la surface de l'enveloppe du cylindre
     * @param leDiametre un double �gale au diam�tre du cylindre
     * @param laHauteur un double �gale � la hauteur du cylindre
     * @return un double �gal � la surface de l'enveloppe du cylindre
     */
    public static double enveloppe(double leDiametre, double laHauteur) {
        surface(leDiametre/2);
        
        /*
         * on additionne la surface de la base multipli�e par 2 et la 
         * surface du pourtour du cylindre
         */
        return 0.0;
    }



}
