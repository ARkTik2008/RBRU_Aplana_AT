package pages;

import annotation.FieldName;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.DriverManager;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;



public class MortgageCalculatorPage extends BasePageObject{

    @FindBy(xpath = "//*[@id = 'form_city-button']")
    @FieldName(name = "Город")
    public WebElement city;

    @FindBy(xpath = "//*[@id = 'form_program-button']")
    @FieldName(name = "Вид ипотечной программы")
    public WebElement mortProgram;

    @FindBy(xpath = "//*[@id = 'form_category-button']")
    @FieldName(name = "Я являюсь")
    public WebElement clientCategory;

    @FindBy(xpath = "//*[@id = 'form_documents-button']")
    @FieldName(name = "Уровень доходов подтверждаю")
    public WebElement documents;

    @FindBy(xpath = "//div[@class = 'checkbox-block']//span[@class = 'checkbox-block__span']")
    @FieldName(name = "Знаю свою ипотечную программу")
    public WebElement isProgram;

    ////////////////////




    @FindBy(xpath = "//*[text()='Имя']/parent::div/input")
    @FieldName(name = "Имя")
    public WebElement name;

    @FindBy(xpath = "//*[text()='Отчество']/parent::div/input")
    @FieldName(name = "Отчество")
    public WebElement middleName;

    @FindBy(xpath = "//*[text()='Дата рождения']/parent::div/input")
    @FieldName(name = "Дата рождения")
    public WebElement birthDate;

    @FindBy(xpath = "//*[text()='Телефон']/parent::div/input")
    @FieldName(name = "Телефон")
    public WebElement phone;

    @FindBy(xpath = "//*[text()='Отделение банка']/parent::div/div")
    @FieldName(name = "Отделение банка")
    public WebElement bank;

    @FindBy(xpath = "//*[text()='Выслать код']")
    @FieldName(name = "Выслать код")
    public WebElement sentCode;

    @FindBy(xpath = "//div[@class='page-item__invalid'][.//div[text()='Осталось заполнить поля:']]//span[text()='Телефон']")
    @FieldName(name = "Осталось заполнить Телефон")
    public WebElement notFilledField;



    @FindBy(xpath = "//*[contains(text(),'подтверждаю')]/..")
    @FieldName(name = "Я подтверждаю")
    public WebElement acceptCheckBox;



    public void fillField(String name, String value) throws Exception {
        WebElement element = getField(name);
        fillField(element, value);
    }

    public void click(String name) throws Exception {
        WebElement element = getField(name);
        click(element);
    }

    public void selectList(String value){
        DriverManager.getDriver().findElement(By.xpath("//ul/li/div[text()='" + value + "']")).click();
    }


    public WebElement getField(String name) throws Exception {
        Class example = Class.forName("pages.MortgageCalculatorPage");
        List<Field> fields = Arrays.asList(example.getFields());
        for (Field field : fields){
            if (field.getAnnotation(FieldName.class).name().equals(name)){
                return DriverManager.getDriver().findElement(By.xpath(field.getAnnotation(FindBy.class).xpath()));
            }
        }
        Assert.fail("Не объявлен элемент с наименованием " + name);
        return null;
    }







}
