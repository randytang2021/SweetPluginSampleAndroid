package com.sweet.plugin.sample

import android.content.Intent
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
        "Plugin info: \nname:${BuildConfig.PLUGIN_NAME}, version:${BuildConfig.VERSION_NAME},".also { binding.pluginInfoTv.text = it }

        binding.doneB.setOnClickListener {
            val doneResult = Intent()
            doneResult.putExtra("PLUGIN_DONE", SampleMainActivity::class.simpleName)
            setResult(SampleMainActivity::class.qualifiedName.hashCode(), doneResult)
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        activitySampleMainBinding = null
    }
}