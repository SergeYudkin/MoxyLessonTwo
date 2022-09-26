package com.example.moxylessontwo

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moxylessontwo.databinding.ActivityMainBinding
import com.example.moxylessontwo.main.UserAdapter
import com.example.moxylessontwo.model.GithubUser
import com.example.moxylessontwo.repository.impl.CountersRepository
import com.example.moxylessontwo.repository.impl.GithubRepositoryImpl
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding
    private val adapter = UserAdapter()

    private val presenter by moxyPresenter { CountersPresenter(GithubRepositoryImpl()) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            gitHubUsers.layoutManager = LinearLayoutManager(this@MainActivity)
            gitHubUsers.adapter = adapter

        }
    }

    override fun initList(list: List<GithubUser>) {
        adapter.users = list
    }




}