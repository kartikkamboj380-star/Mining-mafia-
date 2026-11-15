package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC1169o;
import com.facebook.react.ReactActivity;
import com.unity3d.services.core.fid.Constants;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class syt {
    private static final AtomicReference<Boolean> kq = new AtomicReference<>(null);
    private static final AtomicReference<String> oq = new AtomicReference<>(null);

    public static String bob(Context context) {
        try {
            return String.valueOf(context.getApplicationInfo().targetSdkVersion);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String csi(Context context) {
        try {
            AtomicReference<String> atomicReference = oq;
            String str = atomicReference.get();
            if (str != null) {
                return str;
            }
            PackageInfo packageInfoRhi = rhi(context);
            String str2 = packageInfoRhi != null ? packageInfoRhi.versionName : "";
            AbstractC1169o.a(atomicReference, null, str2);
            return str2;
        } catch (Throwable unused) {
            AbstractC1169o.a(oq, null, "");
            return "";
        }
    }

    private static boolean dgq(Context context) {
        try {
            Class.forName("io.flutter.embedding.android.FlutterActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libflutter.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    public static int fou(Context context) {
        try {
            Class.forName("com.google.android.play.core.splitinstall.SplitInstallManager");
            return 1;
        } catch (ClassNotFoundException unused) {
            return 0;
        }
    }

    public static void kq(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (oq()) {
                com.bytedance.sdk.openadsdk.core.bob bobVarKq = com.bytedance.sdk.openadsdk.core.bob.kq();
                bobVarKq.kq("w_ver", csi(context));
                bobVarKq.kq("bp", oq(context));
                bobVarKq.kq("is_fold", rjo(context) ? 1 : 0);
                bobVarKq.kq("abi", kq());
                bobVarKq.kq("t_ver", bob(context));
                bobVarKq.kq("aab", fou(context));
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean nn(Context context) {
        try {
            int i10 = ReactActivity.f14384j;
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libreactnativejni.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    public static int oq(Context context) {
        if (syt(context)) {
            return 1;
        }
        if (dgq(context)) {
            return 2;
        }
        return nn(context) ? 3 : 4;
    }

    public static PackageInfo rhi(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return WebView.getCurrentWebViewPackage();
            }
            PackageInfo packageInfo = (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
            return packageInfo != null ? packageInfo : ubx(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean rjo(Context context) {
        boolean zDgq;
        boolean z9;
        byte b10;
        try {
            AtomicReference<Boolean> atomicReference = kq;
            Boolean bool = atomicReference.get();
            if (bool != null) {
                return bool.booleanValue();
            }
            String lowerCase = Build.BRAND;
            if (!TextUtils.isEmpty(lowerCase)) {
                lowerCase = lowerCase.toLowerCase();
            }
            String lowerCase2 = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(lowerCase2)) {
                lowerCase2 = lowerCase2.toLowerCase();
            }
            if (TextUtils.isEmpty(lowerCase) && TextUtils.isEmpty(lowerCase2)) {
                AbstractC1169o.a(atomicReference, null, Boolean.FALSE);
                return false;
            }
            byte b11 = -1;
            if (TextUtils.isEmpty(lowerCase)) {
                zDgq = false;
                z9 = false;
            } else {
                switch (lowerCase.hashCode()) {
                    case -759499589:
                        if (!lowerCase.equals("xiaomi")) {
                            b10 = -1;
                        } else {
                            b10 = 2;
                        }
                        break;
                    case 3418016:
                        if (!lowerCase.equals("oppo")) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case 3620012:
                        if (!lowerCase.equals("vivo")) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    case 1864941562:
                        if (!lowerCase.equals("samsung")) {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                if (b10 == 0) {
                    zDgq = dgq();
                } else if (b10 == 1) {
                    zDgq = rhi();
                } else if (b10 == 2) {
                    zDgq = csi();
                } else if (b10 != 3) {
                    zDgq = false;
                    z9 = true;
                } else {
                    zDgq = fou();
                }
                z9 = false;
            }
            if (z9 && !TextUtils.isEmpty(lowerCase2)) {
                switch (lowerCase2.hashCode()) {
                    case -759499589:
                        if (lowerCase2.equals("xiaomi")) {
                            b11 = 2;
                        }
                        break;
                    case 3418016:
                        if (lowerCase2.equals("oppo")) {
                            b11 = 0;
                        }
                        break;
                    case 3620012:
                        if (lowerCase2.equals("vivo")) {
                            b11 = 1;
                        }
                        break;
                    case 1864941562:
                        if (lowerCase2.equals("samsung")) {
                            b11 = 3;
                        }
                        break;
                }
                if (b11 == 0) {
                    zDgq = dgq();
                } else if (b11 == 1) {
                    zDgq = rhi();
                } else if (b11 != 2) {
                    zDgq = b11 != 3 ? false : fou();
                } else {
                    zDgq = csi();
                }
            }
            AbstractC1169o.a(atomicReference, null, Boolean.valueOf(zDgq));
            return zDgq;
        } catch (Throwable unused) {
            AbstractC1169o.a(kq, null, Boolean.FALSE);
            return false;
        }
    }

    private static boolean syt(Context context) {
        try {
            Class.forName("com.unity3d.player.UnityPlayerActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libunity.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static PackageInfo ubx(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean fou() {
        if (ubx()) {
            return true;
        }
        String[] strArr = {"sm-f9000", "sm-f9160", "sm-f9260", "sm-f9360", "sm-f9460", "sm-f9560", "sm-f7000", "sm-f7070", "sm-f7110", "sm-f7210", "sm-f7310", "sm-f7410"};
        String[] strArr2 = {"winner", "f2q", "q2q", "q4q", "q5q", "q6q", "bloomq", "bloomxq", "b2q", "b4q", "b5q", "b6q"};
        try {
            String lowerCase = Build.DEVICE.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 12; i10++) {
                    if (lowerCase.contains(strArr2[i10])) {
                        return true;
                    }
                }
            }
            String lowerCase2 = Build.MODEL.toLowerCase();
            if (TextUtils.isEmpty(lowerCase2)) {
                return false;
            }
            for (int i11 = 0; i11 < 12; i11++) {
                if (lowerCase2.contains(strArr[i11])) {
                    return true;
                }
            }
            if (oq()) {
                String strKq = com.bytedance.sdk.openadsdk.jhe.kq.kq("fold_config", "fold_samung", "");
                if (TextUtils.isEmpty(strKq)) {
                    return false;
                }
                for (String str : strKq.split(",")) {
                    if (lowerCase2.contains(str)) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String bob() {
        return com.bytedance.sdk.openadsdk.jhe.kq.kq("fold_config", "fold_default", "");
    }

    private static boolean dgq() {
        if (nn()) {
            return true;
        }
        String[] strArr = {"CPH2439", "CPH2437", "CPH2499", "CPH2519", "PEUM00", "PGU110", "PGT110", "PHN110", "PHT110"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 9; i10++) {
                    if (lowerCase.contains(strArr[i10].toLowerCase())) {
                        return true;
                    }
                }
                if (oq()) {
                    String strBob = bob();
                    if (TextUtils.isEmpty(strBob)) {
                        return false;
                    }
                    for (String str : strBob.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean nn() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object objInvoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), "oplus.hardware.type.fold");
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            com.bytedance.sdk.component.utils.fax.bob("BED", "get oppo fold properties error, msg: " + e10.getMessage());
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean oq() {
        return com.bytedance.sdk.openadsdk.jhe.kq.kq("fold_config", "enable", 0) == 1;
    }

    private static boolean syt() {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("BED", "isXiaomiFold return false " + th.getMessage());
            return false;
        }
    }

    private static boolean csi() {
        if (syt()) {
            return true;
        }
        String[] strArr = {"M2011J18C", "22061218C", "2308CPXD0C", "24072PX77C", "2405CPX3DC", "2405CPX3DG"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 6; i10++) {
                    if (lowerCase.contains(strArr[i10])) {
                        return true;
                    }
                }
                if (oq()) {
                    String strBob = bob();
                    if (TextUtils.isEmpty(strBob)) {
                        return false;
                    }
                    for (String str : strBob.split(",")) {
                        if (lowerCase.contains(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean ubx() {
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            Object objInvoke = cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
            Method declaredMethod = cls.getDeclaredMethod("getString", String.class);
            return "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD")) || "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            com.bytedance.sdk.component.utils.fax.bob("PAG_BANNER", "get ss fold device error: " + e10.getMessage());
            return false;
        }
    }

    private static boolean rhi() {
        if (rjo()) {
            return true;
        }
        String[] strArr = {"V2330", "V2178A", "V2229A", "V2303A", "V2337A", "V2256A", "V2266A"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 7; i10++) {
                    if (lowerCase.contains(strArr[i10].toLowerCase())) {
                        return true;
                    }
                }
                if (oq()) {
                    String strBob = bob();
                    if (TextUtils.isEmpty(strBob)) {
                        return false;
                    }
                    for (String str : strBob.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String kq() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Exception unused) {
            return "";
        }
    }

    public static void kq(JSONObject jSONObject, Context context) {
        if (context == null) {
            return;
        }
        try {
            if (oq()) {
                com.bytedance.sdk.openadsdk.core.bob bobVarKq = com.bytedance.sdk.openadsdk.core.bob.kq();
                String strOq = bobVarKq.oq("md", com.bytedance.sdk.openadsdk.core.dgq.oq().rjo());
                if (!TextUtils.isEmpty(strOq)) {
                    jSONObject.put("md", strOq);
                }
                int iOq = bobVarKq.oq("bp", oq(context));
                if (iOq != 4) {
                    jSONObject.put("bp", iOq);
                }
                String strOq2 = bobVarKq.oq("t_ver", bob(context));
                if (!TextUtils.isEmpty(strOq2)) {
                    jSONObject.put("t_ver", strOq2);
                }
                jSONObject.put("is_fold", bobVarKq.oq("is_fold", rjo(context) ? 1 : 0));
                jSONObject.put("aab", bobVarKq.oq("aab", fou(context)));
                String strOq3 = bobVarKq.oq("w_ver", csi(context));
                if (!TextUtils.isEmpty(strOq3)) {
                    jSONObject.put("w_ver", strOq3);
                }
                String strOq4 = bobVarKq.oq("abi", kq());
                if (TextUtils.isEmpty(strOq4)) {
                    return;
                }
                jSONObject.put("abi", strOq4);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean rjo() {
        try {
            return "foldable".equals(Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", null).invoke(null, null));
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.bob("BED", "isVIVOFoldDevice return false " + th.getMessage());
            return false;
        }
    }
}
