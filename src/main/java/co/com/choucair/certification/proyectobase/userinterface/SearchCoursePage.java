package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target
            .the("Select Choucair University")
            .located(By.xpath("//div[@id='certificaciones']//div[@class='card-header']//strong"));

    public static final Target INPUT_COURSE = Target
            .the("Search the course")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target
            .the("Click to search the course")
            .located(By.id("//input[@class='coursesearchbox')]//button[contains(text(), 'Ir')]"));

    public static final Target SELECT_COURSE = Target
            .the("Click to search the course")
            .located(By.xpath("//h4[@class='result-title']"));

    public static final Target NAME_COURSE = Target
            .the("Extract course name")
            .located(By.xpath("//h1"));

}
