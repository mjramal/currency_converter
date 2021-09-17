package mario.training.currencyconverter

import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import kotlinx.android.synthetic.main.activity_help_page.*

class HelpPage : NavigationPane() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help_page)

        val mDrawerLayout:DrawerLayout = findViewById(R.id.drawer_layout)
        onCreateDrawer(mDrawerLayout)
        help_page_ans_numcurr.text = homeFeed.rates.keySet().size.toString()
        help_page_ans_basecurr.text = homeFeed.base
    }
}