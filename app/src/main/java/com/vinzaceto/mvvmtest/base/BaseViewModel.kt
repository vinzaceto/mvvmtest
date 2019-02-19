package com.vinzaceto.mvvmtest.base

import android.arch.lifecycle.ViewModel
import com.vinzaceto.mvvmtest.injection.component.DaggerViewModelInjector
import com.vinzaceto.mvvmtest.injection.component.ViewModelInjector
import com.vinzaceto.mvvmtest.injection.module.NetworkModule
import com.vinzaceto.mvvmtest.ui.PostListViewModel

/**
 * NTT Data Italia S.p.A.
 * File created on 19/02/2019.
 *
 * @author Vincenzo Aceto - vincenzo.aceto@nttdata.com
 * @version 1.0
 */
abstract class BaseViewModel:ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}