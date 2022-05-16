package pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import utils.User;

public interface LoginPage extends WebPage {
    @FindBy("//input[@name='st.email']")
    AtlasWebElement<?> loginInput();

    @FindBy("//input[@name='st.password']")
    AtlasWebElement<?> passwordInput();

    @FindBy("//input[@data-l='t,sign_in']")
    AtlasWebElement<?> loginButton();

    default void login(User user) {
        loginInput().sendKeys(user.getLogin());
        passwordInput().sendKeys(user.getPassword());
        loginButton().click();
    }
}
