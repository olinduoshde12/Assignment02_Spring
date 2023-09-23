package lk.ijse.spring.controller;

import lk.ijse.spring.dto.TechDTO;
import lk.ijse.spring.service.TechService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/tech")
@CrossOrigin
public class TechController {

    @Autowired
    TechService techService;

    @PostMapping()
   public ResponseUtil saveTech(@ModelAttribute  TechDTO dto){
       techService.saveTech(dto);
       return new ResponseUtil(200,"ok","null");
   }

   @GetMapping()
   public ResponseUtil AllTech(){
       return new ResponseUtil(200,"ok",techService.getAllTech());
   }

   @DeleteMapping(path = "/{id}")
   public ResponseUtil deleteTech(@PathVariable String id){
        techService.deleteTech(id);
       return new ResponseUtil(200,"ok","null");
   }

   @GetMapping(path = "/{t_id}")
   public ResponseUtil searchTech(@PathVariable String t_id){
       return new ResponseUtil(200,"ok",techService.searchTech(t_id));
   }

   @PutMapping
    public ResponseUtil updateTech(TechDTO dto){
         techService.updateTech(dto);
         return new ResponseUtil(200,"ok","null");
    }

}
