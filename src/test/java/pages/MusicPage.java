package pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

import org.openqa.selenium.interactions.Actions;
import pageElements.WithMusicHeader;
import pageElements.WithToolbar;


public interface MusicPage extends WebPage, WithToolbar, WithMusicHeader {
    @FindBy("//slot[@name='info']//a[contains(text(), Amsterdam)]")
    AtlasWebElement<?> song(@Param("song") String name);

    @FindBy("//*[@name='controls']//*[@data-l='t,add']")
    AtlasWebElement<?> addSongButton();

    default void addMusic(String songName, Actions actions) {
        actions.moveToElement(song(songName)).perform();
        addSongButton().click();
    }

    @FindBy("//a[@data-l= 't,library']")
    AtlasWebElement<?> myMusicButton();

    @FindBy("//*[@name='controls']//*[@data-tsid='remove_track']")
    AtlasWebElement<?> deleteSongButton();

    default void deleteSong(String songName, Actions actions) {
        actions.moveToElement(song(songName)).perform();
        deleteSongButton().click();
    }
}
