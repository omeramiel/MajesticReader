package com.raywenderlich.android.majesticreader.interactors

import com.raywenderlich.android.majesticreader.data.BookmarkRepository
import com.raywenderlich.android.majesticreader.data.DocumentRepository
import com.raywenderlich.android.majesticreader.domain.Document

class GetOpenDocumentUseCase(private val documentRepository: DocumentRepository) {
    operator fun invoke() =
            documentRepository.getOpenDocument()
}
