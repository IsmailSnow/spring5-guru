

package com.isi.work.bootsrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.isi.work.domain.Author;
import com.isi.work.domain.Book;
import com.isi.work.domain.Publisher;
import com.isi.work.repositories.AuhtorRepo;
import com.isi.work.repositories.BookRepo;
import com.isi.work.repositories.PublisherRepo;

/**  @Author Salmi Ismail**/

@Component
public class BootStrapData implements CommandLineRunner{

	   private final AuhtorRepo authorRepository;
	    private final BookRepo bookRepository;
	    private PublisherRepo publisherRepo;

	    public BootStrapData(AuhtorRepo authorRepository, BookRepo bookRepository,PublisherRepo publisherRepo) {
	        this.authorRepository = authorRepository;
	        this.bookRepository = bookRepository;
	        this.publisherRepo=publisherRepo;
	    }

	    @Override
	    public void run(String... args) throws Exception {
	    	
	        System.out.println("Started in Bootstrap");

	        Publisher publisher = new Publisher();
	        publisher.setName("SFG Publishing");
	        publisher.setCity("St Petersburg");
	        publisher.setState("FL");

	        publisherRepo.save(publisher);

	        System.out.println("Publisher Count: " + publisherRepo.count());

	        Author eric = new Author("Eric", "Evans");
	        Book ddd = new Book("Domain Driven Design", "123123");
	        eric.getBooks().add(ddd);
	        ddd.getAuthors().add(eric);

	        ddd.setPublisher(publisher);
	        publisher.getBooks().add(ddd);

	        authorRepository.save(eric);
	        bookRepository.save(ddd);
	        publisherRepo.save(publisher);

	        Author rod = new Author("Rod", "Johnson");
	        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
	        rod.getBooks().add(noEJB);
	        noEJB.getAuthors().add(rod);

	        noEJB.setPublisher(publisher);
	        publisher.getBooks().add(noEJB);

	        authorRepository.save(rod);
	        bookRepository.save(noEJB);
	        publisherRepo.save(publisher);

	        System.out.println("Number of Books: " + bookRepository.count());
	        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
	    }

}

