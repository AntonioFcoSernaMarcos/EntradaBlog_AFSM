package blog;

/**
 * Clase para manejar las entradas en un blog
 * 
 * @author Antonio Francisco Serna Marcos
 * @version 2.3
 * @since 12-03-2021
 *
 */
public class EntradaBlog_AFSM {
	public static char separador = ':';
	private int id;
	private String texto;
	private String autor;

	/**
	 * Constructor que recibe un n�mero de entrada, el autor de la entrada y el
	 * texto que contiene si el numero de entrada es negativo lanza una excepci�n
	 * 
	 * @param id    Es el numero de la entrada
	 * @param autor El autor de la noticia
	 * @param texto La informaci�n de la noticia
	 * @throws IllegalArgumentException Es para regular que la id no sea negativa
	 */
	public EntradaBlog_AFSM(int id, String autor, String texto) throws IllegalArgumentException {
		if (id <= 0)
			throw new IllegalArgumentException("El id no puede ser negativo");
		this.id = id;
		this.autor = autor;
		this.texto = texto;
	}

	@Override
	public String toString() {
		String cad = "";
		cad += "\nENTRADA DE" + separador + autor;
		cad += "\n " + texto;
		return cad;
	}

	/**
	 * M�todo que devuelve el n�mero de la entrada
	 * 
	 * @return devuelve el n�mero de la entrada
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * M�todo que Devuelve el texto completo de la entrada
	 * 
	 * @return devuelve el texto completo de la entrada
	 */
	public String getTexto() {
		return this.texto;
	}

	/**
	 * M�todo que devuelve el nombre del autor de la entrada en may�sculas
	 * 
	 * @return devuelve el nombre del autor en may�sculas
	 */
	public String getAutor() {
		return this.autor.toUpperCase();
	}

	/**
	 * M�todo que devuelve el nombre del autor
	 * 
	 * @return devuelve el nombre del autor
	 */
	public String devuelveAutor() {
		return this.autor;
	}

	/**
	 * Main del proyecto
	 * 
	 * @param args argumentos
	 */
	public static void main(String[] args) {
		EntradaBlog_AFSM e1 = new EntradaBlog_AFSM(3, " Antonio Francisco Serna Marcos",
				"�ltimas noticias est� disponible BixBy 2.0");
		System.out.println(e1);
	}
}
