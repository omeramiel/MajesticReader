package com.raywenderlich.android.majesticreader.di

import com.raywenderlich.android.majesticreader.data.BookmarkDataSource
import com.raywenderlich.android.majesticreader.data.DocumentDataSource
import com.raywenderlich.android.majesticreader.data.OpenDocumentDataSource
import com.raywenderlich.android.majesticreader.framework.InMemoryOpenDocumentDataSource
import com.raywenderlich.android.majesticreader.framework.RoomBookmarkDataSource
import com.raywenderlich.android.majesticreader.framework.RoomDocumentDataSource
import com.raywenderlich.android.majesticreader.presentation.library.LibraryViewModel
import com.raywenderlich.android.majesticreader.presentation.reader.ReaderViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        LibraryViewModel(androidApplication(), get())
    }
    viewModel {
        ReaderViewModel(androidApplication(), get())
    }
    single<BookmarkDataSource> {
        RoomBookmarkDataSource(androidContext())
    }
    single<DocumentDataSource> {
        RoomDocumentDataSource(androidContext())
    }
    single<OpenDocumentDataSource> {
        InMemoryOpenDocumentDataSource()
    }
}