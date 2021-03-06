[日本語](https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android/blob/master/README.ja.md)

Retractive Scroll Views for Android
======================

This is a library for Android.
This is a retractable HorizontalScrollView.
You can also sync scrolling in HorizontalScrollViews.
It supports Android 1.6 (API Level4) or later.

RetractiveHorizontalScrollView extends android.widget.HorizontalScrollView.
In the future, I might add RetractiveVerticalScrollView extends android.widget.ScrollView, if you want it.

Sample movies
--------

[Scrolling a retractive scroll view](http://www.youtube.com/watch?v=k03AD98olUY)

[Sync three scroll views](http://www.youtube.com/watch?v=9KZgaGCwQgI)

Download
------

### ver.0.1 ###

[ ![](https://github.com/images/modules/download/zip.png) ](https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android/zipball/0.1)
[ ![](https://github.com/images/modules/download/tar.png) ](https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android/zipball/0.1)

How to use
------

### How to retract a view ###

Create layout like this. And use [RetractiveHorizontalScrollView][rhsv] as [android.widget.HorizontalScrollView][hsv]. Complete example is [here][ex1].

	<nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView>
	  <LinearLayout>
	    <TextView/> <!-- left side -->
	    <TextView/> <!-- main content -->
	    <TextView/> <!-- right side -->
	  </LinearLayout>
	</nu.mine.tmyymmt.android.widget.RetractiveHorizontalScrollView>

### How to sync some RetractiveHorizontalScrollViews ###

Add some [RetractiveHorizontalScrollView][rhsv]s which you want to sync to another view by [RetractiveHorizontalScrollView#addSyncScrollView(RetractiveHorizontalScrollView syncScrollView)][rhsv]. Complete example is [here][ex2].

	RetractiveHorizontalScrollView scrollView1 = (RetractiveHorizontalScrollView) findViewById(R.id.scroll_view);
	RetractiveHorizontalScrollView scrollView2 = (RetractiveHorizontalScrollView) findViewById(R.id.scroll_view2);
	RetractiveHorizontalScrollView scrollView3 = (RetractiveHorizontalScrollView) findViewById(R.id.scroll_view3);
	
	// add scroll views which you want to sync with scrollView1.
	scrollView1.addSyncScrollView(scrollView2);
	scrollView1.addSyncScrollView(scrollView3);
	
	// add scroll views which you want to sync with scrollView2.
	scrollView2.addSyncScrollView(scrollView1);
	scrollView2.addSyncScrollView(scrollView3);
	
	// add scroll views which you want to sync with scrollView3.
	scrollView3.addSyncScrollView(scrollView1);
	scrollView3.addSyncScrollView(scrollView2);

Code Examples
--------

These are the same as movies.

Retractive-Scroll-Views-for-Android_example is [here][ex1].

Retractive-Scroll-Views-for-Android_example_sync is [here][ex2].

Javadoc
--------

Please see detail at [javadoc][rhsv].
  
License
----------
Copyright &copy; 2012 [ Tomoya Yamamoto 山本智世 ![profile_image] ][aboutme]

Distributed under the [MIT License](http://www.opensource.org/licenses/mit-license.php "MIT License").  

Contact
--------

[ Tomoya Yamamoto 山本智世 ![profile_image] ][aboutme] (tmyymmt+github@gmail.com)

Reference Information
--------

You can see good ideas for about this kind of thing in Japanese.

- [http://y-anz-m.blogspot.ca/2011/01/androidoverscroll.html](http://y-anz-m.blogspot.ca/2011/01/androidoverscroll.html)
- [http://d.hatena.ne.jp/hdk_embedded/20110102/1293906357](http://d.hatena.ne.jp/hdk_embedded/20110102/1293906357)
- [http://tomokey.blogspot.ca/2011/01/scrollview.html](http://tomokey.blogspot.ca/2011/01/scrollview.html)

[profile_image]: http://tmyymmt.mine.nu/profile/profile-sq_16.png "Profile Image"
[aboutme]: http://about.me/tmyymmt "about me"
[hsv]: http://developer.android.com/reference/android/widget/HorizontalScrollView.html
[rhsv]: http://tmyymmt.github.com/Retractive-Scroll-Views-for-Android/index.html?nu/mine/tmyymmt/android/widget/RetractiveHorizontalScrollView.html
[ex1]: https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android/blob/master/Retractive-Scroll-Views-for-Android_example/
[ex2]: https://github.com/tmyymmt/Retractive-Scroll-Views-for-Android/blob/master/Retractive-Scroll-Views-for-Android_example_sync/
