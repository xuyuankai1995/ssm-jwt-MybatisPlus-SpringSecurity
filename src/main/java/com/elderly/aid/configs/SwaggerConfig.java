package com.elderly.aid.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.elderly.aid.controllers"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("爱期颐智慧养老平台后台数据接口")
                .description("Back开头为后台所需接口，Web开头为前端所需接口，Mob开头则为手机端所需接口，请以此为规范。<br/>" +
                        "code为状态，100：正常，101：错误，102：异常")
                .termsOfServiceUrl("http://blog.csdn.net/saytime")
                .version("1.3.1015")
                .build();
    }
}
