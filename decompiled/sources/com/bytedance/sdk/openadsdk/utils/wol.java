package com.bytedance.sdk.openadsdk.utils;

import A1.b;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import app.notifee.core.event.LogEvent;
import com.bykv.vk.openvk.kq.kq.kq.bob.c;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wol {
    public static Integer kq;
    private static String nze;
    private static String suf;
    private static final HashSet<String> ubx;
    private static final byte[] vvw;
    private static final byte[] wki;
    private static final ExecutorService oq = Executors.newSingleThreadExecutor();
    private static volatile boolean bob = false;
    private static final AtomicInteger fou = new AtomicInteger(0);
    private static volatile String csi = "";
    private static final ReentrantLock rhi = new ReentrantLock();
    private static String rjo = null;
    private static String syt = null;
    private static String dgq = null;
    private static final HashSet<String> nn = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.wol$2, reason: invalid class name */
    static class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(wol.csi)) {
                    com.bytedance.sdk.component.dgq.rhi rhiVar = new com.bytedance.sdk.component.dgq.rhi(com.bytedance.sdk.openadsdk.core.sns.kq(), com.bytedance.sdk.component.dgq.rhi.bob.USER_AGENT);
                    rhiVar.setWebViewClient(new com.bytedance.sdk.component.dgq.rhi.kq());
                    String unused = wol.csi = rhiVar.getUserAgentString();
                    com.bytedance.sdk.component.utils.ha.kq(rhiVar);
                }
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.fax.kq("TTAD.ToolUtils", "", e10);
            } catch (NoClassDefFoundError e11) {
                com.bytedance.sdk.component.utils.fax.kq("TTAD.ToolUtils", "", e11);
            }
        }
    }

    private static class bob {
        private static final int kq;

        static {
            com.bytedance.sdk.component.utils.fax.kq("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod start status = 0");
            int i10 = 2;
            try {
                int i11 = RecyclerView.D.f10485a;
                if (RecyclerView.D.class.getDeclaredMethod("getBindingAdapterPosition", null) != null) {
                    i10 = 0;
                }
            } catch (ClassNotFoundException unused) {
                i10 = 1;
            } catch (NoSuchMethodException unused2) {
            }
            kq = i10;
            com.bytedance.sdk.component.utils.fax.kq("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod end status = ".concat(String.valueOf(i10)));
        }
    }

    public static class kq implements Callable<String> {
        private final int kq;

        kq(int i10) {
            this.kq = i10;
        }

        private synchronized String bob() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.wol.kq.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = wol.xn();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                com.bytedance.sdk.component.utils.fax.bob("TTAD.ToolUtils", e10.getMessage());
            }
            return strArr[0];
        }

        private String oq() {
            String property;
            Throwable th;
            try {
                property = System.getProperty("http.agent");
                if (property != null) {
                    try {
                        if (!"unKnow".equals(property)) {
                            if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                                com.bytedance.sdk.openadsdk.multipro.fou.kq.kq("sp_multi_ua_data", "android_system_ua", property);
                                return property;
                            }
                            com.bytedance.sdk.openadsdk.core.bob.kq().kq("android_system_ua", property);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.component.utils.fax.bob("getUA", "e:" + th.getMessage());
                        return property;
                    }
                }
                return property;
            } catch (Throwable th3) {
                property = "unKnow";
                th = th3;
            }
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public synchronized String call() {
            String strOq;
            try {
                strOq = "unKnow";
                int i10 = this.kq;
                if (i10 == 1) {
                    strOq = bob();
                } else if (i10 == 2) {
                    strOq = oq();
                }
            } catch (Throwable th) {
                throw th;
            }
            return strOq;
        }
    }

    public static class oq {
        public final ComponentName kq;
        public final int oq;

        public oq(ComponentName componentName, int i10) {
            this.kq = componentName;
            this.oq = i10;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        ubx = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        kq = null;
        vvw = new byte[]{108, 111, 97, 100, 105, 110, 103};
        wki = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    public static String bob(int i10) {
        if (i10 == 1) {
            return "banner_ad";
        }
        if (i10 == 2) {
            return "interaction";
        }
        if (i10 == 3 || i10 == 4) {
            return "open_ad";
        }
        if (i10 != 7) {
            return i10 != 8 ? "embeded_ad" : "fullscreen_interstitial_ad";
        }
        return "rewarded_video";
    }

    public static boolean csi(int i10) {
        return i10 == 5;
    }

    public static String dgq() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.sns.kq().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j10 = memoryInfo.totalMem;
            if (j10 > 0) {
                return String.valueOf(j10 / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String ebt() {
        int i10 = -ou();
        return i10 >= 0 ? "Etc/GMT+".concat(String.valueOf(i10)) : "Etc/GMT".concat(String.valueOf(i10));
    }

    public static String fax() {
        String strZp = com.bytedance.sdk.openadsdk.core.settings.ubx.zp();
        if (!TextUtils.isEmpty(strZp)) {
            return strZp;
        }
        String strWee = com.bytedance.sdk.openadsdk.core.sns.fou().wee();
        return TextUtils.isEmpty(strWee) ? jhe.kq() : strWee;
    }

    public static int fgm() {
        return bob.kq;
    }

    public static boolean fou(int i10) {
        return i10 == 4;
    }

    public static String gm() {
        String strVd = com.bytedance.sdk.openadsdk.core.sns.fou().vd();
        if (!TextUtils.isEmpty(strVd)) {
            return strVd;
        }
        String strKq = jhe.kq();
        if (TextUtils.isEmpty(strKq)) {
            return strVd;
        }
        return "https://" + strKq + "/service/2/dual_events/";
    }

    public static String ha() {
        String str = nze;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(wki);
        nze = str2;
        return str2;
    }

    public static boolean ibd() {
        return fou.get() == 1;
    }

    public static String jhe() {
        return "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/renderer/package_tx.json";
    }

    public static void kq(@NonNull com.bytedance.sdk.openadsdk.core.model.uml umlVar, @NonNull View view) {
    }

    public static String mq() {
        return String.format("https://%s", "log.byteoversea.com/service/2/app_log_test/");
    }

    public static int mxq() {
        return com.bytedance.sdk.openadsdk.core.bob.kq().oq("is_root", -1);
    }

    public static int nb() {
        try {
            String id = TimeZone.getDefault().getID();
            if (nn.contains(id)) {
                return 2;
            }
            if (id != null && id.startsWith("Asia/")) {
                return 2;
            }
            if (id == null || !id.startsWith("Europe/")) {
                return (id == null || !id.startsWith("America/") || ubx.contains(id)) ? 3 : 5;
            }
            return 4;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("TTAD.ToolUtils", th.toString());
            return 0;
        }
    }

    public static String nn() {
        return com.bytedance.sdk.openadsdk.core.bob.kq().oq("total_memory", "0");
    }

    private static boolean nz() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static long nze() {
        try {
            if (!nz()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("TTAD.ToolUtils", th.getMessage());
            return 0L;
        }
    }

    public static boolean oq(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.oq.kq(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static int ou() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static boolean rhi(int i10) {
        return i10 == 6;
    }

    public static int rjo(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 4) {
            return 1;
        }
        if (i10 == 5) {
            return 4;
        }
        if (i10 != 6) {
            return i10;
        }
        return 5;
    }

    public static String rs() {
        String str = suf;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(vvw);
        suf = str2;
        return str2;
    }

    public static boolean sns() {
        try {
            return new File("/system/bin/su").exists() || new File("/system/xbin/su").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static long suf() {
        return com.bytedance.sdk.openadsdk.core.bob.kq().oq("total_sdcard_storage", 0L).longValue();
    }

    public static synchronized String syt() {
        try {
            if (TextUtils.isEmpty(dgq) && com.bytedance.sdk.openadsdk.core.sns.kq() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.sns.kq().getPackageManager().getPackageInfo(rhi(), 0);
                    syt = String.valueOf(packageInfo.versionCode);
                    dgq = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.fax.kq("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return dgq;
    }

    public static String uml() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.fax.bob("TTAD.ToolUtils", e10.toString());
            return "";
        }
    }

    public static long vvw() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String wcx() {
        String strBss = com.bytedance.sdk.openadsdk.core.sns.fou().bss();
        return TextUtils.isEmpty(strBss) ? jhe.kq() : strBss;
    }

    public static long wki() {
        return com.bytedance.sdk.openadsdk.core.bob.kq().oq("free_internal_storage", 0L).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String xn() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.sns.kq());
            webView.setWebViewClient(new com.bytedance.sdk.component.dgq.rhi.kq());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                    com.bytedance.sdk.openadsdk.multipro.fou.kq.kq("sp_multi_ua_data", "webview_ua", userAgentString);
                    return userAgentString;
                }
                com.bytedance.sdk.openadsdk.core.bob.kq().kq("webview_ua", userAgentString);
            }
            return userAgentString;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    public static String csi() {
        return ebt.kq();
    }

    public static boolean fou(Context context) {
        return false;
    }

    public static void nn(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.fax.bob("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.", new Object[0]);
    }

    public static synchronized String rhi() {
        Context contextKq;
        try {
            if (TextUtils.isEmpty(rjo) && (contextKq = com.bytedance.sdk.openadsdk.core.sns.kq()) != null) {
                try {
                    rjo = contextKq.getPackageName();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.fax.kq("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return rjo;
    }

    public static synchronized String rjo() {
        try {
            if (TextUtils.isEmpty(syt) && com.bytedance.sdk.openadsdk.core.sns.kq() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.sns.kq().getPackageManager().getPackageInfo(rhi(), 0);
                    syt = String.valueOf(packageInfo.versionCode);
                    dgq = packageInfo.versionName;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.fax.kq("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return syt;
    }

    public static String ubx() {
        return bob("MemTotal");
    }

    public static String csi(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.sns.fou().tvh();
        }
        if (TextUtils.isEmpty(str)) {
            return "https://api16-access-ttp.tiktokpangle.us/service/2/app_log/";
        }
        return !str.startsWith("http") ? "https://".concat(str) : str;
    }

    public static String fou() {
        if (!TextUtils.isEmpty(csi)) {
            return csi;
        }
        com.bytedance.sdk.openadsdk.multipro.bob.kq(com.bytedance.sdk.openadsdk.core.sns.kq());
        String strKq = com.bytedance.sdk.openadsdk.core.dgq.kq("sdk_local_web_ua", 86400000L);
        csi = strKq;
        if (TextUtils.isEmpty(strKq)) {
            ReentrantLock reentrantLock = rhi;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(csi)) {
                            csi = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.sns.kq());
                        }
                        com.bytedance.sdk.openadsdk.core.dgq.kq("sdk_local_web_ua", csi);
                        reentrantLock.unlock();
                    } catch (Exception e10) {
                        com.bytedance.sdk.component.utils.fax.kq("TTAD.ToolUtils", "", e10);
                        rhi.unlock();
                    } catch (NoClassDefFoundError e11) {
                        com.bytedance.sdk.component.utils.fax.kq("TTAD.ToolUtils", "", e11);
                        rhi.unlock();
                    }
                }
            } catch (Throwable th) {
                rhi.unlock();
                throw th;
            }
        }
        return csi;
    }

    public static Intent kq(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static int nn(Context context) {
        List<ResolveInfo> listQueryIntentActivities;
        Integer num = kq;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        int size = listQueryIntentActivities.size();
        kq = Integer.valueOf(size);
        return size;
    }

    private static String vvw(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", rjo()).toString();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.fax.bob("TTAD.ToolUtils", e10.getMessage());
            return str;
        }
    }

    public static void bob() {
        com.bytedance.sdk.openadsdk.mxq.bob.kq("recycle_version_not_valid", false, new com.bytedance.sdk.openadsdk.mxq.oq() { // from class: com.bytedance.sdk.openadsdk.utils.wol.1
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_exist", wol.fgm());
                return com.bytedance.sdk.openadsdk.mxq.kq.fou.oq().kq("recycle_version_not_valid").oq(jSONObject.toString());
            }
        });
    }

    public static boolean dgq(String str) {
        if (com.bytedance.sdk.openadsdk.core.suf.csi()) {
            return true;
        }
        com.bytedance.sdk.component.utils.fax.bob("You must use method '" + str + "' after initialization, please check.", new Object[0]);
        return false;
    }

    public static String oq(int i10) {
        if (i10 == 1) {
            return "embeded_ad_landingpage";
        }
        if (i10 == 2) {
            return "banner_ad_landingpage";
        }
        if (i10 == 3) {
            return "interaction_landingpage";
        }
        if (i10 == 4) {
            return "splash_ad_landingpage";
        }
        if (i10 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i10 != 7) {
            return "unknow";
        }
        return "rewarded_video_landingpage";
    }

    public static boolean rhi(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String bob(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        try {
            fileReader = new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
            try {
                bufferedReader = new BufferedReader(fileReader, CodedOutputStream.DEFAULT_BUFFER_SIZE);
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            com.bytedance.sdk.component.utils.fax.bob("TTAD.ToolUtils", th.getMessage());
                            return null;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                } while (!line.contains(str));
                if (line == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused4) {
                    }
                    return null;
                }
                String str2 = line.split("\\s+")[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused5) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused6) {
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static boolean csi(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
        }
    }

    public static void dgq(Context context) {
        try {
            AtomicInteger atomicInteger = fou;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean zIsEnabled = accessibilityManager.isEnabled();
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (zIsEnabled && zIsTouchExplorationEnabled) {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.mxq.bob.kq().bob();
            } else {
                atomicInteger.set(2);
            }
        } catch (Exception unused) {
            fou.set(2);
        }
    }

    @NonNull
    public static oq kq(Context context, Intent intent) {
        return new oq(null, 0);
    }

    public static boolean kq() {
        return (com.bytedance.sdk.openadsdk.core.nze.kq() == null || com.bytedance.sdk.openadsdk.core.nze.kq().fou()) ? false : true;
    }

    public static int rhi(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("TTAD.ToolUtils", th.getMessage());
            return -1;
        }
    }

    public static void syt(final String str) {
        com.bytedance.sdk.openadsdk.mxq.bob.kq();
        com.bytedance.sdk.openadsdk.mxq.bob.kq("reportMultiLog", false, new com.bytedance.sdk.openadsdk.mxq.oq() { // from class: com.bytedance.sdk.openadsdk.utils.wol.3
            @Override // com.bytedance.sdk.openadsdk.mxq.oq
            public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() throws JSONException {
                if (wol.bob || !com.bytedance.sdk.openadsdk.core.sns.fou().ui()) {
                    return null;
                }
                boolean unused = wol.bob = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(LogEvent.LEVEL_ERROR, str);
                return com.bytedance.sdk.openadsdk.mxq.kq.fou.oq().kq("reportMultiLog").oq(jSONObject.toString());
            }
        });
    }

    public static String kq(int i10) {
        if (i10 == 1) {
            return "embeded_ad";
        }
        if (i10 == 2) {
            return "banner_ad";
        }
        if (i10 == 3) {
            return "interaction";
        }
        if (i10 == 4) {
            return "open_ad";
        }
        if (i10 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i10 != 7) {
            return null;
        }
        return "rewarded_video";
    }

    public static String rjo(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static int syt(Context context) {
        return rjo(com.bytedance.sdk.component.utils.ibd.kq(context, 0L));
    }

    public static boolean syt(int i10) {
        if (i10 <= 0) {
            return false;
        }
        return i10 >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i10;
    }

    public static int oq(com.bytedance.sdk.openadsdk.core.model.uml umlVar) {
        if (umlVar == null) {
            return -1;
        }
        int iAin = umlVar.ain();
        int i10 = 1;
        if (iAin == 1) {
            return 2;
        }
        if (iAin == 3) {
            return 4;
        }
        if (iAin != 5) {
            i10 = 7;
            if (iAin != 7) {
                return iAin != 8 ? -1 : 5;
            }
        }
        return i10;
    }

    public static String oq() {
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.multipro.bob.kq(com.bytedance.sdk.openadsdk.core.sns.kq());
        try {
            String strOq = com.bytedance.sdk.openadsdk.multipro.oq.bob() ? com.bytedance.sdk.openadsdk.multipro.fou.kq.oq("sp_multi_ua_data", "android_system_ua", "unKnow") : com.bytedance.sdk.openadsdk.core.bob.kq().oq("android_system_ua", "unKnow");
            if (strOq != null && !"unKnow".equals(strOq)) {
                return strOq;
            }
            FutureTask futureTask = new FutureTask(new kq(2));
            oq.execute(futureTask);
            str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        com.bytedance.sdk.component.utils.fax.bob("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static long rjo(Context context) {
        int i10;
        try {
            i10 = context.getApplicationInfo().minSdkVersion;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("TTAD.ToolUtils", th.getMessage());
            i10 = -1;
        }
        return i10;
    }

    public static String kq(com.bytedance.sdk.openadsdk.core.model.uml umlVar) {
        if (umlVar == null) {
            return null;
        }
        try {
            return bob(umlVar.ain());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String fou(String str) {
        return kq(str, false, false);
    }

    public static boolean fou(com.bytedance.sdk.openadsdk.core.model.uml umlVar) {
        return umlVar != null && umlVar.wqw() == 3 && umlVar.ayo() && (umlVar.xgx() == 4 || umlVar.xgx() == 5);
    }

    public static int kq(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        str.getClass();
        switch (str) {
            case "banner_ad":
                return 2;
            case "rewarded_video":
                return 7;
            case "open_ad":
            case "cache_splash_ad":
                return 4;
            case "fullscreen_interstitial_ad":
                return 5;
            case "interaction":
                return 3;
            default:
                return 1;
        }
    }

    public static String kq(Context context) {
        String strOq = com.bytedance.sdk.openadsdk.core.bob.kq().oq("total_memory", (String) null);
        if (strOq != null && oq(strOq) > 0) {
            return strOq;
        }
        String strBob = bob("MemTotal");
        if (oq(strBob) <= 0) {
            strBob = dgq();
        }
        com.bytedance.sdk.openadsdk.core.bob.kq().kq("total_memory", strBob);
        return strBob;
    }

    public static String bob(@NonNull Context context) {
        try {
            return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.fax.bob("TTAD.ToolUtils", e10.toString());
            return "";
        }
    }

    public static long oq(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static long oq(Context context) {
        return com.bytedance.sdk.openadsdk.core.bob.kq().oq("total_internal_storage", 0L).longValue();
    }

    public static String kq(@NonNull String str, boolean z9, boolean z10) {
        String strWcx;
        if (str != null && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (z10) {
            strWcx = fax();
        } else {
            strWcx = wcx();
        }
        if (TextUtils.isEmpty(strWcx)) {
            strWcx = "api16-access-ttp.tiktokpangle.us";
        }
        String strKq = "https://" + strWcx + str;
        if (xn.kq() && !z9) {
            strKq = xn.kq(strKq);
        }
        return z9 ? vvw(strKq) : strKq;
    }

    public static boolean bob(com.bytedance.sdk.openadsdk.core.model.uml umlVar) {
        if (umlVar == null) {
            return true;
        }
        int iOq = com.bytedance.sdk.openadsdk.core.sns.fou().oq(umlVar.tt());
        int iBob = com.bytedance.sdk.component.utils.wcx.bob(com.bytedance.sdk.openadsdk.core.sns.kq());
        if (iOq == 1) {
            return fou(iBob);
        }
        if (iOq == 2) {
            return csi(iBob) || fou(iBob) || rhi(iBob);
        }
        if (iOq != 3) {
            return iOq != 5 || fou(iBob) || rhi(iBob);
        }
        return false;
    }

    public static JSONObject kq(com.bytedance.sdk.openadsdk.core.model.uml umlVar, long j10, b bVar) {
        if (umlVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("creative_id", umlVar.dra());
            jSONObject.put("buffers_time", j10);
            c cVarJob = umlVar.job();
            if (cVarJob != null) {
                jSONObject.put("video_size", cVarJob.d());
                jSONObject.put("video_resolution", cVarJob.g());
            }
            kq(jSONObject, bVar);
            return jSONObject;
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.fax.kq("TTAD.ToolUtils", "getVideoAction json error", e10);
            return jSONObject;
        }
    }

    private static void kq(JSONObject jSONObject, b bVar) {
        if (jSONObject.has("video_resolution") || bVar == null) {
            return;
        }
        try {
            jSONObject.put("video_resolution", String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(bVar.fou()), Integer.valueOf(bVar.csi())));
        } catch (Throwable unused) {
        }
    }

    public static void kq(com.bytedance.sdk.openadsdk.core.model.uml umlVar, String str) {
        if (umlVar != null) {
            try {
                String strZe = umlVar.ze();
                if (TextUtils.isEmpty(strZe) && umlVar.ne() != null && umlVar.ne().bob() == 1 && !TextUtils.isEmpty(umlVar.ne().oq())) {
                    strZe = umlVar.ne().oq();
                }
                String str2 = strZe;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.nz.kq(com.bytedance.sdk.openadsdk.core.sns.kq(), str2, umlVar, kq(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static void kq(String str, String str2, Context context) {
        int i10;
        if (TextUtils.isEmpty(str2) || !csi(context)) {
            return;
        }
        int length = str2.length();
        int i11 = 1;
        if (length % 3572 == 0) {
            i10 = length / 3572;
        } else {
            i10 = (length / 3572) + 1;
        }
        int i12 = 3572;
        int i13 = 0;
        while (i11 <= i10) {
            if (i12 < length) {
                Log.d(str, i10 + "-" + i11 + ":" + str2.substring(i13, i12));
                i11++;
                i13 = i12;
                i12 += 3572;
            } else {
                Log.d(str, i10 + "-" + i11 + ":" + str2.substring(i13));
                return;
            }
        }
    }

    public static void kq(StringBuilder sb, String str, String str2) {
        int iIndexOf;
        if (sb == null || TextUtils.isEmpty(str) || (iIndexOf = sb.indexOf(str)) <= 0) {
            return;
        }
        sb.replace(iIndexOf, str.length() + iIndexOf, str2);
    }

    public static com.bytedance.sdk.openadsdk.common.csi kq(com.bytedance.sdk.openadsdk.core.model.uml umlVar, com.bytedance.sdk.component.dgq.rhi rhiVar, Context context, String str) {
        int iXgx = umlVar.xgx();
        if (!umlVar.ayo()) {
            return null;
        }
        if (iXgx != 1 && iXgx != 3) {
            return null;
        }
        rhiVar.kq(true, (View) new com.bytedance.sdk.openadsdk.common.fou(context));
        return new com.bytedance.sdk.openadsdk.common.csi(umlVar, rhiVar, str, false);
    }

    public static void kq(JSONObject jSONObject) {
        int iIntValue;
        try {
            Pair<String, Long> pairFou = com.bytedance.sdk.openadsdk.core.dgq.fou("oem_store");
            int i10 = -1;
            if (pairFou != null && ((iIntValue = Integer.valueOf((String) pairFou.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) pairFou.second).longValue() < com.bytedance.sdk.openadsdk.jhe.kq.kq("oem_store_state_time", 259200000))) {
                i10 = iIntValue;
            }
            jSONObject.put("oem_store", i10);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("TTAD.ToolUtils", th.getMessage());
        }
    }

    public static void kq(com.bytedance.sdk.openadsdk.core.model.uml umlVar, com.bytedance.sdk.component.dgq.rhi rhiVar) {
        kq(umlVar, rhiVar, false);
    }

    public static void kq(com.bytedance.sdk.openadsdk.core.model.uml umlVar, com.bytedance.sdk.component.dgq.rhi rhiVar, boolean z9) {
        com.bytedance.sdk.component.dgq.rhi rhiVar2;
        com.bytedance.sdk.openadsdk.core.model.syt sytVarOu;
        List<Integer> list;
        if (umlVar == null || rhiVar == null) {
            return;
        }
        int iXgx = umlVar.xgx();
        if (!umlVar.ayo() || (!(iXgx == 2 || iXgx == 3 || iXgx == 5) || (sytVarOu = umlVar.ou()) == null)) {
            rhiVar2 = rhiVar;
        } else {
            List<Integer> listRhi = sytVarOu.rhi();
            ArrayList arrayList = new ArrayList();
            if (z9) {
                for (int i10 = 0; i10 < listRhi.size(); i10++) {
                    arrayList.add(Integer.valueOf(listRhi.get(i10).intValue() - 1));
                }
                list = arrayList;
            } else {
                list = listRhi;
            }
            rhiVar2 = rhiVar;
            rhiVar2.kq(true, sytVarOu.fou(), sytVarOu.csi(), list, sytVarOu.rjo(), sytVarOu.bob());
        }
        int iQmk = umlVar.qmk();
        long jCh = umlVar.ch();
        if ((iQmk == 1 || iQmk == 2) && jCh > 0) {
            rhiVar2.kq(iQmk, jCh);
        }
    }

    public static int kq(WebView webView) {
        if (webView == null) {
            return -1;
        }
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int size = webBackForwardListCopyBackForwardList.getSize();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i10);
                if (itemAtIndex != null) {
                    String url = itemAtIndex.getUrl();
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
            }
            return arrayList.indexOf(webView.getUrl()) + 1;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("TTAD.ToolUtils", th.toString());
            return -1;
        }
    }

    public static JSONObject kq(AdSlot adSlot) {
        JSONObject jSONObject = new JSONObject();
        if (adSlot != null) {
            try {
                jSONObject.put("is_sb", !TextUtils.isEmpty(adSlot.getBidAdm()));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
