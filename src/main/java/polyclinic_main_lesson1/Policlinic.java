package polyclinic_main_lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Policlinic {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IPatient patient1 = context.getBean("Patient1",IPatient.class);
        patient1.goToPolyclinic();
        patient1.getMedicalCard();

        IPatient patient2 = context.getBean("Patient2", IPatient.class);
        patient2.goToPolyclinic();
        patient2.getMedicalCard();
    }
}
