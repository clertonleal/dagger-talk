package clertonleal.com.daggertalk;

@dagger.Component(modules = Module.class)
public interface Component {
    TwitterApi getTwitterApi();
}
