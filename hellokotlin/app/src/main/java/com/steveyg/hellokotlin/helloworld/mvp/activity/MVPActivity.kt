package com.steveyg.hellokotlin.helloworld.mvp.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.steveyg.hellokotlin.R
import com.steveyg.hellokotlin.helloworld.mvp.model.MyModel
import com.steveyg.hellokotlin.helloworld.mvp.presenter.MyPresenter
import com.steveyg.hellokotlin.helloworld.mvp.view.IMyView
import kotlinx.android.synthetic.main.mvp_layout.*

/**
 * Created by steveyg on 17/5/23.
 */

class MVPActivity : AppCompatActivity(), IMyView {
    override fun showSuccess(model: MyModel) {
        Toast.makeText(this, model.str, Toast.LENGTH_LONG).show()
    }

    override fun getStr(): String {
        return edit.text.toString()
    }

    var mPresenter: MyPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mvp_layout)
        init()
    }

    fun init() {
        mPresenter = MyPresenter(MVPActivity@ this)
        submit.setOnClickListener {
            mPresenter?.exec()
        }
    }
}