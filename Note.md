
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
