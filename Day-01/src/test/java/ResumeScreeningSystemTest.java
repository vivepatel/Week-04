import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.generics.resume_screening_system.*;
import java.util.Arrays;
import java.util.List;

public class ResumeScreeningSystemTest {

    @Test
    public void testResumeForSoftwareEngineer() {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Muskan Gupta", "Responsible for writing code.");
        Resume<SoftwareEngineer> resume = new Resume<>(softwareEngineer, "Muskan Gupta");

        // Validate resume details for Software Engineer
        assertNotNull(resume);
        assertEquals("Muskan Gupta", resume.getCandidateName());
        assertEquals("Muskan Gupta", resume.getJobRole().getName());
    }

    @Test
    public void testResumeForDataScientist() {
        DataScientist dataScientist = new DataScientist("Nancy Mehra", "Responsible for analyzing data and building models.");
        Resume<DataScientist> resume = new Resume<>(dataScientist, "Nancy Mehra");

        // Validate resume details for Data Scientist
        assertNotNull(resume);
        assertEquals("Nancy Mehra", resume.getCandidateName());
        assertEquals("Nancy Mehra", resume.getJobRole().getName());
    }

    @Test
    public void testResumeForProductManager() {
        ProductManager productManager = new ProductManager("Pragya Sable", "Responsible for overseeing product development.");
        Resume<ProductManager> resume = new Resume<>(productManager, "Pragya Sable");

        // Validate resume details for Product Manager
        assertNotNull(resume);
        assertEquals("Pragya Sable", resume.getCandidateName());
        assertEquals("Pragya Sable", resume.getJobRole().getName());
    }

    @Test
    public void testProcessResumes() {
        // Create instances of different job roles
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Muskan Gupta", "Responsible for writing code.");
        DataScientist dataScientist = new DataScientist("Nancy Mehra", "Responsible for analyzing data and building models.");
        ProductManager productManager = new ProductManager("Pragya Sable", "Responsible for overseeing product development.");

        // Create resumes for each job role
        Resume<SoftwareEngineer> resume1 = new Resume<>(softwareEngineer, "Muskan Gupta");
        Resume<DataScientist> resume2 = new Resume<>(dataScientist, "Nancy Mehra");
        Resume<ProductManager> resume3 = new Resume<>(productManager, "Pragya Sable");

        // Process resumes using the wildcard method
        List<JobRole> jobRoles = Arrays.asList(softwareEngineer, dataScientist, productManager);
        ResumeScreeningSystem.processResumes(jobRoles);
    }

    @Test
    public void testInvalidResumeProcessing() {
        // Create invalid job role object (null)
        assertThrows(NullPointerException.class, () -> {
            ResumeScreeningSystem.processResumes(Arrays.asList((JobRole) null));
        });
    }
}
