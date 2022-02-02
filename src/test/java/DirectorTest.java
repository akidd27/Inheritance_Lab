import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;
    
    @Before
    public void before(){
        director = new Director("Nina", "000a", 90000.00, "Management", 500000);
    }

    @Test
    public void hasName(){
        assertEquals("Nina", director.getName());
    }

    @Test
    public void hasNiN(){
        assertEquals("000a", director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(90000.00, director.getSalary(), 0.00);
    }

    @Test
    public void hasDepartment(){
        assertEquals("Management", director.getDepartment());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000.00);
        assertEquals(91000.00, director.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1800, director.payBonus(), 0.00);
    }

    @Test
    public void cantDecreaseSalary(){
        director.raiseSalary(-1000);
        assertEquals(90000, director.getSalary(), 0.0);
    }

    @Test
    public void canChangeName(){
        director.setName("Mina");
        assertEquals("Mina", director.getName());
    }

    @Test
    public void cannotChangeNameIfNull(){
        director.setName(null);
        assertEquals("Nina", director.getName());
    }

}
