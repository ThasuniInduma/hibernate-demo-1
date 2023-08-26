import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import entity.StudentEntity;
import entity.embeded.StudentName;
import repository.StudentRepository;
import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        StudentRepository repo = new StudentRepository();
        /*StudentEntity entity = new StudentEntity();
        entity.setNic("200045785675");
        StudentName studentName = new StudentName("Stu 1", "Stu Last 1");
        entity.setName(studentName);
        List<String> mobiles = new ArrayList<>();
        mobiles.add("0771234567");
        mobiles.add("0779874563");
        entity.setMobiles(mobiles);

        repo.saveStudent(entity);*/

        StudentEntity studentEntity = repo.getStudent(3);
        System.out.println(studentEntity.toString());

        studentEntity.setNic("2000634545");
        studentEntity.getName().setFirstName("Updated First Name");

        repo.updateStudent(studentEntity);
        
        studentEntity = repo.getStudent(3);
        System.out.println(studentEntity.toString());

        repo.deleteStudent(studentEntity);
    }
}
