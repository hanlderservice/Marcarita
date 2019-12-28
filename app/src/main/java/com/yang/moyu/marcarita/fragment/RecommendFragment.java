package com.yang.moyu.marcarita.fragment;

import com.yang.moyu.marcarita.R;
import com.yang.moyu.marcarita.base.BaseFragment;

/**
 * Description :
 * Created by 10296 on 2019/12/28
 */
public class RecommendFragment extends BaseFragment {

    private static RecommendFragment fragment;

    public RecommendFragment getInstance() {
        fragment = new RecommendFragment();
        return fragment;
    }

    @Override
    protected int createLayoutRes() {
        return R.layout.fragment_recommend;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initDatas() {

    }
}
