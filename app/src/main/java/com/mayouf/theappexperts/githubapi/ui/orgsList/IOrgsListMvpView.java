package com.mayouf.theappexperts.githubapi.ui.orgsList;

import com.mayouf.theappexperts.githubapi.network.model.UserModel;
import com.mayouf.theappexperts.githubapi.ui.base.MvpView;

/**
 * Created by TheAppExperts on 07/11/2017.
 */

public interface IOrgsListMvpView extends MvpView {

    void onFetchDataCompleted(UserModel userModel);
}
