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

		HashSet<Subjects> subjectsHashSet = new HashSet<>() ;

		Subjects sub1 = new Subjects() ;
		sub1.setSubject_name("MicroProcessor");
		//sub1.setAuthor(author) ;

		subjectsHashSet.add(sub1) ;

		Subjects sub2 = new Subjects() ;
		sub2.setSubject_name("IT");
		//sub2.setAuthor(author) ;

		subjectsHashSet.add(sub2) ;

		author.setSubjects(subjectsHashSet);


//      Book book = new Book() ;
//	  book.setBook_name("3rdBook");
//	  book.setAuthor(author);

	  //author.setBook(book);


		authorRepo.save(author) ;



	}

 // Q8 Many To Many
	@Test
	public void test_create_author_with_address_Book_MANYTOMANY(){
		Author author = new Author() ;

		author.setName("HIM");
		Address address = new Address() ;
		address.setStreet_number(1234);
		address.setLocation("America");
		address.setState("Cal") ;

		author.setAddress(address);

		HashSet<Subjects> subjectsHashSet = new HashSet<>() ;

		Subjects sub1 = new Subjects() ;
		sub1.setSubject_name("MicroProcessor");
		sub1.setAuthor(author) ;

		subjectsHashSet.add(sub1) ;

		Subjects sub2 = new Subjects() ;
		sub2.setSubject_name("IT");
		//sub2.setAuthor(author) ;

		subjectsHashSet.add(sub2) ;

		author.setSubjects(subjectsHashSet);

       HashSet<Book> bookHashSet = new HashSet<>() ;

		Book book1 = new Book() ;
		book1.setBook_name("3rdBook");

		Book book2 = new Book() ;
		book2.setBook_name("4rdBook");

		bookHashSet.add(book1) ;
		bookHashSet.add(book2) ;

		//author.setBook(book);
       author.setBookSet(bookHashSet);

		authorRepo.save(author) ;



	}

}
