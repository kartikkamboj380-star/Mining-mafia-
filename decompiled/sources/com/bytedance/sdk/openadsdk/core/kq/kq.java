package com.bytedance.sdk.openadsdk.core.kq;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.fax;
import java.util.ArrayList;
import java.util.List;
import p180s.d;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private static String kq;
    private static Boolean oq;

    public static String kq(Context context) {
        String str = kq;
        if (str != null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                kq = null;
            } else if (TextUtils.isEmpty(str2) || kq(context, intent) || !arrayList.contains(str2)) {
                kq = (String) arrayList.get(0);
            } else {
                kq = str2;
            }
        } catch (Throwable th) {
            fax.bob("CustomTabsHelper", th.getMessage());
        }
        return kq;
    }

    public static int oq(Context context) {
        try {
            return !TextUtils.isEmpty(kq(context)) ? 1 : 0;
        } catch (Throwable unused) {
        }
    }

    private static boolean kq(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (listQueryIntentActivities.size() == 0) {
                return false;
            }
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        return false;
    }

    public static int kq() {
        Boolean bool = oq;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static void kq(Context context, String str, d dVar, Uri uri) {
        dVar.f48557a.setPackage(str);
        dVar.b(context, uri);
    }
}
