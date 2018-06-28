package rk.com.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import rk.com.beans.Employee;

@Configuration
@ComponentScan(basePackages = "rk.com")
public class BeanConfig {

   /* @Bean
    public Employee getEmployee(){
        Employee employee=new Employee();
        return employee;
    }*/
}
