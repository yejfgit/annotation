package com.yejf.test;


import com.yejf.test.servlet.DispatcherServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@ServletComponentScan
public class DemoApplication {

	/**
	 * 使用代码注册Servlet
	 * @return
	 */
	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		return new ServletRegistrationBean(new DispatcherServlet(), "/xs/*");// ServletName默认值为首字母小写，即myServlet
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
