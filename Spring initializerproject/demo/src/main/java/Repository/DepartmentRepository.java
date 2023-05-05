package Repository;

import Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("ALL")
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    //All crud method for database//
}
