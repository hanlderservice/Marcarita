package com.yang.moyu.marcarita;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.yang.moyu.marcarita.base.BaseActivity;
import com.yang.moyu.marcarita.fragment.ClassifyFragment;
import com.yang.moyu.marcarita.fragment.HomePageFragment;
import com.yang.moyu.marcarita.fragment.MessageFragment;
import com.yang.moyu.marcarita.fragment.MineFragment;
import com.yang.moyu.marcarita.fragment.RecommendFragment;

public class MainActivity extends BaseActivity {

    private Button[] mTabs;
    private Fragment[] fragments;
    private int index;
    private int currentTabIndex;
    private HomePageFragment mHomepageFragment;
    private RecommendFragment mRecommendFragment;
    private MineFragment mMineFragment;
    private ClassifyFragment mClassifyFragment;
    private MessageFragment mMessageFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initDatas();
    }

    private void initView() {
        mTabs = new Button[5];
        mTabs[0] = findViewById(R.id.btn_homepage);
        mTabs[1] = findViewById(R.id.btn_recommend);
        mTabs[2] = findViewById(R.id.btn_classify);
        mTabs[3] = findViewById(R.id.btn_message);
        mTabs[4] = findViewById(R.id.btn_mine);
        mTabs[0].setSelected(true);
    }

    private void initDatas() {
        mHomepageFragment = new HomePageFragment().getInstance();
        mRecommendFragment = new RecommendFragment().getInstance();
        mClassifyFragment = new ClassifyFragment().getInstance();
        mMessageFragment = new MessageFragment().getInstance();
        mMineFragment = new MineFragment().getInstance();

        fragments = new Fragment[]{mHomepageFragment, mRecommendFragment,
                mClassifyFragment, mMessageFragment, mMineFragment};


        getSupportFragmentManager().beginTransaction().add(R.id.fl_container, mHomepageFragment)
                .add(R.id.fl_container, mRecommendFragment)
                .hide(mRecommendFragment)
                .show(mHomepageFragment)
                .commit();
    }

    public void onTabClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_homepage:
                index = 0;
                break;
            case R.id.btn_recommend:
                index = 1;
                break;
            case R.id.btn_classify:
                index = 2;
                break;
            case R.id.btn_message:
                index = 3;
                break;
            case R.id.btn_mine:
                index = 4;
                break;
            default:
                index = 0;
                break;
        }

        if (currentTabIndex != index) {
            FragmentTransaction trx = getSupportFragmentManager().beginTransaction();
            trx.hide(fragments[currentTabIndex]);
            if (!fragments[index].isAdded()) {
                trx.add(R.id.fl_container, fragments[index]);
            }
            trx.show(fragments[index]).commit();
        }
        mTabs[currentTabIndex].setSelected(false);
        mTabs[index].setSelected(true);
        currentTabIndex = index;
    }
}
