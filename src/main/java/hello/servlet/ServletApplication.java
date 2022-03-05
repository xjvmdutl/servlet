package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;

@ServletComponentScan //스프링이 자동으로 내패키지의 하위 패키지에 서블릿을 등록한다
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

	/*
	//스프링 부트가 해당 동작을 해준것이다
	@Bean
	public ViewResolver internalResourceView(){
		return new InternalResourceView("/WEB-INF/views", ".jsp")
	}
	 */
}
