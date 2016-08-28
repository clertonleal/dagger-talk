package clertonleal.com.daggertalk;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

public class TwitterApi {
    private final OkHttpClient okClient;
    private final TwitterAuth twitterAuth;

    @Inject
    public TwitterApi(OkHttpClient okClient, TwitterAuth twitterAuth) {
        this.okClient = okClient;
        this.twitterAuth = twitterAuth;
    }

    public void postTweet(String tweet) {
        /*Posting tweet*/
    }
}
