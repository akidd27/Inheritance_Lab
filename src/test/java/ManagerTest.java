import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "123456B", 20000.00, "Sales");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNiN(){
        assertEquals("123456B", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000.00, manager.getSalary(), 0.00);
    }

    @Test
    public void hasDepartment(){
        assertEquals("Sales", manager.getDepartment());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000.00);
        assertEquals(21000.00, manager.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(200, manager.payBonus(), 0.00);
    }

}
