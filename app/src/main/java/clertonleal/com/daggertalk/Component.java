package clertonleal.com.daggertalk;

import javax.inject.Singleton;

@Singleton
@dagger.Component(modules = Module.class)
public interface Component {
    TwitterApi getTwitterApi();
    void inject(MainActivity mainActivity);
}
