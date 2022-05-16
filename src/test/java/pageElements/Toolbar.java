package pageElements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface Toolbar extends AtlasWebElement<Toolbar> {
    @FindBy("//*[@data-l = 't,music']")
    AtlasWebElement<?> musicButton();
}
