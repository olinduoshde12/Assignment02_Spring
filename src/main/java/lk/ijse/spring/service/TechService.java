package lk.ijse.spring.service;

import lk.ijse.spring.dto.TechDTO;

import java.util.List;

public interface TechService {

    void saveTech(TechDTO dto);

    List<TechDTO> getAllTech();

    void deleteTech(String id);

    TechDTO searchTech(String id);

    void updateTech(TechDTO dto);
}
