# ExpandableTextView
An expandable TextView for Android applications

# Add dependency

Add it in your root build.gradle at the end of repositories:

```ruby
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

# Step 2. Add the dependency

```ruby
	dependencies {
	        compile 'com.github.ssszmath:ExpandableTextView:1.0'
	}
```

# Usage

```ruby
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context="ir.s.s.libary.MainActivity">

    <ir.s.s.expandabletextview.MyView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/myview"
        android:padding="18dp">

    </ir.s.s.expandabletextview.MyView>


</LinearLayout>
```

In your Activity or Fragment:

```ruby
MyView myView=new MyView(this);

myView=(MyView) findViewById(R.id.myview);

myView.setTextView("YOUR OWN TEXT ..... ");

```
