
package com.employee.ems.appl.entity;

        import javax.persistence.*;
        import java.util.Set;
        import lombok.Getter;
        import lombok.Setter;
        import com.employee.ems.appl.entity.Department;
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "email_address", nullable = false)
    private String emailId;

   @ManyToOne(fetch=FetchType.LAZY)
   @JoinColumn(name="department")
   private Department department;

    public Employee(Department department) {
        this.department = department;
    }

    public Employee(){

    }

    public Employee(String firstName, String lastName, String emailId) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;

    }

}


