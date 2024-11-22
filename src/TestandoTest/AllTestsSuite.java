package TestandoTest;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.runners.AllTests;

@RunWith(AllTests.class)
@SelectClasses({ListaPessoasStream.class, PessoaTest.class})
public class AllTestsSuite {
}
