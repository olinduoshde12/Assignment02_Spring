package lk.ijse.spring.dto;

import lk.ijse.spring.entity.Tech;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ProjectDTO {
    private String projectId;
    private String name;
    private String description;
    private Tech techLead;
}
