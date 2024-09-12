package nl.smallproject.www.techiteasy.services;

import nl.smallproject.www.techiteasy.models.Television;
import nl.smallproject.www.techiteasy.repositories.TelevisionsRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TelevisionService {

    private final TelevisionsRepository televisionsRepository;

    public TelevisionService(TelevisionsRepository televisionsRepository) {
        this.televisionsRepository = televisionsRepository;
    }

    public List<Television> getAllTelevisionsByBrand(String brand) {
        if (brand != null) {
            return televisionsRepository.findByBrand(brand);
        }
        return televisionsRepository.findAll();
    }

    public Television saveTelevision(Television television) {
        return televisionsRepository.save(television);
    }

    public Television updateTelevision(@PathVariable Long id, @RequestBody Television television) {
        Television existingTelevision = televisionsRepository.getReferenceById(id);
        BeanUtils.copyProperties(television, existingTelevision, "id");
        return televisionsRepository.save(existingTelevision);
    }

}
