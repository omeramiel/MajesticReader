package com.raywenderlich.android.majesticreader.di

import com.raywenderlich.android.majesticreader.data.BookmarkRepository
import com.raywenderlich.android.majesticreader.data.DocumentRepository
import com.raywenderlich.android.majesticreader.interactors.*
import org.koin.dsl.module

val coreModule = module {
    single {
        Interactors(AddBookmarkUseCase(get()),
                RemoveBookmarkUseCase(get()),
                GetBookmarksUseCase(get()),
                AddDocumentUseCase(get()),
                RemoveDocumentUseCase(get()),
                GetDocumentsUseCase(get()),
                GetOpenDocumentUseCase(get()),
                SetOpenDocumentUseCase(get())
        )
    }
    single {
        BookmarkRepository(get())
    }
    single {
        DocumentRepository(get(), get())
    }
}