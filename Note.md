
@#
����import��һ��ģ�����???
�� app �� build.gredle �ļ��е� dependencies �����
implementation project(':demodownloadercore')

@#
AndroidManifest.xml �ļ��� <application �����
android:name="com.example.demodownloader.App"

@#
LinkedHashMap �������ʲô?? Ϊʲô������ʾ �����б�???

@#
@NonNullע��	��ô��?? ���κ���������ʲôЧ��??
private void addDownloader(@NonNull Downloader downloader) {

@#
���ѭ��???
for (Map.Entry<String, Downloader> stringDownloaderEntry : downloaderList.entrySet()) {

@#
ö��д��ʲôλ�ú�??? ֻ��ÿ��ö�ٵ���һ���ļ���?

@#
�ɼ���
Ĭ���ǰ��ڿɼ�, �����κ����η�
�ڲ��ཨ�������??

@#
Context ���Ǹ�ʲô����
���׵����ڴ�й©
�ο�: https://www.jianshu.com/p/94e0f9ab3f1d

@#
���ھ�̬������������ڳ�����ͨ�Ķ���, 
���農̬���� S, ��ͨ����A, ��ͨ����ĳ�ԱA.a, 
���S������A.a������, ��A����ʱ, A.a����S�����ö��޷�GC��, 
��͵������ڴ�й©.

@#
