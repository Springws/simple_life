package com.wusen.dreaming.network.service;

import com.wusen.dreaming.model.InstantMoviewResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by BG316091 on 2017/12/14.
 */

public interface MovieService {
    /**
     * 获取正在上映的电影数据
     */
    @GET("movie/nowplaying?apikey=0df993c66c0c636e29ecbb5344252a4a")
    Observable<InstantMoviewResponse> getNowMovieList();
}
