package com.example.hilttest.presentation

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hilttest.domain.catfacts.model.Fact
import com.example.hilttest.domain.catfacts.usecases.GetCatRandomFact
/**
 * Created by anahi.salgado on 28/07/2020
 */
class MainViewModel @ViewModelInject constructor(
    private val getCatRandomFact: GetCatRandomFact
): ViewModel() {

    private val catFact = MutableLiveData<CatFactStates>()
    /*fun getCatFact(): LiveData<Fact> {
        loadingState()
        //val fact: Fact = getCatRandomFact.invoke().isSuccessful
        //catFactState(fact)
    }*/

    private fun loadingState() {
        catFact.value = CatFactStates.Loading
    }

    private fun catFactState(fact: Fact) {
        catFact.value = CatFactStates.CatFactData(fact)
    }
}
