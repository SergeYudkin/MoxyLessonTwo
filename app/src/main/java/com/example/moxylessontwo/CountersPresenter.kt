package com.example.moxylessontwo


import com.example.moxylessontwo.repository.GithubRepository
import moxy.MvpPresenter


class CountersPresenter(private val repository: GithubRepository): MvpPresenter<MainView>() {

    override fun onFirstViewAttach(){
        super.onFirstViewAttach()
        viewState.initList(repository.getUsers())
    }


}