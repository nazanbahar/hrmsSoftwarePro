package kodlamaio.hrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class HrmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmsApplication.class, args);
	}
	
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("kodlamaio.hrms"))              
          .build();                                           
    }

}


/**
 * @author User
 *Summary:
 *1) Swagger Configurations
 *Setting Up Swagger 2 with a Spring REST API
 *
 *STEP1:Dependencies>pom.xml>dependencies tab
 *Dependencies-1. Adding the Maven Dependency
 *Dependency-2: Enabling Springfox's Swagger UI
 *
 *STEP2:Integrating Swagger 2 into the Project >NorthwindApplication.java >under main 
 *Swagger'ın yapılandırması esas olarak @Bean Docket çekirdeği eklenir.
 *
 *STEP3: Swagger Starter Annotation > @EnableSwagger2
 *it is added to the top of the class.
 *s1. @EnableSwagger2
 *
 *STEP4: Error Code Refactoring
(-) .apis(RequestHandlerSelectors.any())  
(+) .apis(RequestHandlerSelectors.basePackage("kodlamaio.northwind"))
(-) .paths(PathSelectors.any())
(-) import springfox.documentation.builders.PathSelectors;

STEP5: Imports
s1. bean
import org.springframework.context.annotation.Bean;
s2. import for springfox
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
s3. EnableSwagger2
import springfox.documentation.swagger2.annotations.EnableSwagger2;

STEP6: Browser localhost 
http://localhost:8080/swagger-ui.html 

 */