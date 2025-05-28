package data.repository;

import data.models.Resident;

import java.util.List;


public interface ResidentRepository {
    Resident save (Resident resident);
    void delete (Resident resident);
    void delete(int id);
    Resident findById(int id);
    List<Resident> findAll();
    int count();
}
