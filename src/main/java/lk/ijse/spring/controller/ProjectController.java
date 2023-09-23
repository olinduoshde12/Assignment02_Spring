package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ProjectDTO;
import lk.ijse.spring.service.ProjectService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/project")
@CrossOrigin
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @PostMapping
    public ResponseUtil saveProject(ProjectDTO dto){
        projectService.saveTech(dto);
        return new ResponseUtil(200,"ok","null");
    }

    @GetMapping
    public ResponseUtil getAllProjects(){
        return new ResponseUtil(200,"ok",projectService.getAllProjects());
    }

    @DeleteMapping(path = "/{id}")
    public ResponseUtil deleteProject(@PathVariable String id){
        projectService.deleteProject(id);
        return new ResponseUtil(200,"ok","null");
    }

    @GetMapping(path = "/{p_id}")
    public ResponseUtil searchProject(@PathVariable String p_id){
        return new ResponseUtil(200,"ok",projectService.searchProject(p_id));
    }

    @PutMapping
    public ResponseUtil updateProject(ProjectDTO dto){
        projectService.updateProject(dto);
        return new ResponseUtil(200,"ok","null");
    }

}
