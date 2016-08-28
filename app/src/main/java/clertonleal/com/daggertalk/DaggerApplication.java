package clertonleal.com.daggertalk;

import android.app.Application;

public class DaggerApplication extends Application {

    private Component component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerComponent.builder().module(new Module()).build();
    }

    public Component getComponent() {
        return component;
    }
}
