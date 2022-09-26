package com.example.moxylessontwo.repository

import com.example.moxylessontwo.model.GithubUser

interface GithubRepository {

    fun getUsers(): List<GithubUser>
}