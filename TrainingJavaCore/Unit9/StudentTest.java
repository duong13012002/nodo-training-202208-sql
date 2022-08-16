import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StudentTest {

    public static List<Student> filter(List<Student> students,Filter<Student>pred){

        List list = new ArrayList();
        for (Student student: students){
            if(pred.valid(student)) list.add(students);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();



        students.add(new Student(1,23,"Tran Van A"));
        students.add(new Student(2,34,"Nguyen Thi B"));
        students.add(new Student(3,15,"Nguyen Thi C"));
        students.add(new Student(4,46,"Ta Van D"));

//        Stream<Student> stream = students.stream().sorted((student1,student2) ->student1.getAge()-student2.getAge());
//        System.out.println(stream);
//        Filter<Student> older = student -> student.getAge()>=30;
//        List filtered = filter(students,older);
//
//        filtered.forEach(student -> System.out.println(student));
        Comparator<Student>comparator = (student1,student2) ->student1.getAge() - student2.getAge();
        Stream<Student>stream = students.stream().sorted(comparator);
        stream.forEach(student -> System.out.println(student));

        System.out.println("\n Nguoi lon tuoi nhat la: "+students.stream().max(comparator));

        int sum = students.stream().mapToInt(Student :: getAge).sum();
        System.out.println("\n Average age is: "+sum/students.size());

        students.stream().parallel().forEach((it) -> System.out.println(Thread.currentThread().getName() +" Hello "+ it.getName()));
    }
}
