package edu.pzks;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
  @author   george
  @project   company-service
  @class  CompanyServiceImplTest
  @version  1.0.0 
  @since 02.09.24 - 11.59
*/

class CompanyServiceImplTest {
    private final Company main = new Company(null, 3);
    private final Company bookkeeping = new Company(main, 2);
// ....
    List<Company> companies = List.of(main, bookkeeping);

    private final ICompanyService underTest = new CompanyServiceImpl();


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void whenParentIsNullThenItIsTheTop() {
        Company result = underTest.getTopLevelParent(main);
        Assertions.assertEquals(main, result);
    }





    @org.junit.jupiter.api.Test
    void getEmployeeCountForCompanyAndChildren() {
    }
}
