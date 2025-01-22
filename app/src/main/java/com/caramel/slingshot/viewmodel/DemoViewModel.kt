//package com.caramel.slingshot.viewmodel
//
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.viewModelScope
//import com.caramel.slingshot.model.Player
//import com.caramel.slingshot.repo.SlingshotRepository
//import com.caramel.slingshot.util.Logger
//import kotlinx.coroutines.launch
//
//class DemoViewModel(private val repository: SlingshotRepository) : BaseViewModel() {
//
//    private val _playersData = MutableLiveData<List<Player>>()
//    val playersData: LiveData<List<Player>> get() = _playersData
//
//    fun fetchPlayers() {
//        setLoading(true)
//        viewModelScope.launch {
//            val players = repository.fetchPlayers()
//            if (players.isNotEmpty()) {
//                Logger.log("TAG", players)
//                _playersData.value = players
//            } else {
//                setError("Failed to fetch players")
//            }
//            setLoading(false)
//        }
//    }
//}
