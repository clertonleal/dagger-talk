package clertonleal.com.daggertalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    TwitterApi twitterApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDaggerApplication().getComponent().inject(this);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        assert button != null;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twitterApi.postTweet(getString(R.string.dagger_amor_3));
                View tweet = findViewById(R.id.tweet);
                assert tweet != null;
                tweet.setVisibility(View.VISIBLE);
            }
        });
    }

    private DaggerApplication getDaggerApplication() {
        return (DaggerApplication) getApplication();
    }

}
