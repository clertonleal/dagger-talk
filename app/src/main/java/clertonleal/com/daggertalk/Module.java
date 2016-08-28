package clertonleal.com.daggertalk;

import javax.inject.Singleton;

import dagger.Provides;
import okhttp3.OkHttpClient;

@dagger.Module
public class Module {

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient() {
        return new OkHttpClient();
    }

}
