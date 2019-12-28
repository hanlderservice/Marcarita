package com.yang.moyu.marcarita.fragment;

import com.yang.moyu.marcarita.R;
import com.yang.moyu.marcarita.base.BaseFragment;

/**
 * Description :
 * Created by 10296 on 2019/12/28
 */
public class ClassifyFragment extends BaseFragment {

    private static ClassifyFragment fragment;

    public ClassifyFragment getInstance() {
        fragment = new ClassifyFragment();
        return fragment;
    }
    @Override
    protected int createLayoutRes() {
        return R.layout.fragment_classify;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initDatas() {

    }
}
