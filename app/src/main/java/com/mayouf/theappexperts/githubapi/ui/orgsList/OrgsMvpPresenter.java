package com.mayouf.theappexperts.githubapi.ui.orgsList;

import com.mayouf.theappexperts.githubapi.DataManager;
import com.mayouf.theappexperts.githubapi.network.model.UserModel;
import com.mayouf.theappexperts.githubapi.ui.base.BasePresenter;
import com.mayouf.theappexperts.githubapi.ui.utils.rx.SchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by TheAppExperts on 07/11/2017.
 */

public class OrgsMvpPresenter
    <V extends IOrgsListMvpView>
    extends BasePresenter<V>
    implements IOrgsListMvpPresenter<V>{


    public OrgsMvpPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onViewPrepared() {
        getCompositeDisposable().add(getDataManager()
                .useCaseOrgsList()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<UserModel>() {
                               @Override
                               public void accept(UserModel userModel) throws Exception {
                                   getMvpView().onFetchDataCompleted(userModel);
                               }
                           },
                        new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                getMvpView().onError(throwable.getMessage());
                            }
                        }));
    }
}
