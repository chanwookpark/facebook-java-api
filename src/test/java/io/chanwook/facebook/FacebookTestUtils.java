package io.chanwook.facebook;

import org.springframework.mock.web.MockHttpSession;

/**
 * @author chanwook
 */
public class FacebookTestUtils {
    public static UserSession createUserSession(String accessToken, String userId) {
        final UserSession userSession = new UserSession(new MockHttpSession());
        userSession.createUserSession(accessToken, userId);
        return userSession;
    }
}
