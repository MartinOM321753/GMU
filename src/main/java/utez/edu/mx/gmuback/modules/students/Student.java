package utez.edu.mx.gmuback.modules.students;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utez.edu.mx.gmuback.modules.user.User;

@Entity
@Table

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "matricula", unique = true,nullable = false)
    private String matricula;
    @Column(name = "full_name",nullable = false)
    private String FullName;
    @OneToOne
    @JoinColumn(name = "id_user",unique = true)
    private User user;
}
