package com.example.mvvmdemo

import androidx.lifecycle.LiveData

class QuoteRepository(private val quoteDao : QuoteDao) {// database access korar jonne dao use korbo

    fun getQuotes() : LiveData<List<Quote>>{
     return quoteDao.getQuotes()
    }

    suspend fun insertQuote(quote : Quote){
        quoteDao.insertQuote(quote)
    }
}