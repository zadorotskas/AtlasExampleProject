package pageElements;

import io.qameta.atlas.webdriver.extension.FindBy;

public interface WithMusicHeader {
    @FindBy("//header")
    MusicHeader musicHeader();
}
