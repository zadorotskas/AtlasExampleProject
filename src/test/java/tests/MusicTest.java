package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MusicTest extends BaseTest {
    static final String GROUP_NAME = "Nothing But Thieves";
    static final String SONG_NAME = "Amsterdam";

    @Test
    public void addingMusicTest() {
        super.login();
        site.onMainPage().toolbar().musicButton().click();
        site.onMusicPage().musicHeader().search(GROUP_NAME + " " + SONG_NAME);

        site.onMusicPage().addMusic(SONG_NAME, new Actions(driver));
        site.onMusicPage().myMusicButton().click();

        assertTrue(
                site.onMusicPage().song(SONG_NAME).isDisplayed(),
                "Music collection does not contains just now added song"
        );
    }

    @AfterEach
    public void deleteSong() {
        site.onMusicPage().deleteSong(SONG_NAME, new Actions(driver));
    }
}
