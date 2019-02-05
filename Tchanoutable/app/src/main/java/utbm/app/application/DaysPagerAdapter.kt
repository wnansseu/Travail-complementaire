package utbm.app.application

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import utbm.app.application.model.Class

class DaysPagerAdapter(val timetable: ArrayList<Class>, fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment = DayFragment.new(position + 1, timetable)

    override fun getCount(): Int = 6

    /**
     * I hardcoded day strings since this is a personal app that won't be shared or translated.
     * Should use resources otherwise.
     */
    override fun getPageTitle(position: Int): CharSequence {
        when (position) {
            0 -> return "Lundi"
            1 -> return "Mardi"
            2 -> return "Mercredi"
            3 -> return "jeudi"
            4 -> return "Vendredi"
            5 -> return "samedi"
            else -> return "?"
        }
    }
}
