package com.sweet.plugin.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sweet.plugin.sample.databinding.ActivitySampleMainBinding

class SampleMainActivity : AppCompatActivity() {

    private var activitySampleMainBinding: ActivitySampleMainBinding? = null
    private val binding get() = activitySampleMainBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitySampleMainBinding = ActivitySampleMainBinding.inflate(layoutInflater)
        setContentView(activitySampleMainBinding?.root)
        binding.pluginInfoTv.text =
            "Plugin info: \nname:${BuildConfig.PLUGIN_NAME}, version:${BuildConfig.VERSION_NAME},"
    }

    override fun onDestroy() {
        super.onDestroy()
        activitySampleMainBinding = null
    }
}