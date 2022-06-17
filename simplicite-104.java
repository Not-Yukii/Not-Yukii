package eraser;

public class Eraser {
	public static String erase(String str) {    
		String g = ""; 

		for(int i= 0;i<str.length(); i++) { // Parcours la phrase

			if ( str.charAt(i) == ' ' ) { // si la lettre est égale à un espace
					if (i==0) { // si c'est le premier caractere
						if(str.charAt(i+1) == ' ') { // on verifie le caractère a droite
							g = g+str.charAt(i); // si espace alors c'est égale a un espace
						}
					}		
					else if(i == str.length()-1) {// si le dernier caractere 

						if(str.charAt(i -1) == ' ') { // on vérifie si le caractere de gauche est un espace 
								g = g + str.charAt(i) ; // si oui alors on remplace par un espace
							}
						}
					else if( str.charAt(i+1)==' ' || str.charAt(i-1)==' ') { // si le caracterre ne se situe ni en dernier ni en premier alors on regarde les caractere a droite et a gauche
						g= g+str.charAt(i) ; // si presence d'espace alors on ajoute un espace
					}

					
				}
				
				else {
					g=g+str.charAt(i); // si c'est une lettre alors ça remet la lettre 
				}
					
			
		
		}
		return g ;
	}
	
}




	