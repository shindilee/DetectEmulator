package android.project.library.shindilee.detectemulator;

import android.os.Bundle;
import android.project.library.shindilee.detectemulatorlibrary.DetectEmulator_Sensor;
import android.project.library.shindilee.detectemulatorlibrary.DetectResult;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements DetectResult {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DetectEmulator_Sensor ds = new DetectEmulator_Sensor(this);
        ds.setShowLog(true);
        ds.Detect(this);
    }

    @Override
    public void Result(boolean isRealDevice) {
        TextView tv = findViewById(R.id.result);

        if (isRealDevice)
            tv.setText(R.string.real_device);
        else
            tv.setText(R.string.emulator);
    }
}
