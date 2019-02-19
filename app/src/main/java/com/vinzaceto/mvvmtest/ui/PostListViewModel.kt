package com.vinzaceto.mvvmtest.ui

import com.vinzaceto.mvvmtest.base.BaseViewModel
import com.vinzaceto.mvvmtest.network.PostApi
import javax.inject.Inject

/**
 * NTT Data Italia S.p.A.
 * File created on 19/02/2019.
 *
 * @author Vincenzo Aceto - vincenzo.aceto@nttdata.com
 * @version 1.0
 */
class PostListViewModel: BaseViewModel() {

    @Inject
    lateinit var postApi: PostApi
}