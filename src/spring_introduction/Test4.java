package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog dog1 = context.getBean("myDog", Dog.class);
        dog1.setName("123");
        Dog dog2 = context.getBean("myDog", Dog.class);
        dog2.setName("321");

        System.out.println(dog1.getName());
        System.out.println(dog2.getName());


        System.out.println(dog1==dog2);
        context.close();
    }
}
