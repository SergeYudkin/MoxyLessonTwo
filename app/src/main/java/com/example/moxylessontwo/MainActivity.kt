package com.example.moxylessontwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moxylessontwo.databinding.ActivityMainBinding
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding

    private val presenter by moxyPresenter { CountersPresenter(CountersModels()) }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            buttonBoomOne.setOnClickListener {
                presenter.onCounterOneClick()
            }
            buttonBoomSecond.setOnClickListener {
                presenter.onCounterTwoClick()
            }
            buttonBoomThird.setOnClickListener {
                presenter.onCounterThirdClick()
            }
        }
    }


    override fun setCounterOneText(counter: String) = with(binding) {
        messageOne.text = counter
    }

    override fun setCounterTwoText(counter: String) = with(binding) {
        messageSecond.text = counter
    }

    override fun setCounterThirdText(counter: String) = with(binding) {
        messageThird.text = counter
    }
}