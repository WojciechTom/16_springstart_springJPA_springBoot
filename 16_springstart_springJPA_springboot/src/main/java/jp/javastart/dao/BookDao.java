package jp.javastart.dao;

import jp.javastart.model.Book;

public interface BookDao {

	public void save(Book book);
	public Book get(Long id);

	
}
