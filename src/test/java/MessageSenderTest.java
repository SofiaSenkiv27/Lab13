import org.junit.jupiter.api.Test;
import lab13.task1.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class MessageSenderTest {

    @Test
    public void testFacebookUserAdapter() {
        FacebookUser facebookUser = new FacebookUser("facebook_email@example.com", "USA", LocalDateTime.now().toString());
        User user = new FacebookUserAdapter(facebookUser);

        assertEquals("facebook_email@example.com", user.getUserMail());
        assertEquals("USA", user.getCountry());
        assertNotNull(user.getLastActiveTime());
    }

    @Test
    public void testTwitterUserAdapter() {
        TwitterUser twitterUser = new TwitterUser("twitter_email@example.com", "UK", LocalDateTime.now().toString());
        User user = new TwitterUserAdapter(twitterUser);

        assertEquals("twitter_email@example.com", user.getUserMail());
        assertEquals("UK", user.getCountry());
        assertNotNull(user.getLastActiveTime());
    }

    @Test
    public void testMessageSenderWithFacebookUser() {
        FacebookUser facebookUser = new FacebookUser("facebook_email@example.com", "USA", LocalDateTime.now().toString());
        User user = new FacebookUserAdapter(facebookUser);

        MessageSender messageSender = new MessageSender();
        messageSender.send(user, "Hello Facebook User!");

        assertEquals("facebook_email@example.com", user.getUserMail());
    }

    @Test
    public void testMessageSenderWithTwitterUser() {
        TwitterUser twitterUser = new TwitterUser("twitter_email@example.com", "Canada", LocalDateTime.now().toString());
        User user = new TwitterUserAdapter(twitterUser);

        MessageSender messageSender = new MessageSender();
        messageSender.send(user, "Hello Twitter User!");

        assertEquals("twitter_email@example.com", user.getUserMail());
    }

    @Test
    public void testAuthMethodSwitching() {
        AuthMethod authMethod = AuthMethod.TWITTER;
        User user;

        switch (authMethod) {
            case FACEBOOK:
                FacebookUser facebookUser = new FacebookUser("facebook_email@example.com", "Ukraine", LocalDateTime.now().toString());
                user = new FacebookUserAdapter(facebookUser);
                assertEquals("facebook_email@example.com", user.getUserMail());
                break;
            case TWITTER:
                TwitterUser twitterUser = new TwitterUser("twitter_email@example.com", "Ukraine", LocalDateTime.now().toString());
                user = new TwitterUserAdapter(twitterUser);
                assertEquals("twitter_email@example.com", user.getUserMail());
                break;
            default:
                fail("Invalid authentication method.");
        }
    }
}

