package cz.michalkejzlar.lookbackdemo;

import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.squareup.seismic.ShakeDetector;
import io.lookback.sdk.Lookback;

abstract class LookbackActivity extends AppCompatActivity implements ShakeDetector.Listener {

    private static final String DEFAULT_TESTER = Build.MODEL;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        ShakeDetector sd = new ShakeDetector(this);
        sd.start(sensorManager);
    }

    @Override
    public void hearShake() {
        Lookback.show(this, getLookbackTester());
    }

    protected String getLookbackTester() {
        return DEFAULT_TESTER;
    }
}
