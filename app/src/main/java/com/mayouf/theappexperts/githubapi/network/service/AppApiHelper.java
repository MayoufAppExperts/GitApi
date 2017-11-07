package com.mayouf.theappexperts.githubapi.network.service;


import com.mayouf.theappexperts.githubapi.network.model.UserModel;

import io.reactivex.Observable;

/**
 * Created by TheAppExperts on 18/10/2017.
 */
public class AppApiHelper implements ApiHelper {

    private ReqInterface reqInterface;


    @Override
    public Observable<UserModel> useCaseOrgsList() {
        return reqInterface.getOrgs();
    }
}
