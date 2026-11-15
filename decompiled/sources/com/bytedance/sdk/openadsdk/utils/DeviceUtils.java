package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DeviceUtils {
    private static int dgq = 0;
    public static String kq = "";
    private static int mxq;
    private static int nze;
    private static int suf;
    private static int syt;
    private static int wki;
    private static volatile long oq = System.currentTimeMillis();
    private static volatile boolean bob = false;
    private static volatile boolean fou = false;
    private static volatile boolean csi = false;
    private static volatile boolean rhi = true;
    private static long rjo = 0;
    private static String nn = "";
    private static int ubx = 0;
    private static final AtomicBoolean vvw = new AtomicBoolean(false);
    private static AtomicBoolean sns = new AtomicBoolean(false);

    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.wki.syt> kq = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static void oq(Context context) {
            if (DeviceUtils.fou || context == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new AudioInfoReceiver(), intentFilter, null, com.bytedance.sdk.component.utils.dgq.kq());
                boolean unused = DeviceUtils.fou = true;
            } catch (Throwable unused2) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                        int unused = DeviceUtils.nze = intent.getIntExtra("state", 0);
                    }
                } else if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    int unused2 = DeviceUtils.wki = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                    if (!kq.isEmpty()) {
                        nz.kq(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Iterator<com.bytedance.sdk.openadsdk.wki.syt> it = AudioInfoReceiver.kq.iterator();
                                while (it.hasNext()) {
                                    it.next().oq(DeviceUtils.wki);
                                }
                            }
                        });
                    }
                    if (DeviceUtils.dgq != 0) {
                        int unused3 = DeviceUtils.suf = (int) ((((double) DeviceUtils.wki) / ((double) DeviceUtils.dgq)) * 100.0d);
                    }
                }
            } catch (Exception unused4) {
            }
        }

        public static void kq(com.bytedance.sdk.openadsdk.wki.syt sytVar) {
            if (sytVar != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.wki.syt> copyOnWriteArrayList = kq;
                if (copyOnWriteArrayList.contains(sytVar)) {
                    return;
                }
                copyOnWriteArrayList.add(sytVar);
            }
        }

        public static void oq(com.bytedance.sdk.openadsdk.wki.syt sytVar) {
            if (sytVar == null) {
                return;
            }
            kq.remove(sytVar);
        }
    }

    private static class kq extends BroadcastReceiver {
        private kq() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void oq(Context context) {
            int i10 = Build.VERSION.SDK_INT;
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (i10 >= 33) {
                    context.registerReceiver(new kq(), intentFilter, 2);
                } else {
                    context.registerReceiver(new kq(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.mq(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.mxq = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }
    }

    static class oq extends BroadcastReceiver {
        oq() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.rhi = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.rhi = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.oq = System.currentTimeMillis();
            }
        }
    }

    public static String csi(Context context) {
        if (!vvw.get()) {
            nze(context);
        }
        return nn;
    }

    public static int dgq(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static void fax(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            dgq = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            wki = streamVolume;
            suf = (int) ((((double) streamVolume) / ((double) dgq)) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    private static int gm(Context context) {
        return mxq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int jhe(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            String str = Build.MANUFACTURER;
            if (!str.equalsIgnoreCase("XIAOMI") && !str.equalsIgnoreCase("HUAWEI")) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return uml(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mq(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        nz.oq(new com.bytedance.sdk.component.syt.syt("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.mxq = DeviceUtils.jhe(applicationContext);
            }
        });
    }

    private static int mxq(Context context) {
        try {
            int i10 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            if (i10 == 32) {
                return 1;
            }
            return i10 == 16 ? 0 : -1;
        } catch (Throwable unused) {
        }
    }

    private static void nb(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z9) {
                super.onChange(z9);
                DeviceUtils.mq(applicationContext);
            }
        });
    }

    public static int nn(Context context) {
        return syt;
    }

    public static int rhi(Context context) {
        if (!vvw.get()) {
            nze(context);
        }
        return ubx;
    }

    public static JSONObject rjo(Context context) {
        return kq(context, false);
    }

    private static int sns(Context context) {
        return nze;
    }

    public static int syt(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("TTAD.DeviceUtils", th.getMessage());
            return -1;
        }
    }

    public static void ubx() {
        com.bytedance.sdk.openadsdk.core.settings.ubx.kq(new com.bytedance.sdk.openadsdk.core.settings.nn.kq() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.nn.kq
            public void kq() {
                com.bytedance.sdk.openadsdk.fax.kq.oq.kq.kq().kq(true);
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.nn.kq
            public void oq() {
                com.bytedance.sdk.openadsdk.fax.kq.oq.kq.kq().kq(true);
            }
        });
        Context contextKq = com.bytedance.sdk.openadsdk.core.sns.kq();
        if (contextKq != null) {
            com.bytedance.sdk.openadsdk.core.bob.kq().kq("cpu_count", nn.kq());
            com.bytedance.sdk.openadsdk.core.bob.kq().kq("cpu_max_frequency", nn.kq(nn.kq()));
            com.bytedance.sdk.openadsdk.core.bob.kq().kq("cpu_min_frequency", nn.oq(nn.kq()));
            String strUbx = wol.ubx();
            if (strUbx != null) {
                com.bytedance.sdk.openadsdk.core.bob.kq().kq("total_memory", strUbx);
            }
            com.bytedance.sdk.openadsdk.core.bob.kq().kq("total_internal_storage", wol.vvw());
            com.bytedance.sdk.openadsdk.core.bob.kq().kq("free_internal_storage", com.bytedance.sdk.component.utils.sns.kq());
            com.bytedance.sdk.openadsdk.core.bob.kq().kq("total_sdcard_storage", wol.nze());
            com.bytedance.sdk.openadsdk.core.bob.kq().kq("is_root", wol.sns() ? 1 : 0);
            if (TextUtils.isEmpty(nn())) {
                try {
                    Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                    kq = "unity";
                } catch (ClassNotFoundException unused) {
                    kq = "native";
                }
                com.bytedance.sdk.openadsdk.core.bob.kq().kq("framework_name", kq);
            }
            vvw();
            fax(contextKq);
            mxq = jhe(contextKq);
            syt.kq(contextKq);
        }
    }

    private static int uml(Context context) {
        try {
            String str = Build.MANUFACTURER;
            if (str.equalsIgnoreCase("XIAOMI")) {
                return Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1 ? 1 : 0;
            }
            return (str.equalsIgnoreCase("HUAWEI") && Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void vvw() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.sns.kq().getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getRingerMode();
            if (ringerMode == 2) {
                syt = 1;
            } else if (ringerMode == 1) {
                syt = 2;
            } else {
                syt = 0;
            }
        } catch (Throwable unused) {
        }
    }

    private static float wcx(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static boolean bob(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
        }
    }

    public static int dgq() {
        return dgq;
    }

    public static int fou(Context context) {
        if (bob(context)) {
            return 3;
        }
        return oq(context) ? 2 : 1;
    }

    public static String nn() {
        if (TextUtils.isEmpty(kq)) {
            kq = com.bytedance.sdk.openadsdk.core.bob.kq().oq("framework_name", "");
        }
        return kq;
    }

    private static void nze(Context context) {
        if (context == null || !vvw.compareAndSet(false, true)) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.jhe.kq.kq("gp_v_enable", 0) == 1) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
                nn = packageInfo.versionName;
                ubx = packageInfo.versionCode;
            }
        } catch (Throwable unused) {
        }
    }

    public static int rjo() {
        return wki;
    }

    public static int bob() {
        return com.bytedance.sdk.openadsdk.core.bob.kq().oq("limit_ad_track", -1);
    }

    public static boolean oq() {
        if (SystemClock.elapsedRealtime() - rjo >= 20000) {
            rjo = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.sns.kq().getSystemService("power");
                if (powerManager != null) {
                    rhi = powerManager.isInteractive();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.fax.bob("TTAD.DeviceUtils", th.getMessage());
            }
        }
        return rhi;
    }

    public static int syt() {
        return suf;
    }

    public static float csi() {
        int i10 = -1;
        try {
            Context contextKq = com.bytedance.sdk.openadsdk.core.sns.kq();
            if (contextKq != null) {
                i10 = Settings.System.getInt(contextKq.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("TTAD.DeviceUtils", th.getMessage());
        }
        if (i10 < 0) {
            return -1.0f;
        }
        return Math.round((i10 / 255.0f) * 10.0f) / 10.0f;
    }

    public static String fou() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static void kq(Context context) {
        if (bob) {
            return;
        }
        try {
            oq oqVar = new oq();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(oqVar, intentFilter);
            bob = true;
        } catch (Throwable unused) {
        }
    }

    public static int rhi() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.sns.kq().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    public static void vvw(Context context) {
        Context applicationContext;
        if (csi || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                kq.oq(applicationContext);
            } else {
                nb(applicationContext);
            }
            csi = true;
        } catch (Throwable unused) {
        }
    }

    public static boolean oq(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
        }
    }

    private static void oq(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        com.bytedance.sdk.openadsdk.fax.kq.oq.kq.kq().kq(jSONObject);
    }

    public static long kq() {
        return oq;
    }

    private static void kq(JSONObject jSONObject) throws JSONException {
        oq(jSONObject);
    }

    public static JSONObject kq(Context context, boolean z9) {
        String strNn;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", syt(context));
            kq(jSONObject);
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, fou(context));
            jSONObject.put("os", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", wol.syt(context));
            jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.fou.bob());
            jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.fou.oq());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.fou.fou());
            jSONObject.put("screen_scale", bss.rhi(context));
            jSONObject.put("density", bss.syt(context));
            jSONObject.put("screen_width", bss.bob(context));
            jSONObject.put("screen_height", bss.csi(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.nn.bob.rhi());
            com.bytedance.sdk.openadsdk.core.settings.ubx ubxVarFou = com.bytedance.sdk.openadsdk.core.sns.fou();
            if (ubxVarFou.ibd("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.vvw.bob(context));
            jSONObject.put("rom_version", ibd.kq());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.vvw.oq(context));
            jSONObject.put("timezone", wol.ebt());
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.vvw.oq());
            jSONObject.put("carrier_name", ha.kq());
            if (z9) {
                strNn = wol.kq(context);
            } else {
                strNn = wol.nn();
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(strNn) * 1024));
            jSONObject.put("locale_language", fou());
            jSONObject.put("screen_bright", Math.ceil(csi() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", 1 ^ (oq() ? 1 : 0));
            jSONObject.put("cpu_num", nn.oq());
            jSONObject.put("cpu_max_freq", nn.bob());
            jSONObject.put("cpu_min_freq", nn.fou());
            rjo.kq kqVarKq = rjo.kq();
            jSONObject.put("battery_remaining_pct", (int) kqVarKq.oq);
            jSONObject.put("is_charging", kqVarKq.kq);
            jSONObject.put("total_space", String.valueOf(wol.oq(context)));
            jSONObject.put("free_space_in", String.valueOf(wol.wki()));
            jSONObject.put("sdcard_size", String.valueOf(wol.suf()));
            jSONObject.put("rooted", wol.mxq());
            jSONObject.put("enable_assisted_clicking", rhi());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.uml.kq(context, "tt_choose_language"));
            jSONObject.put("airplane", dgq(context));
            jSONObject.put("darkmode", mxq(context));
            jSONObject.put("headset", sns(context));
            jSONObject.put("ringmute", nn(context));
            jSONObject.put("screenscale", wcx(context));
            jSONObject.put("volume", syt());
            jSONObject.put("low_power_mode", gm(context));
            jSONObject.put("enable_draw_feed", wol.fgm());
            if (z9) {
                syt.kq(jSONObject, context);
                jSONObject.put("gp_v_name", csi(context));
                jSONObject.put("gp_v_code", rhi(context));
            }
            if (ubxVarFou.ibd("mnc")) {
                jSONObject.put("mnc", ha.bob());
            }
            if (ubxVarFou.ibd("mcc")) {
                jSONObject.put("mcc", ha.oq());
            }
            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.kq.kq.oq(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.kq.kq.kq());
            String strBob = com.bytedance.sdk.openadsdk.core.nn.bob.bob();
            com.bytedance.sdk.openadsdk.core.nn.bob.fou();
            if (!TextUtils.isEmpty(strBob)) {
                jSONObject.put("sof_chara", strBob);
            }
            String strOq = com.bytedance.sdk.openadsdk.multipro.fou.fou.oq("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!strOq.isEmpty()) {
                jSONObject.put("ipv6", strOq);
            }
            jSONObject.put("is_multi", com.bytedance.sdk.openadsdk.multipro.oq.bob());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static void ubx(Context context) {
        AudioInfoReceiver.oq(context);
    }
}
