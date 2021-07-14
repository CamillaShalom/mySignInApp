package info.androidhive.myapp1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    @SuppressLint("WrongViewcast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        var clickcontinue= findViewById<Button>(R.id.btnsignup)
        clickcontinue.setOnClickListener{
            val intent = Intent(applicationContext, SignInActivity2:: class.java)
            startActivity(intent)
        }
    }
}

