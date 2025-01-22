//package com.caramel.slingshot.factory
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//import com.caramel.slingshot.repo.SlingshotRepository
//import com.caramel.slingshot.viewmodel.DemoViewModel
//
//class DemoViewModelFactory(private val repository: SlingshotRepository) : ViewModelProvider.Factory {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(DemoViewModel::class.java)) {
//            @Suppress("UNCHECKED_CAST")
//            return DemoViewModel(repository) as T
//        }
//        throw IllegalArgumentException("Unknown ViewModel class")
//    }
//}
