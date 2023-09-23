package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.ProjectDTO;
import lk.ijse.spring.entity.Project;
import lk.ijse.spring.entity.Tech;
import lk.ijse.spring.repo.ProjectRepo;
import lk.ijse.spring.repo.TechRepo;
import lk.ijse.spring.service.ProjectService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ProjectRepo projectRepo;

    @Override
    public void saveTech(ProjectDTO dto) {
        if(!projectRepo.existsById(dto.getProjectId())){
            projectRepo.save(modelMapper.map(dto,Project.class));
        }else{
            throw new RuntimeException("Project is AllReady is Exists...");
        }
    }

    @Override
    public List<ProjectDTO> getAllProjects() {
       List<Project> all=projectRepo.findAll();
       return modelMapper.map(all,new TypeToken<List<ProjectDTO>>(){}.getType());
    }

    @Override
    public void deleteProject(String id) {
        projectRepo.deleteById(id);
    }

    @Override
    public ProjectDTO searchProject(String id) {
        return null;
    }

    @Override
    public void updateProject(ProjectDTO dto) {
        if(projectRepo.existsById(dto.getProjectId())){
            projectRepo.save(modelMapper.map(dto,Project.class));
        }else{
            throw new RuntimeException("Update is not Available..");
        }

    }
}
