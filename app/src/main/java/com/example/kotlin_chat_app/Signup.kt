package com.example.kotlin_chat_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Signup : AppCompatActivity() {

    private  lateinit var edtName : EditText
    private  lateinit var edtEmail : EditText
    private  lateinit var edtPassword : EditText
    private  lateinit var btnSignUp: Button
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_signup)
        supportActionBar?.hide()
        mAuth = FirebaseAuth.getInstance()
        edtName= findViewById(R.id.edt_name)
        edtEmail = findViewById(R.id.edt_email)
        edtPassword = findViewById(R.id.edt_password)
        btnSignUp = findViewById(R.id.btnSignup2)


        btnSignUp.setOnClickListener {
            val email = edtEmail.text.toString()
            val password = edtPassword.text.toString()

            signUp(email,password)
    }
    }
   private fun signUp( email:String, password: String ) {
       mAuth.createUserWithEmailAndPassword(email, password)
           .addOnCompleteListener(this) { task ->
               if (task.isSuccessful) {
                    // code for jumping to home
                   val intent = Intent(this@Signup, MainActivity::class.java)
                   startActivity(intent)

               } else {

                   Toast.makeText(this@Signup, "Authentication failed.",
                       Toast.LENGTH_SHORT).show()

               }
           }
       //logic for signup
   }
}