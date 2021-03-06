package com.example.viewbindingdemo.base

import android.os.Bundle
import android.widget.Toast
import com.example.viewbindingdemo.R
import com.example.viewbindingdemo.databinding.ActivityFirstBinding
import com.example.viewbindingdemo.databinding.DetailLayoutBinding

class FirstActivity : BaseBindingActivity<ActivityFirstBinding>() {

    private lateinit var detailLayoutBinding: DetailLayoutBinding

    override fun initView(savedInstanceState: Bundle?) {
        mBinding.textView.text = "Hello World"

        mBinding.titleBar.title.text = "这是一个标题"
        mBinding.titleBar.back.setOnClickListener {
            Toast.makeText(
                this@FirstActivity,
                "返回",
                Toast.LENGTH_SHORT
            ).show()
        }
        mBinding.titleBar.confirm.setOnClickListener {
            Toast.makeText(
                this@FirstActivity,
                "确定",
                Toast.LENGTH_SHORT
            ).show()
        }

        detailLayoutBinding = DetailLayoutBinding.bind(mBinding.root)
        detailLayoutBinding.ivDetail.setImageResource(R.mipmap.ic_launcher)
    }
}