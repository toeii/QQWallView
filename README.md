# QQWalView

QQWallView 仿腾讯QQ个性标签 

## Screenshots

![](https://github.com/toeii/QQWallView/blob/master/demo.png)

## Gradle
Step 1. Add it in your root build.gradle at the end of repositories:

```XML
    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }
```
Step 2. Add the dependency

```XML
    dependencies {
            implementation 'com.github.toeii:QQWallView:1.0'
    }
```

## Apply

```java
    val qqWallView = findViewById<QQWallView>(R.id.tagView)
            
    qqWallView.setColors(0xFF333333.toInt(), 0xFF999999.toInt())
    
    val tags = ArrayList<String>()
    tags.add("小清新")
    tags.add("萌萌哒")
    tags.add("欧美控")
    tags.add("大叔")
    tags.add("二次元")
    tags.add("爱旅游")
    tags.add("IT男")
    qqWallView.setTags(tags)
    
    findViewById<View>(R.id.button).setOnClickListener {
        qqWallView.reTypeSetting() 
    }
```

