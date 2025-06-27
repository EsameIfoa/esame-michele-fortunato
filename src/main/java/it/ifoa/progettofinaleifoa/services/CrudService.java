package it.ifoa.progettofinaleifoa.services;

import java.util.List;

public interface CrudService<Model, Key>{
    List<Model> readAll();
    Model read(Key key);
    Model create(Model model);
    Model update(Key key, Model model);
    void delete(Key key);
}
