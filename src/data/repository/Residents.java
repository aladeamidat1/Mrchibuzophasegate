package data.repository;

import data.models.Resident;

import java.util.ArrayList;
import java.util.List;

public class Residents implements ResidentRepository {
    private int currentId = 0;
    private List<Resident> residents = new ArrayList<>();

    @Override
    public Resident save(Resident resident) {
        residents.add(resident);
        resident.setId(getId());
        return resident;

    }

    @Override
    public void delete(Resident resident) {
        residents.remove(resident);
    }

    @Override
    public void delete(int id) {
        for (Resident resident : residents) {
            if (resident.getId() == id) {
                residents.remove(resident);
                return;
            }
        }

    }

    @Override
    public Resident findById(int id) {
        for (Resident resident : residents) {
            if (resident.getId() == id) {
                return resident;
            }
        }
        return null;
    }

    @Override
    public List<Resident> findAll() {
        return new ArrayList<>(residents);
    }

    @Override
    public int count() {
        return residents.size();
    }
    private int getId() {
        return ++currentId;
    }
}
