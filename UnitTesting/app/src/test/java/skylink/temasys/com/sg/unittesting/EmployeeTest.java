package skylink.temasys.com.sg.unittesting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", emulateSdk = 18)
public class EmployeeTest {

    @Test
    public void testSimple() {
        assertTrue(true);

        Employee mockedEmployee = mock(Employee.class);
        when(mockedEmployee.sayHello()).thenReturn("bye");

        assertEquals("hello", mockedEmployee.sayHello());
    }
}
