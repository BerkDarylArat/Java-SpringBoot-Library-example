package com.example.library.baseservice;

import java.util.List;

public interface BaseService<C,ID> {
    C findById(ID id);

    List<C> findAll();

    void delete(ID id);
}
