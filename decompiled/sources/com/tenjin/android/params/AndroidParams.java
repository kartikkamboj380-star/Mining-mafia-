package com.tenjin.android.params;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.tenjin.android.params.base.AParamProvider;
import com.tenjin.android.utils.SourceAppStoreLoader;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidParams extends AParamProvider {
    private final Context context;

    public AndroidParams(Context context) {
        this.context = context;
    }

    private String getAppVersion() {
        try {
            return this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private String getAppVersionCode() {
        try {
            return Integer.toString(this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private String getBundleId() {
        return this.context.getPackageName();
    }

    private String getCarrierName() {
        try {
            return ((TelephonyManager) this.context.getSystemService("phone")).getSimOperatorName();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private String getConnectivity() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return "";
            }
            if (activeNetworkInfo.getType() == 1) {
                return "wifi";
            }
            return activeNetworkInfo.getType() == 0 ? "mobile" : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getDevice() {
        return String.valueOf(Build.DEVICE);
    }

    public static String getOsVersion() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String getPlatform() {
        return "Amazon".equals(Build.MANUFACTURER) ? "amazon" : "android";
    }

    public static boolean isEmulator() {
        String str = Build.FINGERPRINT;
        if (str.startsWith("generic") || str.startsWith("unknown")) {
            return true;
        }
        String str2 = Build.MODEL;
        if (str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
            return true;
        }
        return (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }

    @Override // com.tenjin.android.params.base.ParamProvider
    public Map<String, String> apply(Map<String, String> map) {
        map.put("bundle_id", getBundleId());
        map.put("platform", getPlatform());
        map.put("app_version", getAppVersion());
        map.put("app_version_code", getAppVersionCode());
        map.put("os_version", getOsVersion());
        map.put("device", getDevice());
        map.put("device_manufacturer", String.valueOf(Build.MANUFACTURER));
        map.put("device_model", String.valueOf(Build.MODEL));
        map.put("device_brand", String.valueOf(Build.BRAND));
        map.put("device_product", String.valueOf(Build.PRODUCT));
        map.put("source_app_store", getSourceAppStore());
        map.put("screen_width", String.valueOf(this.context.getResources().getDisplayMetrics().widthPixels));
        map.put("screen_height", String.valueOf(this.context.getResources().getDisplayMetrics().heightPixels));
        map.put("language", this.context.getResources().getConfiguration().locale.getLanguage().toString());
        map.put("country", this.context.getResources().getConfiguration().locale.getCountry().toString());
        map.put("os_version_release", String.valueOf(Build.VERSION.RELEASE));
        map.put("build_id", String.valueOf(Build.ID));
        map.put("carrier", getCarrierName());
        map.put("connection_type", getConnectivity());
        map.put("timezone", TimeZone.getDefault().getID());
        map.put("locale", Locale.getDefault().toString());
        if (isEmulator()) {
            map.put("device_info", String.valueOf(isEmulator()));
        }
        return map;
    }

    public String getSourceAppStore() {
        return new SourceAppStoreLoader(this.context).getSourceAppStore();
    }
}
