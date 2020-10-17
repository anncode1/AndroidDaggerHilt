package com.example.hilttest.presentation

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hilttest.domain.catfacts.model.Fact
import com.example.hilttest.domain.catfacts.usecases.GetCatRandomFact
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * Created by anahi.salgado on 28/07/2020
 */
class MainViewModel @ViewModelInject constructor(
    private val getCatRandomFact: GetCatRandomFact
): ViewModel() {

    val catFact = MutableLiveData<CatFactStates>()
    /*suspend fun getCatFact() = withContext(Dispatchers.IO) {
        notifyLoadingState()
        val fact: Fact? = getCatRandomFact().body()
        fact?.let { notifyCatFactState(it) }
    }*/

    fun getCatFact() = CoroutineScope(Dispatchers.Main).launch {
        val catFactStates = getCatRandomFact()
        withContext(Dispatchers.IO) {
            when (catFactStates) {
                is CatFactStates.Loading -> notifyLoadingState()
                is CatFactStates.CatFactData -> notifyCatFactState(catFactStates.fact)
                is CatFactStates.Error -> notifyErrorState(catFactStates.error)
            }
        }
    }

    private fun notifyLoadingState() {
        catFact.postValue(CatFactStates.Loading)
    }

    private fun notifyCatFactState(fact: Fact) {
        catFact.postValue(CatFactStates.CatFactData(fact))
    }

    private fun notifyErrorState(error: Throwable) {
        catFact.postValue(CatFactStates.Error(error))
    }

}
