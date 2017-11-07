package com.mayouf.theappexperts.githubapi;


import com.mayouf.theappexperts.githubapi.network.model.UserModel;
import com.mayouf.theappexperts.githubapi.network.service.ApiHelper;
import com.mayouf.theappexperts.githubapi.network.service.AppApiHelper;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;


/**
 * Created by TheAppExperts on 18/10/2017.
 */
public class AppDataManager implements DataManager {

    private ApiHelper apiHelper;

    public AppDataManager() {
        this.apiHelper = new AppApiHelper();
    }

    @Override
    public Observable<UserModel> useCaseOrgsList() {
        return apiHelper.useCaseOrgsList();
    }
}
