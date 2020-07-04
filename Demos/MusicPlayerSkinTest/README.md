# MusicPlayerSkinTest
极客时间[`Kotlin`课程](https://time.geekbang.org/course/detail/100009801-10674)第一章小测试。

Target
---------------------
实现一个音乐播放器，有系统内置的两种皮肤，每个用户都可以选择
自己的播放器皮肤颜色，当不同的用户登录以后，显示不同的播放器皮肤，
同时需要注意皮肤颜色的可扩展性。

Description
---------------------
简单实现了不同角色登录显示不同皮肤，**VIP用户**可以自定制颜色。
`SkinManager`中默认定义了**Tom**、**Bob**和**Marry**三个角色，登录有不同颜色的皮肤，其余输入默认红色。

Points
---------------------
* [类定义、函数重载](app/src/main/java/com/yu/hu/musicplayerskintest/skin/PlayerSkin.kt)
* [密闭类](app/src/main/java/com/yu/hu/musicplayerskintest/skin/PlayerViewType.kt)
