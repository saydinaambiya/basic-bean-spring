package com.enigma.firstspring.container;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppContainer {
    public static void run(Class applicationClass, String... args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(applicationClass);
        ctx.registerBean("app", applicationClass);
        String[] beans = ctx.getBeanDefinitionNames();

        for (String bean : beans) {
            try {
                System.out.println(bean);
                ConsoleRunner consoleRunner = (ConsoleRunner) ctx.getBean(bean);
                consoleRunner.run(args);
            } catch (ClassCastException e) {
            }
        }
    }
}
