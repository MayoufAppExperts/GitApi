package com.mayouf.theappexperts.githubapi.network.service;


import com.mayouf.theappexperts.githubapi.network.API_Constants;
import com.mayouf.theappexperts.githubapi.network.model.UserModel;


import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Mohammed on 01/10/2017.
 */

public interface ReqInterface {

    @GET(API_Constants.ORG_URL)
    Observable<UserModel> getOrgs();

}
