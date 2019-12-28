package com.yang.moyu.marcarita.fragment;

import com.yang.moyu.marcarita.R;
import com.yang.moyu.marcarita.base.BaseFragment;

/**
 * Description :
 * Created by 10296 on 2019/12/28
 */
public class MineFragment extends BaseFragment {

    private static MineFragment fragment;

    public MineFragment getInstance() {
        fragment = new MineFragment();
        return fragment;
    }

    @Override
    protected int createLayoutRes() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initDatas() {

    }
}
