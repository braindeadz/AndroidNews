package vtsen.hashnode.dev.androidnews.ui.main.topbar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import vtsen.hashnode.dev.androidnews.R
import vtsen.hashnode.dev.androidnews.ui.screens.home.AllArticlesViewModel

@Composable
fun AllArticlesTopBar(navHostController: NavHostController, allArticlesViewModel: AllArticlesViewModel) {

    ArticlesTopBar(navHostController, R.string.all_articles)

}