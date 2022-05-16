package sites;

import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;
import io.qameta.atlas.webdriver.extension.Path;
import pages.GroupPage;
import pages.LoginPage;
import pages.MainPage;
import pages.MusicPage;

public interface BaseSite extends WebSite {
    @Page
    LoginPage onLoginPage();

    @Page
    MainPage onMainPage();

    @Page
    MusicPage onMusicPage();

    @Page
    GroupPage onGroupPage();

    @Page(url = "group/{id}")
    GroupPage onGroupPage(@Path("id") String groupId);
}
