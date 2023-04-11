package com.SQL_p2.SQL_P2;


import com.SQL_p2.SQL_P2.Entites.Address;
import com.SQL_p2.SQL_P2.Entites.Author;
import com.SQL_p2.SQL_P2.Entites.Book;
import com.SQL_p2.SQL_P2.Entites.Subjects;
import com.SQL_p2.SQL_P2.Repository.AuthorRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
class SqlP2ApplicationTests {
	@Autowired
	public AuthorRepo authorRepo ;

//	@Test
//	void contextLoads() {
//	}
	@Test
	public void test_create_author_with_address(){
		Author author = new Author() ;

		author.setName("JIPS");
		Address address = new Address() ;
		address.setStreet_number(1234);
		address.setLocation("JIndia");
		address.setState("MUMB") ;

		author.setAddress(address);

		HashSet<Subjects> subjectsHashSet = new HashSet<>() ;

		Subjects sub1 = new Subjects() ;
		sub1.setSubject_name("Maths");
		sub1.setAuthor(author) ;

		subjectsHashSet.add(sub1) ;

		Subjects sub2 = new Subjects() ;
		sub2.setSubject_name("COMP_SC");
		sub2.setAuthor(author) ;

		subjectsHashSet.add(sub2) ;

		author.setSubjects(subjectsHashSet);

		authorRepo.save(author) ;



	}

 /// ONE TO ONE MAPPING
	@Test
	public void test_create_author_with_address_Book(){
		Author author = new Author() ;

		author.setName("HIM");
		Address address = new Address() ;
		address.setStreet_number(1234);
		address.setLocation("America");
		address.setState("Cal") ;

		author.setAddress(address);

//		HashSet<Subjects> subjectsHashSet = new HashSet<>() ;
//
//		Subjects sub1 = new Subjects() ;
//		sub1.setSubject_name("MicroProcessor");
//		sub1.setAuthor(author) ;
//
//		subjectsHashSet.add(sub1) ;
//
//		Subjects sub2 = new Subjects() ;
//		sub2.setSubject_name("IT");
//		sub2.setAuthor(author) ;
//
//		subjectsHashSet.add(sub2) ;
//
//		author.setSubjects(subjectsHashSet);

   HashSet<Book> bookHashSet = new HashSet<>() ;

      Book book1 = new Book() ;
	   book1.setBook_name("4thBook_UniDir");
		Book book2 = new Book() ;
		book2.setBook_name("5thBook_UniDir");

		 bookHashSet.add(book1) ;
		bookHashSet.add(book2) ;

      author.setBooks(bookHashSet);

		authorRepo.save(author) ;



	}

    /// Many to One Unidirectional
	@Test
	public void test_create_author_with_address_Book_Unidirectional(){
		Author author = new Author() ;

		author.setName("Jay");
		Address address = new Address() ;
		address.setStreet_number(1234);
		address.setLocation("Bankok");
		address.setState("CC") ;

		author.setAddress(address);

		HashSet<Subjects> subjectsHashSet = new HashSet<>() ;

		Subjects sub1 = new Subjects() ;
		sub1.setSubject_name("MicroProcessor");
		sub1.setAuthor(author) ;

		subjectsHashSet.add(sub1) ;

		Subjects sub2 = new Subjects() ;
		sub2.setSubject_name("IT");
		sub2.setAuthor(author) ;

		subjectsHashSet.add(sub2) ;

		author.setSubjects(subjectsHashSet);

		//HashSet<Book> bookHashSet = new HashSet<>() ;

		Book book1 = new Book() ;
		book1.setBook_name("4thBook_UniDir");
		book1.setAuthor(author);
		Book book2 = new Book() ;
		book2.setBook_name("5thBook_UniDir");
		book2.setAuthor(author);

		author.addBookSet(book1); ;
		author.addBookSet(book2) ;

		//author.setBooks(bookHashSet);

		authorRepo.save(author) ;



	}


}
