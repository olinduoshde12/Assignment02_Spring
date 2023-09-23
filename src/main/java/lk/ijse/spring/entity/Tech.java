package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Tech {
    @Id
    private String id;
    private String name;
    private String address;
    private double salary;

    @OneToMany(mappedBy = "techLead")
    private List<Project> projects;

}
