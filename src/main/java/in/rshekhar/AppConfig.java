package in.rshekhar;

import in.rshekhar2.CartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.rshekhar")
public class AppConfig {

    @Bean
    public User createUser() {
        return new User("laddu",20);
    }

    @Bean
    public CartService cartService() {
        return new CartService();
    }


}
