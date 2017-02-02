RigidWebView
===============

# Intro

This is an unofficial mirror for [RigidWebView](
https://github.com/k9mail/k-9/blob/master/k9mail/src/main/java/com/fsck/k9/view/RigidWebView.java) developed by k9mail team.

A custom WebView that is robust to rapid resize events in sequence.
This is useful for a WebView which needs to have a layout of `WRAP_CONTENT`, since any
contents with percent-based height will force the WebView to infinitely expand (or shrink).


## Gradle

```
compile 'io.github.jisung:rigidwebview:1.0.0'
```

## License

    Copyright (C) 2011 The Android Open Source Project

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
