package com.example.dndmusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configureTabLayout()
    }

    private fun configureTabLayout(){
        val pagerMain = findViewById<ViewPager>(R.id.idPager)
        val tabNav = findViewById<TabLayout>(R.id.tabLayout)

        val adapter = TabPagerAdapter(supportFragmentManager, tabNav.tabCount)
        pagerMain.adapter = adapter
        pagerMain.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabNav))

        tabNav.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(p0: TabLayout.Tab) {
                pagerMain.currentItem = p0.position
            }

            override fun onTabReselected(p0: TabLayout.Tab) {
            }

            override fun onTabUnselected(p0: TabLayout.Tab) {
            }
        })
    }
}
