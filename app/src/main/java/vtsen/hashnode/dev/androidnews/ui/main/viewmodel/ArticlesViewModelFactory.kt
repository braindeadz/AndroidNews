package vtsen.hashnode.dev.androidnews.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import vtsen.hashnode.dev.androidnews.domain.repository.ArticlesRepository
import vtsen.hashnode.dev.androidnews.ui.screens.bookmarks.BookmarkArticlesViewModel
import vtsen.hashnode.dev.androidnews.ui.screens.home.AllArticlesViewModel
import vtsen.hashnode.dev.androidnews.ui.screens.unread.UnreadArticlesViewModel

@Suppress("UNCHECKED_CAST")
class ArticlesViewModelFactory(
    private val repository: ArticlesRepository,
)
    : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(ArticlesViewModel::class.java)) {
            return ArticlesViewModel(repository) as T
        }
        else if (modelClass.isAssignableFrom(AllArticlesViewModel::class.java)) {
            return AllArticlesViewModel(repository) as T
        }
        else if (modelClass.isAssignableFrom(UnreadArticlesViewModel::class.java)) {
            return UnreadArticlesViewModel(repository) as T
        }
        else if (modelClass.isAssignableFrom(BookmarkArticlesViewModel::class.java)) {
            return BookmarkArticlesViewModel(repository) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}