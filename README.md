![mantis ad network](https://github.com/mantisadnetwork/mantis-android-admob/raw/master/images/logo.png)

# AdMob Mediation Example

This project is just a quick "Hello World" on how to show AdMob ads in your Android application, as well as configuring MANTIS to display with mediation configured. For information about our mediation library, head to https://github.com/mantisadnetwork/mantis-android-admob/.

# Important Parts

## Project Properties

If you notice in your project.properties file there are two references to external libraries.

1. You will need to include our mediation library in your workspace for this application to build properly (https://github.com/mantisadnetwork/mantis-android-admob/)
2. You will need to include the Google Play Services library in your workspace (http://developer.android.com/google/play-services/setup.html)

## Android Manifest

Any tags in the AndroidManifest.xml that have a comment before them, are necessary parts for configuring both Google Play Services and AdMob.

## Main Activity

The activity is what ties it all together. It is up to you and how you designed your application to determine where it makes the most sense to initialize AdMob as well as configuring the MANTIS context object. **Make sure to update the AdUnitId with the one from your AdMob account prior to running, otherwise it won't work. Also, change the PropertyId with the one provide in the MANTIS interface.**