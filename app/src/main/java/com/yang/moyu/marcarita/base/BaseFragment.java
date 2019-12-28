package com.yang.moyu.marcarita.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Description : fragment 基类
 * Created by 10296 on 2019/12/28
 */
public abstract class BaseFragment extends Fragment {

    private View rootView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = inflater.inflate(createLayoutRes(), container, false);
        initView();
        initDatas();
        initListener();

        return rootView;
    }


    /**
     * 设置布局
     *
     * @return
     */
    protected abstract int createLayoutRes();

    /**
     * 初始化页面布局
     */
    protected abstract void initView();

    /**
     * 初始化页面数据
     */
    protected abstract void initDatas();

    protected <T extends View> T findView(@IdRes int id) {
        return findViewById(id);
    }

    protected <T extends View> T findViewById(@IdRes int id) {
        T viewById = (T) rootView.findViewById(id);
        return viewById;
    }


    /**
     * 初始化点击事件
     */
    protected void initListener() {
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
