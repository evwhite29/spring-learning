package com.evwhite.springlearning;

import com.evwhite.springlearning.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearningApp {

    public static void main(String[] args) {

        //load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve beans from the Spring container, specifying interface type instead of derived type, Spring handles casting
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);

        //Utilize beans
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());

        //Close context
        context.close();
    }
}
