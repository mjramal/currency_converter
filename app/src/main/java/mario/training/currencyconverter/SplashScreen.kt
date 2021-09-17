package mario.training.currencyconverter


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class SplashScreen : AppCompatActivity() {

    private var mDelayHandler: Handler? = null
    private var splashDelay: Long = 3000
    private val mRunnable: Runnable = Runnable {

        val homeIntent = Intent(this, HomePage::class.java)
        finish()
        startActivity(homeIntent)
    }

    override fun onCreate(saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_splash_screen)
        mDelayHandler = Handler()
        mDelayHandler!!.postDelayed(mRunnable,splashDelay)
    }

    public override fun onDestroy(){
        if (mDelayHandler != null) {
            mDelayHandler!!.removeCallbacks(mRunnable)
        }

        super.onDestroy()

    }
}