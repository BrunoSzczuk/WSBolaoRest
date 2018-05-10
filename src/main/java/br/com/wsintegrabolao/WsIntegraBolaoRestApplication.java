package br.com.wsintegrabolao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
    "br.com.wsintegrabolao.entity"
})
@EnableJpaRepositories(basePackages = {
    "br.com.wsintegrabolao.repository"
})
@EnableCaching
public class WsIntegraBolaoRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsIntegraBolaoRestApplication.class, args);
    }
}
