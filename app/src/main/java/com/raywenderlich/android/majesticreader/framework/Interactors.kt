package com.raywenderlich.android.majesticreader.framework

import com.raywenderlich.android.majesticreader.interactors.*

data class Interactors(val addBookmarkUseCase: AddBookmarkUseCase,
                  val deleteBookmarkUseCase: RemoveBookmarkUseCase,
                  val getBookmarksUseCase: GetBookmarksUseCase,
                  val addDocumentUseCase: AddDocumentUseCase,
                  val deleteDocumentUseCase: RemoveDocumentUseCase,
                  val getDocumentsUseCase: GetDocumentsUseCase,
                  val getOpenDocumentUseCase: GetOpenDocumentUseCase,
                  val setOpenDocumentUseCase: SetOpenDocumentUseCase)