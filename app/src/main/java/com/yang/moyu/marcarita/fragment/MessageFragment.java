package com.yang.moyu.marcarita.fragment;

import com.yang.moyu.marcarita.R;
import com.yang.moyu.marcarita.base.BaseFragment;

/**
 * Description :
 * Created by 10296 on 2019/12/28
 */
public class MessageFragment extends BaseFragment {

    private static MessageFragment fragment;

    public MessageFragment getInstance() {
        fragment = new MessageFragment();
        return fragment;
    }
    @Override
    protected int createLayoutRes() {
        return R.layout.fragment_message;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initDatas() {

    }
}
