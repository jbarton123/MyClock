package jackbarton.myclock;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AnalogClock;
import android.widget.DigitalClock;

public class MyClock extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_clock);

        AnalogClock analog = (AnalogClock) findViewById(R.id.analog_clock);
        DigitalClock digital = (DigitalClock) findViewById(R.id.digital_clock);
    }
}
