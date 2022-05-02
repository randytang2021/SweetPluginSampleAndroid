# SweetPluginSampleAndroid [![Sweet android plugin CI checker](https://github.com/randytang2021/SweetPluginSampleAndroid/actions/workflows/sweet_android_plugin_checker.yml/badge.svg)](https://github.com/randytang2021/SweetPluginSampleAndroid/actions/workflows/sweet_android_plugin_checker.yml)

- For maven publish, the Plugin/Library's AAR name is: **com.sweet.plugin: sample**
- sweet_android_development.properties
   * add this file in your machine's dir: ```System.properties['user.home']```
   * or specify an env variable: ```ANDROID_DEVELOPMENT_PROPERTIES_CI_PATH=/xx/xx/xx/```
   * ```
      sweet.maven.password=xxx 
      sweet.maven.username=xxx 
      sweet.maven.url=xxx 
     ```
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
- The source of truth of app placeholder is [EzywAppSampleAndroid](https://github.com/randytang2021/EzywAppSampleAndroid) repo on the [release branch](https://github.com/randytang2021/EzywAppSampleAndroid/tree/release/1.0.0.0)
- The aar publish history is in [EzywAppSampleAndroid's page](https://randytang2021.github.io/EzywAppSampleAndroid/)
