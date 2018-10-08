# hello-android
Minimal hello app with test for Android using Gradle Command-Line

# build

- install sdk-tools from android website (download archive and unpack)
- use sdkmanager that is in sdk-tools/bin
- install build-tools with same version as in build.gradle. you can list options using 'sdkmanager --list'.
For example: sdkmanager "build-tools;28.0.3"
sdkmanager installs build-tools as sibling to sdk-tools by default. It's possible to change with --sdk_root=path
- export ANDROID_HOME variable with folder where is build-tools folder located (sdk_root)
- agree with licenses via 'sdkmanager --licenses'. You can use 'yes | sdkmanager --licenses'
- install gradle
- run 'gradle build'
- install adb to connect to your device 'sudo apt-get install android-tools-adb'
- run adb devices
- connect your device via usb, enable Developer options, USB-debugging and USB configuration as Media Transfer Protocol (MTP).
- run 'adb -d install build/outputs/apk/debug/hello-android-debug.apk' to install app on device

# test on device

- connect device via usb, enable Developer options, USB-debugging and USB configuration as Media Transfer Protocol (MTP).
- 'gradle connectedAndroidTest'