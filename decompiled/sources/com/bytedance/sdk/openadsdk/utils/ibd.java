package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ibd {
    private static String csi = null;
    public static boolean kq = false;
    public static boolean oq = false;
    private static int rhi = Integer.MAX_VALUE;
    private static final CharSequence bob = "amigo";
    private static final CharSequence fou = "funtouch";
    private static final ConcurrentHashMap<String, String> rjo = new ConcurrentHashMap<>();

    public static class kq implements Callable<String> {
        private final String kq;

        public kq(String str) {
            this.kq = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public String call() {
            String str = (String) ibd.rjo.get(this.kq);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String strBob = ibd.bob(this.kq);
            System.currentTimeMillis();
            if (strBob != null) {
                ibd.rjo.put(this.kq, strBob);
            }
            return strBob;
        }
    }

    public static String bob() {
        return fou("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static boolean csi() {
        if (!oq) {
            try {
                Class.forName("miui.os.Build");
                kq = true;
                oq = true;
                return true;
            } catch (Exception unused) {
                oq = true;
            }
        }
        return kq;
    }

    public static String dgq() {
        return Build.DISPLAY + "_" + fou("ro.gn.sv.version");
    }

    public static boolean fax() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2) || !str2.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean fou() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static String gm() {
        if (!wcx()) {
            return "";
        }
        return "coloros_" + fou(wol.rjo("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
    }

    private static String jhe() {
        if (nze()) {
            return mxq();
        }
        if (csi()) {
            return vvw();
        }
        if (oq()) {
            return sns();
        }
        if (wcx()) {
            return gm();
        }
        String strWki = wki();
        if (!TextUtils.isEmpty(strWki)) {
            return strWki;
        }
        if (rjo()) {
            return rhi();
        }
        if (syt()) {
            return dgq();
        }
        if (fou()) {
            return bob();
        }
        String strNn = nn();
        return !TextUtils.isEmpty(strNn) ? strNn : Build.DISPLAY;
    }

    public static String kq() {
        if (!TextUtils.isEmpty(csi)) {
            return csi;
        }
        String strKq = com.bytedance.sdk.openadsdk.core.dgq.kq("sdk_local_rom_info", 604800000L);
        csi = strKq;
        if (TextUtils.isEmpty(strKq)) {
            String strJhe = jhe();
            csi = strJhe;
            com.bytedance.sdk.openadsdk.core.dgq.kq("sdk_local_rom_info", strJhe);
        }
        return csi;
    }

    public static String mxq() {
        if (nze()) {
            try {
                return "smartisan_".concat(String.valueOf(fou("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static String nn() {
        if (!ubx()) {
            return "";
        }
        return "eui_" + fou("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    public static boolean nze() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static String rhi() {
        return fou("ro.vivo.os.build.display.id") + "_" + fou("ro.vivo.product.version");
    }

    public static boolean rjo() {
        String strFou = fou("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(strFou) && strFou.toLowerCase().contains(fou);
    }

    public static String sns() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    public static String suf() {
        return fou("ro.build.version.emui");
    }

    public static boolean syt() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains(bob);
    }

    public static boolean ubx() {
        return !TextUtils.isEmpty(fou("ro.letv.release.version"));
    }

    public static String vvw() {
        if (!csi()) {
            return "";
        }
        return "miui_" + fou("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    public static boolean wcx() {
        if (rhi == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String strRjo = wol.rjo("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(strRjo)) {
                rhi = 0;
            } else {
                rhi = 1;
            }
        }
        return rhi == 1;
    }

    public static String wki() {
        String strSuf = suf();
        if (strSuf == null || !strSuf.toLowerCase().contains("emotionui")) {
            return "";
        }
        return strSuf + "_" + Build.DISPLAY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String bob(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        String line = "";
        Process process = null;
        try {
            try {
                try {
                    Process processExec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()), IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
                        try {
                            line = bufferedReader.readLine();
                            processExec.exitValue();
                        } catch (IllegalThreadStateException unused) {
                            process = processExec;
                            try {
                                process.destroy();
                            } catch (Throwable unused2) {
                            }
                            if (bufferedReader != null) {
                            }
                            return line;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                com.bytedance.sdk.component.utils.fax.kq("ToolUtils", "Unable to read sysprop ".concat(String.valueOf(str)), th);
                                return line;
                            } finally {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e10) {
                                        com.bytedance.sdk.component.utils.fax.kq("ToolUtils", "Exception while closing InputStream", e10);
                                    }
                                }
                            }
                        }
                    } catch (IllegalThreadStateException unused3) {
                        bufferedReader = null;
                    }
                } catch (Throwable th3) {
                    bufferedReader = null;
                    th = th3;
                }
            } catch (IllegalThreadStateException unused4) {
                bufferedReader = null;
            }
            bufferedReader.close();
        } catch (IOException e11) {
            com.bytedance.sdk.component.utils.fax.kq("ToolUtils", "Exception while closing InputStream", e11);
        }
        return line;
    }

    public static boolean oq() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String fou(String str) {
        String str2;
        String str3 = rjo.get(str);
        if (str3 != null) {
            return str3;
        }
        try {
            if (!TextUtils.isEmpty("")) {
                str2 = "";
            } else {
                final com.bytedance.sdk.component.syt.rjo rjoVar = new com.bytedance.sdk.component.syt.rjo(new kq(str), 5, 2);
                nz.oq(new com.bytedance.sdk.component.syt.syt("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.ibd.1
                    @Override // java.lang.Runnable
                    public void run() {
                        rjoVar.run();
                    }
                });
                str2 = (String) rjoVar.get(1L, TimeUnit.SECONDS);
            }
        } catch (Throwable unused) {
        }
        return str2 == null ? "" : str2;
    }

    public static boolean kq(String str) {
        if (TextUtils.isEmpty(str)) {
            str = suf();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || fax();
    }
}
