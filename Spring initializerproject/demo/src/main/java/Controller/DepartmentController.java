package Controller;

import Entity.Department;
import Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Department-info")
@SuppressWarnings("ALL")
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;
    //code for getting all department info//
    @GetMapping
    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }
    //code for creating Department//
    @PostMapping
    public Department createUser(@RequestBody Department department){
        return departmentRepository.save(department);}
        @GetMapping("{id}")
        public ResponseEntity<Department>getUserById(@PathVariable long id){
        Department getUser=departmentRepository.findById(id).orElseThrow(()->new Exception.DepartmentException("user does nsot exist"));
        return ResponseEntity.ok(getUser);
        }
        //code for updating user//
    @PutMapping("{id}")
    public ResponseEntity<Department>UpdateUser(@PathVariable Long id,@RequestBody Department UserDetails){
        Department UpdateUser=departmentRepository.findById(id).orElse(()->new Exception.DepartmentException("user does not exist"))
    }

}