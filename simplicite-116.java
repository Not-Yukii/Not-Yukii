package eraser;

public class Eraser {

    /** Retire les espaces seuls sur la phrase
     * 
     * @param str La phrase
     * @return La phrase sans les espaces seuls
    */
    public static String erase(String str) {
        // Initialisation String de la phrase sans espaces seuls et la longueur de la phrase
        String phrase = "";
        int longueur = str.length();

        // Parcours de la phrase
        for(int i = 0; i < longueur; i++){
            
            // Vérification du caractère à l'indice i si c'est un espace
            char c = str.charAt(i);
            if(c == ' '){

                // 2 groupes de vérifications
                // Vérifie si le caractère suivant est existant (l'indice+1 dépasse pas la longueur du str) et s'il est un espace
                // Vérifie si le caractère précèdent existe (l'indice-1 n'est pas -1) et s'il est un espace
                if(i+1 < longueur && str.charAt(i+1) == ' ' ||  i-1 >= 0 && str.charAt(i-1) == ' '){

                    // Ajoute l'espace dans la phrase modifié
                    phrase += c;
                }
            }
            else{

                // Ajoute le caractère dans la phrase modifié
                phrase += c;
            }
        }
        return phrase;
    }
}
