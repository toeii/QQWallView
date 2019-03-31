package com.toeii.qqwallview.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.toeii.qqwallview.QQWallView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val qqWallView = findViewById<QQWallView>(R.id.tagView)
        qqWallView.setColors(0xFF333333.toInt(), 0xFF999999.toInt())
        val tags = ArrayList<String>()
        tags.add("小清新")
        tags.add("萌萌哒")
        tags.add("欧美控")
        tags.add("大叔")
        tags.add("二次元")
        tags.add("爱旅游")
        tags.add("IT男")
        qqWallView.setTags(tags)
        findViewById<View>(R.id.button).setOnClickListener { qqWallView.reTypeSetting() }
    }
}
