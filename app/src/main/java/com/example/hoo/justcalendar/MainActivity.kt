package com.example.hoo.justcalendar

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getAllMonth()
    }
    private fun getAllMonth(){
        val fragments = ArrayList<Fragment>()
        val month = arrayOf("1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월")
        for (i in month.indices){
            fragments.add(MonthFragment.newInstance(month[i]))
        }
        val adapter = MyPagerAdapter(supportFragmentManager)
        adapter.updateFragments(fragments)
        viewPager.adapter = adapter
        //viewPager.setBackgroundResource(R.drawable.bg1)
       //   Glide.with(this).load(R.drawable.bg1).into(viewPager)
    }
}


