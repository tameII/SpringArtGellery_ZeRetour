package com.trucmuche.art;

import com.trucmuche.art.model.Painting;
import com.trucmuche.art.repository.ArtRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ArtApplication {
        private static final Logger log = LoggerFactory.getLogger(ArtApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ArtApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner art(ArtRepository repository){
//        return (args) -> {
//            //Création de quelques pièce d'art comme ça vite fait
//            repository.save(new Painting(1, "Plafond de la Chapelle Sixtine", "Michelangelo"));
//            repository.save(new Painting(2, "Peinturluré sur drap", "moi à 4 ans"));
//            repository.save(new Painting(3, "La Cène","Leonardo Da Vinci"));
//            repository.save(new Painting(4, "Crayonné sur mur", "moi à 4 ans"));
//
//            log.info("Affichage de toutes les peintures ---- (findAll) -----");
//            for(Painting ptg : repository.findAll()) {
//                log.info(ptg.toString());
//            }
//
//            log.info("Affichage d'une seule peinture ---(findById(2)) -----");
//            Painting p = repository.findById(2);
//            log.info(p.toString());
//
//            log.info("Affichge de toutes les peintures pour un auteur ----(findAllByAuthor(moi à 4 ans)----");
//            for(Painting ptg : repository.findAllByAuthor("moi à 4 ans")){
//                log.info(ptg.toString());
//            }
//
//        };
//    }
}
