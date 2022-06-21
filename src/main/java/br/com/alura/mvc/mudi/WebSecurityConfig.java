package br.com.alura.mvc.mudi;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Autowired
		private DataSource dataSource;
	
		@Override
		protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll()/* .antMatchers("/", "formulario").permitAll() oque for igual ao url vai ser permitido para todos verem */
				.anyRequest().authenticated()
				.and()
				.formLogin(form -> form
				.loginPage("/login").defaultSuccessUrl("/usuario/pedido", true)
				.permitAll()
				)
				.logout(logout -> logout.logoutUrl("/logout")
				.logoutSuccessUrl("/"))				
				.csrf().disable();
		}
		
		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			
		/* criando usuario no banco de dados
		 * UserDetails user =
		 * User.builder().username("ramon").password(encoder.encode("ramon"))
		 * .roles("ADM").build();
		 */
		 auth.jdbcAuthentication() .dataSource(dataSource) .passwordEncoder(encoder)
		/* .withUser(user) */;
		 
		}
		
	/*
	 * @Bean
	 * 
	 * @Override public UserDetailsService userDetailsService() { UserDetails user =
	 * User.withDefaultPasswordEncoder() .username("joao") .password("joao")
	 * .roles("ADM") .build();
	 * 
	 * return new InMemoryUserDetailsManager(user); }
	 */
}
