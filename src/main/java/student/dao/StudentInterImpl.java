package student.dao;

import beans.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentInterImpl implements StudentInter{

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        String query = "insert into student(id,name,city)values(?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        return r;
    }

    @Override
    public int update(Student student) {
        String query = "update student set name = ? , city = ? where id = ?";
        int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
        return r;
    }

    @Override
    public int delete(int id) {
        String query = "delete from student where id = ?";
        int r = this.jdbcTemplate.update(query,id);
        return r;
    }
}
