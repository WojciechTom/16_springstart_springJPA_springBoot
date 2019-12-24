package jp.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import jp.javastart.dao.BookDao;
import jp.javastart.model.Book;

@SpringBootApplication
public class Application{

	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		BookDao dao = ctx.getBean(BookDao.class);
		
		Book book1 = new Book("1111", "czego pragną kobiety", "jakaś Kobita");
		Book book2 = new Book("1112", "czego pragną faceci", "jakiś facet");
		Book book3 = new Book("1113", "czego pragną koty", "jakiś kot");
		Book book4 = new Book("1114", "czego pragną politycy", "jakiś polityk");
		dao.save(book1);
		dao.save(book2);
		dao.save(book3);
		dao.save(book4);
		
		Thread.sleep(9000);
		
	
	}

}
