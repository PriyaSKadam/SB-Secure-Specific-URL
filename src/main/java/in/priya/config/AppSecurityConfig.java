package in.priya.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class AppSecurityConfig  {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((authorize) -> authorize
						.requestMatchers("/contactUs", "/swagger-ui.html","/aboutUs").permitAll()
						.anyRequest().authenticated()
			)
				.httpBasic(withDefaults())
				.formLogin(withDefaults());
		return http.build();
	}
}
