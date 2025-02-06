package mx.gob.sapalapaz.lyf

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.map
import mx.gob.sapalapaz.lyf.data.local.preferences.UserPreferences
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val userPreferences: UserPreferences
) : ViewModel() {

    val isLoggedIn: LiveData<Boolean> = userPreferences.authToken
        .map { token -> !token.isNullOrEmpty() }
        .asLiveData()
}