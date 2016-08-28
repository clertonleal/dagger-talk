package clertonleal.com.daggertalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        assert button != null;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OkHttpClient okHttpClient = new OkHttpClient();
                TwitterAuth twitterAuth = new TwitterAuth(okHttpClient);
                TwitterApi twitterApi = new TwitterApi(okHttpClient, twitterAuth);
                twitterApi.postTweet(getString(R.string.dagger_amor_3));
                View tweet = findViewById(R.id.tweet);
                assert tweet != null;
                tweet.setVisibility(View.VISIBLE);
            }
        });
    }

}
