# policy-based-repo-android
🚀Policy based pattern is simple approach where you can align your data sources in a simple queue and pop the queue untill you get the required data. You can rearrange order of the data-sources and label them as policies so now your UI can request data in policies and all of it without any spaghetti code 


**A better approach to manage our repository with MVVM in android**

We've always been in situtions where we had to add new data sources to our repositories and then add the same as a fallback when getting data for UI. Well this is just another approach where you queue your data-sources and keep calling them untill you get your desired data.

The benifit of doing is not just less redundunt code but is also takes the pain of error handing and makes it clean.

You can read the complete article on its implementation
https://medium.com/@drabu/policy-based-repository-in-android-c6222f3e22c6
