package Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Mydepartment")

@SuppressWarnings("ALL")
public class Department {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
@Column(name="DepartmentId")
    String DepartmentId;
@Column(name="DepartmentName")
    String DepartmentName;
@Column(name="DepartmentNo")
    String DepartmentNo;
}
