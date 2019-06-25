# custom-snackbar-lib
This  lib used to show custom snack bar 


To get a Git project into your build:

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}


Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.dhirajaknurwar:custom-snackbar-lib:1.0'
	}


For Success SnackBar

CustomSnackBar.showSnackBarSuccess(v, getApplicationContext(), "Success Snack Bar", 10);

For Error SnackBar

 CustomSnackBar.showSnackBarError(v, "Error Snack Bar", 10);
