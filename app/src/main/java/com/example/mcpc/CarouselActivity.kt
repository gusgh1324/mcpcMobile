package com.example.mcpc

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import com.example.mcpc.ui.MecuActivity
import com.example.mcpc.ui.OrderActivity
import com.example.mcpc.ui.ReviewActivity
import com.example.mcpc.worldcup.MenuWorldcupActivity

class CarouselActivity : AppCompatActivity() {
    private var selectedIndex: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = intent.getIntExtra("layout_file_id", R.layout.motion_demo)
        setContentView(layout)

        val motionLayout = findViewById<MotionLayout>(R.id.motion_container)

        val v1 = findViewById<View>(R.id.v1)
        val v2 = findViewById<View>(R.id.v2)
        val v3 = findViewById<View>(R.id.v3)
        val v4 = findViewById<View>(R.id.v4)

        v1.setOnClickListener {
            if (selectedIndex == 0) {
                startActivity(Intent(applicationContext, MecuActivity::class.java))
                return@setOnClickListener
            }

            motionLayout.setTransition(R.id.s2, R.id.s1) //orange to blue transition
            motionLayout.transitionToEnd()
            selectedIndex = 0;
        }
        v2.setOnClickListener {
            if (selectedIndex == 1) {
                startActivity(Intent(applicationContext, MenuWorldcupActivity::class.java))
                return@setOnClickListener
            }
            if (selectedIndex == 2) {
                motionLayout.setTransition(R.id.s3, R.id.s2)  //red to orange transition
            } else {
                motionLayout.setTransition(R.id.s1, R.id.s2) //blue to orange transition
            }
            motionLayout.transitionToEnd()
            selectedIndex = 1;
        }
        v3.setOnClickListener {
            if (selectedIndex == 2) {
                startActivity(Intent(applicationContext, OrderActivity::class.java))
                return@setOnClickListener
            }
            if (selectedIndex == 3) {
                motionLayout.setTransition(R.id.s4, R.id.s3)
            }else{
                motionLayout.setTransition(R.id.s2, R.id.s3)
            }
            motionLayout.transitionToEnd()
            selectedIndex = 2;
        }
        v4.setOnClickListener {
            if (selectedIndex == 3) {
                startActivity(Intent(applicationContext, ReviewActivity::class.java))
                return@setOnClickListener
            }
            motionLayout.setTransition(R.id.s3, R.id.s4) //orange to red transition
            motionLayout.transitionToEnd()
            selectedIndex = 3;
        }
    }
}