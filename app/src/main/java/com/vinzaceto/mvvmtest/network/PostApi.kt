package com.vinzaceto.mvvmtest.network

import com.vinzaceto.mvvmtest.model.Post
import io.reactivex.Observable
import retrofit2.http.GET


/**
 * NTT Data Italia S.p.A.
 * File created on 19/02/2019.
 *
 * @author Vincenzo Aceto - vincenzo.aceto@nttdata.com
 * @version 1.0
 */
interface PostApi {

    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}