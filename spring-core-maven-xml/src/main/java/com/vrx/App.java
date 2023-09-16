package com.vrx;

import com.vrx.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Spring Core Application using maven and xml" );

        ApplicationContext context =
                new ClassPathXmlApplicationContext("config/spring-beans/spring-config.xml");

        Student student = context.getBean(Student.class);
        System.out.println(student);
        System.out.println(student.getAddress());

    }
}
