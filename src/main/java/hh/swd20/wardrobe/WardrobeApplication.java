package hh.swd20.wardrobe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import hh.swd20.wardrobe.domain.User;
import hh.swd20.wardrobe.domain.Clothing;
import hh.swd20.wardrobe.domain.ClothingRepository;
import hh.swd20.wardrobe.domain.Owner;
import hh.swd20.wardrobe.domain.OwnerRepository;
import hh.swd20.wardrobe.domain.Type;
import hh.swd20.wardrobe.domain.TypeRepository;
import hh.swd20.wardrobe.domain.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;



@SpringBootApplication
public class WardrobeApplication {
	private static final Logger log = LoggerFactory.getLogger(WardrobeApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(WardrobeApplication.class, args);
			
		}
		
		@Bean
		public CommandLineRunner demo(ClothingRepository crepository, OwnerRepository orepository, TypeRepository trepository, UserRepository urepository) {
			return (args) -> {
				log.info("save a couple of clothes");
				
				
				
				Owner o1 = new Owner("Joona Sorjonen");
				Owner o2 = new Owner ("Sami Holopainen");
				
				orepository.save(o1);
				orepository.save(o2);
				
				Type t1 = new Type("Shirt");
				Type t2 = new Type("Pants");
				Type t3 = new Type("Underpants");
				Type t4 = new Type("Socks");
				
				trepository.save(t1);
				trepository.save(t2);
				trepository.save(t3);
				trepository.save(t4);
			  
				
				Clothing c = new Clothing("Red t-shirt", 2017, 4.55, o2, t1);
				Clothing c2 = new Clothing("Blue jeans", 2018, 30.00, o1, t2);
				Clothing c3 = new Clothing("Pineapple socks", 2020, 5.00, o1, t4);
				
				crepository.save(c);
				crepository.save(c2);
				crepository.save(c3);
				
				User u = new User("joona127", "$2a$10$mDBZRQQHNkVmMED17RSNp.8.s0SHcMYRiq3qR3Nwk7oJKFk7gxJHe", "ADMIN");
				User u2 = new User("hoolappa", "$2a$10$NKMsD6FvC4BM05oLCxzjc.GUhkD51EpQYMiTX0wNyM3nIP1Ijy9bq", "USER");
				User u3 = new User("user", "$2a$04$0GLlmPzwCFMWBoXp9j.IIOxaaDl/0KbJZXRDANZDDvmTUan7I59w6", "USER");
				User u4 = new User("admin", "$2a$04$Uubn0.Zilbkssq8y5Urr6.TCClb/Ktlaedd2nOXSINORsQwBh7QVW", "ADMIN");
				
				urepository.save(u);
				urepository.save(u2);
				urepository.save(u3);
				urepository.save(u4);
				
				
				
				log.info("fetch all clothes");
				for (Clothing clothing : crepository.findAll()) {
					log.info(clothing.toString());
				}
	};

}
		
		
	}
	


