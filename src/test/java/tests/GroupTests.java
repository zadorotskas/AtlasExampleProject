package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupTests extends BaseTest {
    private final static String GROUP_ID = "53245288710321"; // ID ������ vk edu
    private final static String GROUP_NAME = "��������������� ����� VK � ��������";

    @Test
    public void testGroupName() {
        assertEquals(GROUP_NAME, site.onGroupPage(GROUP_ID).groupName().getText());
    }
}
