package clertonleal.com.daggertalk;

import dagger.Provides;
import okhttp3.OkHttpClient;

@dagger.Module
public class Module {

    @Provides
    public OkHttpClient provideOkHttpClient() {
        return new OkHttpClient();
    }

    @Provides
    public TwitterAuth provideTwitterAuth(OkHttpClient okHttpClient) {
        return new TwitterAuth(okHttpClient);
    }

    @Provides
    public TwitterApi provideTwitterApi(OkHttpClient okHttpClient, TwitterAuth twitterAuth) {
        return new TwitterApi(okHttpClient, twitterAuth);
    }

}
