package nl.smallproject.www.techiteasy.services;

import nl.smallproject.www.techiteasy.repositories.TelevisionsRepository;
import org.springframework.stereotype.Service;

@Service
public class TelevisionService {

    private final TelevisionsRepository televisionsRepository;

    public TelevisionService(TelevisionsRepository televisionsRepository) {
        this.televisionsRepository = televisionsRepository;
    }
}
