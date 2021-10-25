
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.apache.el.parser.ParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;

@SpringBootTest
public class EmployeeTest { 

@Autowired
IEmployeService emp ;

private static final Logger L = LogManager.getLogger( EmployeeTest.class) ; 

@Test
public void testAddEmployee () throws ParseException {
	Employe e = new Employe ("wiem.saddem@esprit.tn", true ,"wiem", "saddem"  , Role.ADMINISTRATEUR) ;
		emp.ajouterEmploye(e);
		assertNotNull(emp.ajouterEmploye(e));
		
	
	
	
	
	
}
	

}
