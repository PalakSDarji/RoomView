package com.palak.roomview

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class WordViewModel(application: Application) : AndroidViewModel(application) {

    private val wordRepository: WordRepository
    val allWords: LiveData<List<Word>>

    init{
        val wordDao = WordRoomDatabase.getDatabase(application).wordDao()
        wordRepository = WordRepository(wordDao)
        allWords = wordRepository.allWords
    }

    fun insert(word: Word) = viewModelScope.launch(Dispatchers.IO){
        wordRepository.insert(word)
    }
}