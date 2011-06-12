package Classes;

import java.sql.Date;
import java.util.Calendar;
import DataBase.Entity;
import Interfaces.*;

/**
 * 
 * @author Giuliano
 *
 */
public class Book extends Entity implements ICommentable, IRateable, IReviewable {
	String authors;
	String description;
	String edition;
	String imagePath;
	String isbn;			// ISBN-10 format, unieuq key
	String name;
	String publisher;
	Date publishingDate;
	
	// TODO: review access scope, data types and checkings inside these methods.
	
	public String getAuthors() {
		return authors;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getEdition() {
		return edition;
	}
	
	public String getImagePath() {
		return imagePath;
	}
	
	public String getISBN() {
		return isbn;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public Date getPublishingDate() {
		return publishingDate;
	}
	
	public void setAuthors(String value) throws Exception {
		authors = value;
		authors.trim();
		if (authors == null) throw new Exception("Argumento autor recebido � nulo. Relate o erro.");	
	}
	
	public void setDescription(String value) {
		description = value.trim();
	}
	
	public void setEdition(String value) {
		edition = value.trim();
	}
	
	public void setImagePath(String value) {
		// DEVE checar pela exist�ncia do arquivo!
		imagePath = value;
	}
	
	/* 
	 * De acordo com a Ag�ncia Brasileira do ISBN (http://www.isbn.bn.br/), o ISBN agora ter� 
	 * SEMPRE 13 d�gitosm no formato (ex.) 978-85-333-0398-X
	 * Todo ISBN anterior � norma, de 10 d�gitos, receber� o prefixo 978 e manter� os outros 10 
	 * d�gitos. Novos ISBNs vir�o com 13 d�gitos, os 3 primeiros SEMPRE diferentes de 978.
	 * O X no final pode existir nos ISBN-10, mas nunca nos ISBN-13. Ele significa que o d�gito 
	 * de verifica��o � 10 (no intervalo 0-10).
	 * No ISBN-13, o d�gito est� entre 0 e 9.
	 */
	// Admite que o isbn mandado � do tipo ISBN-10 ou ISBN-13, com ou sem h�fens de separa��o.
	public void setISBN(String value) throws IllegalArgumentException, NumberFormatException {
		// Tira os espa�os recebidos
		value = value.trim();
		
		// Checa se o ISBN � v�lido (|"8523301432"| = 10, |"85-233-0143-2"| = |"9788523301432"| = 13, |"978-85-233-0143-2"| = 17) 
		if (value.length() != 10 && value.length() != 13 && value.length() != 17) {
			throw new IllegalArgumentException("O ISBN digitado n�o est� num dos formatos permitidos de entrada.");
		}
		
		switch(value.length()) {
		case 10:
			isbn = "978-" + value.substring(0, 1) + "-" + value.substring(2, 4) + "-" + value.substring(5, 8) + "-" + value.substring(9);
			
			break;
		case 13:
			if (value.charAt(2) == '-') // ISBN-10
				isbn = "978-" + value;
			else // ISBN-13
				isbn = value.substring(0, 2) + "-" + value.substring(3, 4) + "-" + value.substring(5, 7) + "-" + value.substring(8, 11) + "-" + value.substring(12);
			
			break;
		}
		
		// Verifica se os campos dos separadores s�o mesmo n�meros
		try {
			Integer.parseInt(isbn.substring(0, 2));
			Integer.parseInt(isbn.substring(4, 5));
			Integer.parseInt(isbn.substring(7, 9));
			Integer.parseInt(isbn.substring(11, 14));
		}
		catch (NumberFormatException ex) {
			NumberFormatException new_ex = new NumberFormatException("O ISBN digitado cont�m caracteres inv�lidos.");
			
			throw new_ex;
		}
		
		// Finalmente, confere o d�gito de verifica��o do ISBN-13, easy job ;)
		int digit;
		// 012-45-789-1234-5
		digit = (int)(isbn.charAt(0) - '0') + (3 * (int)(isbn.charAt(1) - '0')) + 
				(int)(isbn.charAt(2) - '0') + (3 * (int)(isbn.charAt(4) - '0')) + 
				(int)(isbn.charAt(5) - '0') + (3 * (int)(isbn.charAt(7) - '0')) + 
				(int)(isbn.charAt(8) - '0') + (3 * (int)(isbn.charAt(9) - '0')) + 
				(int)(isbn.charAt(11) - '0') + (3 * (int)(isbn.charAt(12) - '0')) + 
				(int)(isbn.charAt(13) - '0') + (3 * (int)(isbn.charAt(14) - '0'));
		
		digit %= 10;
		digit  = 10 - digit;
		digit %= 10;
		
		if ((int)isbn.charAt(16) != digit) {
			isbn = null;
			throw new IllegalArgumentException("O ISBN n�o � v�lido!");
		}
	}
	
	public void setName(String value) {
		name = value.trim();
	}
	
	public void setPublisher(String value) {
		publisher = value.trim();
	}
	
	public void setPublishingDate(Date value) throws Exception {
		if (value.after(Calendar.getInstance().getTime()))
			throw new Exception("A publica��o � inv�lida. O sistema s� aceita t�tulos j� lan�ados.");
		
		publishingDate = value;
	}
	
	/*
	 * Esses fields est�o no lugar errado. S�o "placeholders".
	 */
	Comment[] comments;
	Review[] reviews;
	float rating;			// Retornado direto de consulta � DB

	@Override
	public void addComment(Comment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editComment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comment[] getAllComments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment getComment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRating() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateRating(int rating) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addReview() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Review[] getAllReviews() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Review getReview(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}