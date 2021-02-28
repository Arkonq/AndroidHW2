package kz.step.stepeducation182

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var stateText: TextView? = null

    var login: EditText? = null
    var password: EditText? = null

    var hideFields: Button? = null
    var checkFields: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeListeners()
    }

    private fun initializeViews(){
        stateText = findViewById(R.id.text_view_main_activity_state_text)
        hideFields = findViewById(R.id.button_main_activity_hide)
        checkFields = findViewById(R.id.button_main_activity_check)
        login = findViewById(R.id.edit_text_main_activity_login)
        password = findViewById(R.id.edit_text_main_activity_password)
    }

    private fun initializeListeners(){
        checkFields?.setOnClickListener {
            if(login?.text.toString() == "icarus" && password?.text.toString() == "fallen"){
                stateText?.text = getString(R.string.main_activity_state_correct)
            } else {
                stateText?.text = getString(R.string.main_activity_state_incorrect)
            }
        }
        hideFields?.setOnClickListener {
            stateText?.visibility = View.GONE;
            hideFields?.visibility = View.GONE;
            checkFields?.visibility = View.GONE;
            login?.visibility = View.GONE;
            password?.visibility = View.GONE;
        }
    }
}