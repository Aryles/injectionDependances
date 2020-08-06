package views;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class viewspring {
    public static void main(String[] args) {
       // ApplicationContext ctx =new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext ctx= new AnnotationConfigApplicationContext("dao","Metier");
        IMetier metier= (IMetier) ctx.getBean(IMetier.class);
        System.out.println(metier.calcule());
    }
}
