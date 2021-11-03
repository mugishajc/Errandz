package io.delasoft.errandz.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import br.com.simplepass.loadingbutton.customViews.CircularProgressButton;
import es.dmoral.toasty.Toasty;
import io.delasoft.errandz.R;

public class LoginActivity extends AppCompatActivity {
    private TextInputLayout textInputEmaillogin, textInputPasswordlogin;
    private String mail, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textInputEmaillogin = findViewById(R.id.textInputEmaillogin);
        textInputPasswordlogin = findViewById(R.id.textInputPasswordlogin);


        //for changing status bar icon colors
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setContentView(R.layout.activity_login);
    }



    public void onLoginClick(View View) {
        startActivity(new Intent(this, RegisterActivity.class));
        overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
    }

    public void onclickloginuser(View view) {

        mail=textInputEmaillogin.getEditText().getText().toString().trim();
        password=textInputPasswordlogin.getEditText().getText().toString().trim();
        if (mail.isEmpty()||password.isEmpty()){
            Toasty.error(LoginActivity.this, R.string.enter_all_fields, Toast.LENGTH_SHORT, true).show();
            startActivity(new Intent(this, VerificationActivity.class));
            overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
        }

    }
}