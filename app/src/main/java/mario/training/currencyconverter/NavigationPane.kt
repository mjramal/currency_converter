package mario.training.currencyconverter

import android.content.Intent
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

var userID:String?= "mario.ramalhoso@atos.net"
var user_name:String?="Mario Ramalhoso"

open class NavigationPane: AppCompatActivity() {

    private lateinit var mToggle: ActionBarDrawerToggle

    fun onCreateDrawer(mDrawerLayout: DrawerLayout) {

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        val headerView = navigationView.getHeaderView(0)
        val emailId: TextView = headerView.findViewById(R.id.email_ID)
        val nameId: TextView = headerView.findViewById(R.id.name_ID)

        emailId.text = userID
        nameId.text = user_name

        mToggle = ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close)
        mDrawerLayout.addDrawerListener(mToggle)
        mToggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navigationView.setNavigationItemSelectedListener { menuItem ->
            menuItem.isChecked = true
            mDrawerLayout.closeDrawers()

            when (menuItem.itemId) {

                R.id.home -> {
                    val homePage = Unit
                    val homeIntent = Intent(this, HomePage::class.java)
                    startActivity(homeIntent)
                    true
                }
                R.id.market_status -> {
                    val marketStatusIntent = Intent(this, MarketStatusPage::class.java)
                    startActivity(marketStatusIntent)
                    true

                }

                R.id.help -> {
                    val helpIntent = Intent(this, HelpPage::class.java)
                    startActivity(helpIntent)
                    true
                }

                R.id.contact -> {
                    Toast.makeText(this, "Visit: tu chiringuito", Toast.LENGTH_LONG).show()
                    true

                }

                else -> throw AssertionError()
            }


        }

        fun onOptionsItemSelected(item: MenuItem): Boolean {
            if (mToggle.onOptionsItemSelected(item)){
                return true
            }
            return super.onOptionsItemSelected(item)
        }
    }
}








