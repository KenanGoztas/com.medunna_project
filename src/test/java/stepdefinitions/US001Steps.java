package stepdefinitions;

import io.cucumber.java.en.Given;
import org.checkerframework.checker.units.qual.C;
import utilities.ConfigReader;
import utilities.Driver;

public class US001Steps {
    @Given("Medunna ana sayfasına gider")
    public void medunna_ana_sayfasına_gider() {
        Driver.getDriver().get(ConfigReader.getProperties("url"));
    }

}
