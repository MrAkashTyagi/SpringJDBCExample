import beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import student.dao.StudentInter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String class_path_loc = "applicationConetext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(class_path_loc);
//        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        //insert query
//        String query = "insert into student (id,name,city) values (1,'Anuj','Noida')";
//        template.update(query);
//        String query = "insert into student(id,name,city)values(?,?,?)";
//        String deleteQuery = "delete from student where id = '222'";
//        template.update(deleteQuery);
//        int result1 = template.update(deleteQuery,22);
        //fire query
//        int result = template.update(query,23,"Vishu","Delhi");

        StudentInter studentInter = context.getBean("studentDao", StudentInter.class);

//        Student student = new Student();
//        student.setName("Shubham");
//        student.setId(1221);
//        student.setCity("Delhi");
//        studentInter.insert(student);


//        Student student = new Student();
//        student.setId(23);
//        student.setName("Abdul");
//        student.setCity("Muzaffarnagar");
//        studentInter.update(student);
        System.out.println("Give id to delete");

        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        studentInter.delete(id);
    }


}
