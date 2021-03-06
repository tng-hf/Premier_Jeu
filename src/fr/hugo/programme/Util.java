package fr.hugo.programme;

/**
 * @author HUGO FIEF
 *
 */
public class Util {
	// contructeur par d�faut
	private Util() {
		throw new IllegalStateException("Utility class");
	}

	/**
	 * Affiche le texte avec un retour � la ligne
	 * 
	 * @param text : texte pass� en parametre
	 * @link {@link Main#run()}
	 */
	public static void printlnConsole(String text) {
		System.out.println(text);
	}

	/**
	 * Affiche le texte sans retour � la ligne
	 * 
	 * @param text : texte pass� en parametre
	 * @link {@link Player#Player(String, double, double)
	 */
	public static void printConsole(String text) {
		System.out.print(text);
	}
}
