package com.example.dndmusic

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabPagerAdapter(fm: FragmentManager, private var tabCount: Int) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {
        when(position) {
            0 -> return FragHome()
            1 -> return FragMusic()
            2 -> return FragMixer()
            3 -> return FragGenre()
            4 -> return FragScenario()
            else -> return null
        }
    }

    override fun getCount(): Int {
        return tabCount
    }
}