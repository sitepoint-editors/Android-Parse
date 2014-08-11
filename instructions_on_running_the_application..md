##Instructions on running the application.

The project we just built uses the Android Support Library so you will need to have downloaded it into your SDK. To check if you have it, open the SDK Manager and scroll down to Extras. Make sure that `Android Support Library` and `Android Support Repository` are installed.

If you build the application from scratch, then your IDE (I refer to Eclipse here but will also provide instructions for Android Studio) will include the `v7 appcompact` library project when you create a new project (if it hasn't already been created by a previous project you did). This will appear in Eclipse's Project Explorer as `appcompat_v7`.

Your project will already be setup to use this library. To check on this right-click on your project and select Properties. On the left panel, select Android and in the Library pane, you should see `../appcompat_v7` referenced.

If you downloaded the completed project, it might have build errors related to problems with dependencies. If you are getting errors related to imports of any class in the `android.support.v7.app` package, then you need to add the support library.

To do this first make sure you have downloaded the `Android Support Library` and `Android Support Repository` with the SDK manager. Then in Eclipse select File -> Import -> Existing Android Code Into Workspace. Browse to where your SDK is installed and import the `appcompat` project. Its path is `<sdk-path>/extras/android/support/v7/appcompat/`

On clicking Finish, a new project folder will appear in the Project Explorer labelled `android-support-v7-appcompat`. Expand its `libs` folder and right click each .jar file and select Build Path > Add to Build Path. Right-click the library project folder and select Build Path > Configure Build Path. In the Order and Export tab, check the .jar files you just added to the build path and uncheck Android Dependencies. Click OK to complete the changes.

Right click your project (NoteApp), and select Properties. On the left panel, select Android and in the Library pane click on Add and select the library project (android-support-v7-appcompat).

Clean your project and the errors should have been fixed.

To add support libraries in Android Studio, check [these instructions](https://developer.android.com/tools/support-library/setup.html#libs-with-res)

Another problem you can encounter is a conflict with the .jar files. You could get an error such as:

	[2014-08-07 05:17:56 - NoteApp] Found 2 versions of android-support-v4.jar in the dependency list,
	[2014-08-07 05:17:56 - NoteApp] but not all the versions are identical (check is based on SHA-1 only at this time).
	[2014-08-07 05:17:56 - NoteApp] All versions of the libraries must be the same at this time.

This is a conflict of the .jar file in the support library project and the one in your project. Delete the `android-support-v4.jar` in your project's `libs` folder and copy the one in the support library project's `libs` folder to your project's `libs` folder. Clean the project and it should have no errors.

You could also get an error stating that "The onClick() must override a superclass method" and Eclipse will give you a suggestion to remove the `@Override` annotation. Ignore this and instead right-click on your project and select Properties -> Java Compiler. Click on the  Configure Workspace Settings link and make sure that the Compiler compliance level is set to 1.6 and not 1.5. The error was because of an [incompatibility between Java 1.5 and 1.6](http://stackoverflow.com/a/8697805/948567).

Remember to also include your Parse details in the `Parse.initialize()` call in `NoteAppApplication.java`.

The above instructions should be all you need to debug the project. If you have any issues or questions, then put them in the comments.