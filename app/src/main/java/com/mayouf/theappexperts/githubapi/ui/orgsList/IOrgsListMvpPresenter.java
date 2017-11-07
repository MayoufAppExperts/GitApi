package com.mayouf.theappexperts.githubapi.ui.orgsList;

import com.mayouf.theappexperts.githubapi.ui.base.MvpPresenter;

/**
 * Created by TheAppExperts on 07/11/2017.
 */

public interface IOrgsListMvpPresenter<V extends IOrgsListMvpView> extends MvpPresenter<V> {

    void onViewPrepared();
}
