package pageElements;

import io.qameta.atlas.webdriver.extension.FindBy;

public interface WithToolbar {
    @FindBy("//*[@data-l = 't,navigationToolbar']")
    Toolbar toolbar();
}
