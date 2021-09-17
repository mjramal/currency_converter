package mario.training.currencyconverter

import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import kotlinx.android.synthetic.main.activity_result_page.*


class ResultPage : NavigationPane() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_page)

        val mDrawerLayout:DrawerLayout = findViewById(R.id.drawer_layout)
        onCreateDrawer(mDrawerLayout)
        val result = intent.getStringExtra("key")
        result_page.text = result
    }
}
