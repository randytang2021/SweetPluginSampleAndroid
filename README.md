# SweetPluginSampleAndroid [![Wyze Plugin Build Checker](https://github.com/wyzelabs-inc/SweetPluginSampleAndroid/actions/workflows/wyze_plugin_build_checker.yml/badge.svg)](https://github.com/wyzelabs-inc/SweetPluginSampleAndroid/actions/workflows/wyze_plugin_build_checker.yml)
- For maven publish, the Plugin/Library's AAR name is: **com.sweet.plugin: sample**
- The AAR's version name convention should be:
    * [major verison][minor version][alpha, beta,release,develop][patch version]
         + for patch version, never need to change it
         + make sure your verison name has four sections
- In the [AndroidManifest.xml](src/main/AndroidManifest.xml) file, the Plugin/Library package name is: **com.sweet.plugin.sample**
- Please use this Intent to launch the SampleMainActivity:
```
        val intent = Intent()
        intent.component = ComponentName(
            BuildConfig.APPLICATION_ID,
            "com.sweet.plugin.sample.SampleMainActivity"
        )
```
## App placeholder
- The source of truth of app placeholder is [WyzeAppCisampleAndroid](https://github.com/wyzelabs-inc/WyzeAppCisampleAndroid) repo on the [main branch](https://github.com/wyzelabs-inc/WyzeAppCisampleAndroid/tree/main)
- The aar publish history is in [WyzeAppCisampleAndroid's page](https://congenial-spoon-5728117c.pages.github.io/)
