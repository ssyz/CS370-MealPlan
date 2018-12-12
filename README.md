# MealPlan

MealPlan is an Android Application for Emory students seeking an innovative approach towards a better end-to-end dining experience. It was fully implemented and pitched on December 5th, 2018 at Emory University.


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

You will need to have an Android Studio properly installed on the computer. Go [here](https://developer.android.com/studio/) and download the version that is operable on your computer environment. 

After installation of Android Studio, go to preference/Appearance & Behavior/System Setting/Android SDK and verify if you have downloaded the following SDK platforms:
```
Android 9.0 (Pie)
Android 5.0 (Lollipop)
```
And the following SDK tools:
```
Android SDK Build-Tools
CMake
LLDB
Android API Simulators
Android Auto Desktop Head Unit emulator
Android Emulator
Android SDK Platform-Tools
Android SDK Tools
Google Play APK Expansion library
Google Play Instant Development SDK
Google Play Licensing Library
Google Play services
Google Web Driver
Support Repository
```

### Installing

1. Open Project: Android studio will prompt you to load a project or make a new one. Click “ Open an existing Android Studio Project. Find the Project name that is associated with the mealplan app in your directory where it was downloaded to. With the Name of the file highlighted, click “open”.

2. Settings: The exact settings we used for Android Studio’s Android SDK are displayed in the prerequisites section. Please ensure the pathname to your Android SDK contains no whitespace, as this may cause issues with compiling later. In the event your pathname does contain whitespace, you may wish to store your SDK in a different path, or create a symbolic link to your current path that does not use whitespace instead. 

3. Emulator: The application can be launched on any device with Android 9.0 or higher. If you wish to use an emulator, we recommend using a Pixel 2 with API 28. Keep in mind that use of an emulator may reduce functionality, especially the use of the AR mode. While GPS will be functional after your fingerprint is added, Android Studio’s emulated location may not coincide with your computer’s location. Your emulator should be able to emulate GPS coordinates via LAT/LNG data after pressing the “Allow access for current location” option on your emulator. For reference, the approximate longitude and latitude of the Emory MSC are -84.325 and 33.791 respectively. 

4. Add fingerprints: To enable access to the Maps API, we must first add your device fingerprint to the allowed list for the out API key. Click the Logcat tab on the bottom of Android studio. It should be the 3rd tab from the left between Build and TODO. Search fingerprint in the search bar. A code that is mixed with letters and numbers separated by colons should appear. Open a browser and log in with the mealplan Gmail account. The login information is provided below. Open the [URL](https://console.cloud.google.com/apis/credentials?authuser=1&folder=&organizationId=&project=mealplan-370&fbclid=IwAR0HeN_HMQjI2OYzz_E_AMhXcSYcjZzA-XGXo0Pug7wVJK1eHJJutBBa92w). Click the pencil icon and choose “add a package name and fingerprint”. The Package name is “com.google.firebase.example.fireeats”. Add your fingerprint into the input bar next to the package name. Then, Click save and re-open the emulator and the map feature is ready to go.
```
User: janxinc370@gmail.com
Password: practicum
```

## Built With

* [Firebase](https://firebase.google.com/) - Cloud Database used
* [GitHub](https://github.com/) - Used for collaborative coding and version control
* [Google-Play-Services](https://developer.android.com/distribute/play-services/) - Used for Map APIs and a range of other functions
* [Emory Box](https://emory.account.box.com/) - Used to document the development process
* Third Party Dependencies Used to Build this Project can be found in this project’s app-level Gradle build file

## Authors and Main Responsibilities

* **Jorge Arce** - *Software Engineer* -
* **Noah Jaffe** - *Software Engineer* - 
* **Xinru Lu** - *Scrum Master* - 
* **Ashwin Shukla** - *Software Engineer* - 
* **Jay Syz** - *Product Owner* - 

The product belongs to all authors and the authors are sorted alphabetically by last names.

## License

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/ssyz/CS370-MealPlan/blob/master/LICENSE.md) file for details.

## Acknowledgments

* Limited access to our database console.firebase.google.com (Contact us for more information!)
* Special thanks to [Dr. Dorian Arnold](http://www.mathcs.emory.edu/~darnold/) for guidance and a great semester!
