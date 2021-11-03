package io.delasoft.errandz.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


import es.dmoral.toasty.Toasty;
import in.aabhasjindal.otptextview.OTPListener;
import in.aabhasjindal.otptextview.OtpTextView;
import io.delasoft.errandz.MainActivity;
import io.delasoft.errandz.R;

public class VerificationActivity extends AppCompatActivity {
    private OtpTextView otpTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        otpTextView = findViewById(R.id.otp_view);

        otpTextView.setOtpListener(new OTPListener() {
            @Override
            public void onInteractionListener() {
                // fired when user types something in the Otpbox
            }
            @Override
            public void onOTPComplete(String otp) {
                // fired when user has entered the OTP fully.
                Toasty.info(VerificationActivity.this, "Send to validate otp\n"+otp, Toast.LENGTH_LONG, true).show();

                startActivity(new Intent(VerificationActivity.this, MainActivity.class));
            }
        });

    }

    public void onclickgetbackfromotp(View view){
        finish();
        overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
    }
}