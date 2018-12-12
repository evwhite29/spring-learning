package com.evwhite.springlearning;

import com.evwhite.springlearning.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearningApp {

    public static void main(String[] args) {

        //load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from the Spring container, specifying interface type instead of derived type, Spring handles casting
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //Utilize bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //Close context
        context.close();
    }
}
