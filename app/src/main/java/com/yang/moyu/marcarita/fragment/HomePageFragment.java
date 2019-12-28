package com.yang.moyu.marcarita.fragment;

import androidx.recyclerview.widget.RecyclerView;

import com.yang.moyu.marcarita.R;
import com.yang.moyu.marcarita.base.BaseFragment;

/**
 * Description :首页
 * Created by 10296 on 2019/12/28
 */
public class HomePageFragment extends BaseFragment {


    private HomePageFragment fragment;
    private RecyclerView mRecycleView;

    public HomePageFragment getInstance() {
        fragment = new HomePageFragment();
        return fragment;
    }


    @Override
    protected int createLayoutRes() {
        return R.layout.fragment_homepage;
    }

    @Override
    protected void initView() {
        mRecycleView = findView(R.id.recycle_view);
    }

    @Override
    protected void initDatas() {





//        mRecycleView.setAdapter();
    }
}
