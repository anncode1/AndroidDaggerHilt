package com.example.hilttest.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.hilttest.R
import com.example.hilttest.domain.agenda.model.Agenda
import com.example.hilttest.domain.agenda.model.Contact
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var contacts: List<Contact>
    @Inject lateinit var agenda: Agenda
    @Inject lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        showContactList()
//        showAgenda()

        observeCatFact()
        btn_get_cat_fact.setOnClickListener {
            mainViewModel.getCatFact()
        }

    }

    private fun observeCatFact() {
        mainViewModel.catFact.observe(this@MainActivity, Observer {
            when (it) {
                is CatFactStates.Loading -> tv_text.setText(R.string.loading)
                is CatFactStates.CatFactData -> tv_text.text = it.fact.text
                is CatFactStates.Error -> tv_text.text = "Error: ${it.error.message}"
            }
        })
    }

    private fun showAgenda() {
        val agendaStringBuilder = StringBuilder()
        agendaStringBuilder.append("Type: ${agenda.type}\n")
        agenda.contacts.forEach {
            agendaStringBuilder.append(it)
        }
        //tvLabelAgenda.text = agendaStringBuilder
    }

    private fun showContactList() {
        val contactsStringBuilder = StringBuilder()
        contacts.forEach {
            contactsStringBuilder.append(it)
        }
        //tvLabelContacts.text = contactsStringBuilder
    }
}
