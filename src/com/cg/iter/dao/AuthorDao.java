package com.cg.iter.dao;

import com.cg.iter.bean.Author;

public interface AuthorDao {

	boolean create(Author auth);
	Author getauthor(int authorid);
	boolean update(Author auth);
	boolean delete(Author auth);

	

}
