package data.repository;

import data.models.Resident;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ResidentsTest {

    @org.junit.jupiter.api.BeforeEach
   public void setUp() {
        Residents residents = new Residents();
    }
    @Test
    public void test_that_resident_is_zero() {
        Residents residents = new Residents();
        assertEquals(0,residents.count());
    }
    @Test
    public void test_that_resident_count_is_two() {
        Residents residents = new Residents();
        Resident firstResident = new Resident();
        Resident secondResidents = new Resident();
        residents.save(firstResident);
        residents.save(secondResidents);
        assertEquals(2,residents.count());
    }
    @Test
    public void test_that_checks_resident_id(){
        Residents residents = new Residents();
        Resident firstresident = new Resident();
        Resident residentId = residents.save(firstresident);
        assertEquals(1, residentId.getId());
    }
    @Test
    public void test_that_gets_two_residents_by_id(){
        Residents residents = new Residents();
        Resident firstresident = new Resident();
        Resident secondresident = new Resident();
       Resident residentId = residents.save(firstresident);
       Resident residentIdTwo = residents.save(secondresident);
        assertEquals(1, residentId.getId());
        assertEquals(2, residentIdTwo.getId());
    }
    @Test
    public void test_that_gets_all_residents(){
        Residents residents = new Residents();
        Resident firstresident = new Resident();
        Resident secondresident = new Resident();
        residents.save(firstresident);
        residents.save(secondresident);
        assertEquals(2, residents.findAll().size());
    }
    @Test
    public void test_that_finds_resident_by_id(){
        Residents residents = new Residents();
        Resident firstresident = new Resident();
        Resident secondresident = new Resident();
        residents.save(firstresident);
        residents.save(secondresident);
        assertEquals(firstresident, residents.findById(1));
        assertEquals(secondresident, residents.findById(2));
    }
    @Test
    public void test_that_deletes_resident_by_id(){
        Residents residents = new Residents();
        Resident firstresident = new Resident();
        Resident secondresident = new Resident();
        residents.save(firstresident);
        residents.save(secondresident);
        residents.delete(1);
        assertEquals(1, residents.count());
    }
    @Test
    public void test_that_deletes_all_residents(){
        Residents residents = new Residents();
        Resident firstresident = new Resident();
        Resident secondresident = new Resident();
        residents.save(firstresident);
        residents.save(secondresident);
        residents.delete(firstresident);
        residents.delete(secondresident);
        assertEquals(0, residents.count());
    }



}