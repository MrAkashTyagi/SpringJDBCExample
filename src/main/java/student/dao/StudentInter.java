package student.dao;

import beans.Student;

public interface StudentInter {

    public int insert(Student student);
    public int update(Student student);
    public int delete(int studentId);

}
