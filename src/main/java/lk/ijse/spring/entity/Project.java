package lk.ijse.spring.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Project {
    @Id
    private String projectId;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "assigned_techLead")
    private Tech techLead;
}
