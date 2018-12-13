package com.evwhite.springlearning;

import com.evwhite.springlearning.coach.Coach;
import com.evwhite.springlearning.coach.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearningApp {

    public static void main(String[] args) {

        //load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve beans from the Spring container, specifying interface type instead of derived type, Spring handles casting
        Coach theCoach = context.getBean("myCoach", Coach.class);
        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //Utilize beans
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());

        //View injected literal values on cricket coach
        System.out.println("Email: " + cricketCoach.getEmailAddress());
        System.out.println("Team: " + cricketCoach.getTeam());

        //Close context
        context.close();
    }
}
