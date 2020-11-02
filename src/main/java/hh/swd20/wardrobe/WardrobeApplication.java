package hh.swd20.wardrobe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import hh.swd20.wardrobe.domain.Clothing;
import hh.swd20.wardrobe.domain.ClothingRepository;
import hh.swd20.wardrobe.domain.Owner;
import hh.swd20.wardrobe.domain.OwnerRepository;
import hh.swd20.wardrobe.domain.Type;
import hh.swd20.wardrobe.domain.TypeRepository;

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
		public CommandLineRunner demo(ClothingRepository crepository, TypeRepository trepository, OwnerRepository orepository) {
			return (args) -> {
				log.info("save a couple of clothes");
				
				Type t1 = new Type("Shirts");
				Type t2 = new Type("Pants");
				Type t3 = new Type("Underpants");
				Type t4 = new Type("Socks");
				
				trepository.save(t1);
				trepository.save(t2);
				trepository.save(t3);
				trepository.save(t4);
				
				Owner o1 = new Owner("Joona Sorjonen");
				Owner o2 = new Owner ("Sami Holopainen");
				
				orepository.save(o1);
				orepository.save(o2);
			  
				
				Clothing c = new Clothing("Red t-shirt", 2017, 4.55, t1, o2);
				Clothing c2 = new Clothing("Blue jeans", 2018, 30.00, t2, o1);
				
				crepository.save(c);
				crepository.save(c2);
				
				
				
				
				log.info("fetch all clothes");
				for (Clothing clothing : crepository.findAll()) {
					log.info(clothing.toString());
				}
	};

}
		
		
	}
	

