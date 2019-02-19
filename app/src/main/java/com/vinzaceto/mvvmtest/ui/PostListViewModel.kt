package com.vinzaceto.mvvmtest.ui

import com.vinzaceto.mvvmtest.base.BaseViewModel
import com.vinzaceto.mvvmtest.network.PostApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
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

    private lateinit var subscription: Disposable

    init{
        loadPosts()
    }

    private fun loadPosts() {
        subscription = postApi.getPosts()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe{ onRetrievePostListStart() }
            .doOnTerminate{ onRetrivePostListFinish() }
            .subscribe(
                { onRetrivePostListSuccess() },
                { onRetreivePostListError() }
            )
    }

    private fun onRetrievePostListStart(){

    }

    private fun onRetrivePostListFinish(){

    }

    private fun onRetrivePostListSuccess(){

    }

    private fun onRetreivePostListError(){

    }
}