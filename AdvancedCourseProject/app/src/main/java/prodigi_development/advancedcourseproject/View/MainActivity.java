package prodigi_development.advancedcourseproject.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import prodigi_development.advancedcourseproject.Controller.CoreFacade;
import prodigi_development.advancedcourseproject.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("LOG", CoreFacade.getShared().StubMethod());
    }
}
