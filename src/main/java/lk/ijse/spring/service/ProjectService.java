package lk.ijse.spring.service;

import lk.ijse.spring.dto.ProjectDTO;

import java.util.List;

public interface ProjectService {

    void saveTech(ProjectDTO dto);

    List<ProjectDTO> getAllProjects();

    void deleteProject(String id);

    ProjectDTO searchProject(String id);

    void updateProject(ProjectDTO dto);
}
