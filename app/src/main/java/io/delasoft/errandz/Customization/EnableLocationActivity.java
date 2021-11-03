package io.delasoft.errandz.Customization;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.skyfishjy.library.RippleBackground;

import io.delasoft.errandz.R;

public class EnableLocationActivity extends AppCompatActivity {

    private RippleBackground rippleBackground;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enable_location);
        rippleBackground=(RippleBackground)findViewById(R.id.contenti);
        rippleBackground.startRippleAnimation();
    }
    public void onclickcancelenablelocation(View view){
        rippleBackground.stopRippleAnimation();
        finish();
    }
}