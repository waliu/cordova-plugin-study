package cordova.plugin.first.plugin.activity;

import android.app.Activity;
import android.os.Bundle;

import com.example.hello.R;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
}
