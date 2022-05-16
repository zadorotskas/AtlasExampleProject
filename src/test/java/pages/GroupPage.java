package pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import pageElements.WithToolbar;

public interface GroupPage extends WebPage, WithToolbar {
    @FindBy("//*[@id='hook_Block_AltGroupInfo']//h1")
    AtlasWebElement<?> groupName();
}
