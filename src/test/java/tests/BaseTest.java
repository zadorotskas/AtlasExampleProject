package tests;

import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import sites.BaseSite;
import utils.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.io.File.separator;

public abstract class BaseTest {
    protected static User user;
    private static final String PATH_TO_RESOURCES_FOLDER = "src"
            + separator
            + "test"
            + separator
            + "resources"
            + separator;

    protected static ChromeDriver driver;
    protected static Atlas atlas;
    protected BaseSite site;

    @BeforeEach
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zador\\IdeaProjects\\ImbaAtlasProject\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        atlas = new Atlas(new WebDriverConfiguration(driver, "https://ok.ru"));
        site = atlas.create(driver, BaseSite.class);
    }

    @BeforeAll
    static void createUser() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(PATH_TO_RESOURCES_FOLDER + "userData.txt"));
        user = new User(reader.readLine(), reader.readLine());
    }

    public void login() {
        site.onLoginPage().open();
        site.onLoginPage().login(user);
    }

    @AfterEach
    public void closeDriver() {
        driver.close();
    }
}
