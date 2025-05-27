package org.alexej.demo.config;

import org.alexej.demo.repository.Product;
import org.alexej.demo.repository.ProductRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements ApplicationRunner {
    private final ProductRepository productRepository;

    public DataInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (productRepository.count() == 0) {
            productRepository.saveAll(List.of(
                    new Product("Premium account", 11, "/static/media/high-quality.6b85a4c802fa70ab4b73e4e179a28234.svg", "A premium account allows the playerList to participate in free tournaments and unlocks a multitude of other opportunities."),
                    new Product("Ticket", 12, "/static/media/ticket.585a757af2759815a47ce1d3b018cdb5.svg", "This is an entry ticket to the tournaments organized by the administration of this gaming portal or sponsors.")
            ));
            System.out.println("Demo products inserted (config/DataInitializer)");
        }
    }
}
