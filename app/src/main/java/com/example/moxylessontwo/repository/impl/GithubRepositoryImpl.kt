package com.example.moxylessontwo.repository.impl

import com.example.moxylessontwo.model.GithubUser
import com.example.moxylessontwo.repository.GithubRepository

class GithubRepositoryImpl: GithubRepository {

    private val repositories = listOf(
        GithubUser("Jim Hawkins"),
        GithubUser("Billy Bones"),
        GithubUser("Dr. Livesey"),
        GithubUser("Squire Trelawney"),
        GithubUser("Captain Smollett")
    )

    override fun getUsers(): List<GithubUser> {
        return repositories
    }
}