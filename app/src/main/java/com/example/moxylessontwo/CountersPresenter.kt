package com.example.moxylessontwo


import moxy.MvpPresenter


class CountersPresenter(private val model: CountersModels): MvpPresenter<MainView>() {

    override fun onFirstViewAttach(){
        super.onFirstViewAttach()
    }

    fun onCounterOneClick(){
        val newValue = model.next(0)
        viewState.setCounterOneText(newValue.toString())
    }

    fun onCounterTwoClick(){
        val newValue = model.next(1)
        viewState.setCounterTwoText(newValue.toString())
    }

    fun onCounterThirdClick(){
        val newValue = model.next(2)
        viewState.setCounterThirdText(newValue.toString())
    }


}