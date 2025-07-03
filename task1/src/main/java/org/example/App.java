package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("resource.xml");
        Student student=(Student) context.getBean("st");
        Springboot spring= (Springboot) context.getBean("sp");
        Teacher t=(Teacher) context.getBean("teacher");
        Staff st=(Staff) context.getBean("staff");
        spring.program();
        student.Says();
        t.teacherSays();
        st.staffSays();
    }
}