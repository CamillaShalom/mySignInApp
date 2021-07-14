package info.androidhive.myapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in2)

        val userName = findViewById<EditText>(R.id.edtxtusername)
        val Password = findViewById<EditText>(R.id.edtxtpasswrd1)
        val SignIn = findViewById<Button>(R.id.btnsignin1)
        val SignUp = findViewById<Button>(R.id.btnsignup1)
        SignUp.setOnClickListener{
            val intent =Intent(applicationContext, SignUpActivity::class.java)
            startActivity(intent)
        }
        SignIn.setOnClickListener{
            if (userName.text.toString()=="Admin" && Password.text.toString()== "1234"){
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
            } else {
                val toast= Toast.makeText(
                    applicationContext, "username or password incorrect",
                    Toast.LENGTH_LONG
                )
                toast.show()
            }
        }


        }


    }


