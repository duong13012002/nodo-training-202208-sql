package SpringCore;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class JavaClazz {
    private Map<String,Integer> students;
    private List<JavaClazz> clazzes;

    public Map<String, Integer> getStudents() {
        return students;
    }

    public void setStudents(Map students) {
        this.students = students;
    }


    public List<JavaClazz> getClazzes() {
        return clazzes;
    }
}
