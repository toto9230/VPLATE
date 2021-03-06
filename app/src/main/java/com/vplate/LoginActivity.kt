package com.vplate

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_findPwBtn!!.setOnClickListener{
            val intent = Intent(applicationContext, FindActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

            startActivity(intent)
        }

        login_loginBtn!!.setOnClickListener{
            val intent = Intent(applicationContext, MainActivity::class.java)
            intent.putExtra("email", login_emailEdit!!.text.toString())
            intent.putExtra("pw", login_pwEdit!!.text.toString())
            startActivity(intent)
        }
    }
}
