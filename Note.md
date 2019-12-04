
====CZH====	关键字

@#
CardView ???

@#
android:layout_weight 这个值影响什么??
android:layout_height="0px"	设为0有什么意义??

@#
FragmentTransaction

@#
inflate 方法???

@#
动画相关???
ViewAnimator
Base class for a FrameLayout container that will perform animations when switching between its views.
FrameLayout容器的基类，当在其视图之间切换时将执行动画。

@#
Bundle getSerializable

@#
AndroidX
参考: https://developer.android.google.cn/jetpack/androidx
迁移到androidX: 查阅 支持库工件映射+支持库类映射

@#
Jetpack

~~~~~~~~~

@#
不能import另一个模块的类???
在 app 的 build.gredle 文件中的 dependencies 项添加
implementation project(':demodownloadercore')

@#
AndroidManifest.xml 文件中 <application 项添加
android:name="com.example.demodownloader.App"

@#
LinkedHashMap 这个类是什么?? 为什么用来表示 下载列表???

@#
@NonNull注解	怎么用?? 修饰函数参数有什么效果??
private void addDownloader(@NonNull Downloader downloader) {

@#
这个循环???
for (Map.Entry<String, Downloader> stringDownloaderEntry : downloaderList.entrySet()) {

@#
枚举写在什么位置好??? 只能每个枚举单独一个文件吗?

@#
可见性
默认是包内可见, 不加任何修饰符
内部类建议用这个??

@#
Context 这是个什么东西
容易导致内存泄漏
参考: https://www.jianshu.com/p/94e0f9ab3f1d

@#
由于静态对象的生命周期长于普通的对象, 
假设静态对象 S, 普通对象A, 普通对象的成员A.a, 
如果S保存了A.a的引用, 当A销毁时, A.a由于S的引用而无法GC掉, 
这就导致了内存泄漏.

@#
Android 列表控件怎么用?? 搞个demo出来
可以参考官方示例: https://github.com/googlearchive/android-RecyclerView#readme

@#
得总结下项目配置这些东西
从GitHub拉下来的源码要怎样跑起来???

@#
官方支持包
com.android.support:support-v4:24.2.1
参考: https://www.jianshu.com/p/f5f9a4fd22e8

@#		版本问题
Gradle版本
SDK版本
API版本
Android版本

SDK版本, API等级 一一对应关系, 查阅: https://developer.android.google.cn/guide/topics/manifest/uses-sdk-element#ApiLevels

@#
Fragment生命周期
参考: https://blog.csdn.net/manoel/article/details/7577353

