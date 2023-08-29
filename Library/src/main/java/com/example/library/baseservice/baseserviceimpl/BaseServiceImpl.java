package com.example.library.baseservice.baseserviceimpl;


import com.example.library.baserepository.BaseRepository;
import com.example.library.baseservice.BaseService;
import org.springframework.beans.factory.annotation.Autowired;



import javax.persistence.EntityNotFoundException;
import java.io.Serializable;
import java.util.List;


public class BaseServiceImpl<C, ID extends Serializable> implements BaseService<C, ID> {

    @Autowired
    BaseRepository<C,ID> baseRepository;

    @Override
    public C findById(ID id) {
        return baseRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public List<C> findAll() {
        return baseRepository.findAll();
    }

    @Override
    public void delete(ID id) {
        baseRepository.deleteById(id);
    }


}
