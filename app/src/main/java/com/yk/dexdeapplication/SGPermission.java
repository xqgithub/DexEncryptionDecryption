package com.yk.dexdeapplication;

import android.Manifest;
import android.app.Activity;


import com.lisn.rxpermissionlibrary.permissions.RxPermissions;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class SGPermission {

    /**
     * 获取动态权限
     */
    public static void getPermission(Activity activity) {
        //region Permissions
        RxPermissions rxPermissions = new RxPermissions(activity );
        rxPermissions.request(Manifest.permission.VIBRATE,
                Manifest.permission.ACCESS_WIFI_STATE,
                Manifest.permission.CHANGE_WIFI_STATE,
                Manifest.permission.WAKE_LOCK,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_NETWORK_STATE,
                Manifest.permission.CHANGE_NETWORK_STATE,
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.READ_PHONE_STATE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE).subscribe(new Observer<Boolean>() {
            @Override
            public void onSubscribe(Disposable d) {
            }

            @Override
            public void onNext(Boolean aBoolean) {
                if (aBoolean) {
                }
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
        //endregion
    }
}
