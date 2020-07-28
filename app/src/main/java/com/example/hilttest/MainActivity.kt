package com.example.hilttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hilttest.domain.model.Contact
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var contacts: List<Contact>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contactsStringBuilder = StringBuilder()
        contacts.forEach {
            val contactFormat = "Name: ${it.name}, Phone: ${it.phone}\n"
            contactsStringBuilder.append(contactFormat)
        }
        tvLabel.text = contactsStringBuilder
    }
}
