package data.repository;

import data.models.Resident;

import java.util.List;

public class Residents implements ResidentRepository {

    @Override
    public Resident save(Resident resident) {
        return null;
    }

    @Override
    public void delete(Resident resident) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Resident findById(int id) {
        return null;
    }

    @Override
    public List<Resident> findAll() {
        return List.of();
    }

    @Override
    public Long count() {
        return 0L;
    }
}
