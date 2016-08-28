package clertonleal.com.daggertalk;

import dagger.Provides;
import okhttp3.OkHttpClient;

@dagger.Module
public class Module {

    @Provides
    public OkHttpClient provideOkHttpClient() {
        return new OkHttpClient();
    }

}
