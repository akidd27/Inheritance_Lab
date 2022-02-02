import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class TechStaffTest {

    private Developer developer;
    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        developer = new Developer("Fred", "5555q", 50000.00);
        databaseAdmin = new DatabaseAdmin("Anna", "123456y", 80000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Fred", developer.getName());
        assertEquals("Anna", databaseAdmin.getName());
    }

    @Test
    public void hasNiN(){
        assertEquals("5555q", developer.getNINumber());
        assertEquals("123456y", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000.00, developer.getSalary(), 0.00);
        assertEquals(80000.00, databaseAdmin.getSalary(), 0.00);
    }


    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000.00);
        assertEquals(51000.00, developer.getSalary(), 0.00);
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(81000.00, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(500, developer.payBonus(), 0.00);
        assertEquals(800, databaseAdmin.payBonus(), 0.00);
    }
}
