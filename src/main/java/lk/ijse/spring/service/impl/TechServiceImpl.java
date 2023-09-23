package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.TechDTO;
import lk.ijse.spring.entity.Tech;
import lk.ijse.spring.repo.TechRepo;
import lk.ijse.spring.service.TechService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TechServiceImpl implements TechService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    TechRepo techRepo;

    @Override
    public void saveTech(TechDTO dto) {
        if(!techRepo.existsById(dto.getId())){
            techRepo.save(modelMapper.map(dto, Tech.class));
        }else{
          throw new RuntimeException("Tech is AllReady Exists...");
        }

    }

    @Override
    public List<TechDTO> getAllTech() {
        List<Tech> all=techRepo.findAll();
        return modelMapper.map(all,new TypeToken<List<TechDTO>>(){}.getType());
    }

    @Override
    public void deleteTech(String id) {
        techRepo.deleteById(id);
    }

    @Override
    public TechDTO searchTech(String id) {
        if(techRepo.existsById(id)){
            Tech tech = techRepo.findById(id).get();
            return modelMapper.map(tech,TechDTO.class);
        }else{
            throw new RuntimeException("TechLead is Not Here...");
        }
    }

    @Override
    public void updateTech(TechDTO dto) {
        if(techRepo.existsById(dto.getId())){
            techRepo.save(modelMapper.map(dto,Tech.class));
        }else{
            throw new RuntimeException("Update is not Available..");
        }

    }


}
