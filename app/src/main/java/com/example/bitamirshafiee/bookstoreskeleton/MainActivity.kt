package com.example.bitamirshafiee.bookstoreskeleton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager)
        tabLayout = findViewById(R.id.tab_layout)

        val pagerAdapter = MyPagerAdapter(supportFragmentManager)

        viewPager.adapter = pagerAdapter

        tabLayout.setupWithViewPager(viewPager)
    }
}
