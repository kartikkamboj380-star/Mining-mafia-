package b9;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import app.notifee.core.Logger;
import com.unity3d.ads.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    public static Class a(String str) {
        String className;
        Class<?> cls;
        if (str == null || str.equals(BuildConfig.FLAVOR)) {
            Intent launchIntentForPackage = f.f11648a.getPackageManager().getLaunchIntentForPackage(f.f11648a.getPackageName());
            className = (launchIntentForPackage == null || launchIntentForPackage.getComponent() == null) ? null : launchIntentForPackage.getComponent().getClassName();
        } else {
            className = str;
        }
        if (className == null) {
            Logger.e("ReceiverService", "Launch Activity for notification could not be found.");
            return null;
        }
        try {
            cls = Class.forName(className);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            return cls;
        }
        Logger.e("ReceiverService", String.format("Launch Activity for notification does not exist ('%s').", str));
        return null;
    }

    public static String b(Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            String className = intent.getComponent().getClassName();
            int iLastIndexOf = className.lastIndexOf(".");
            if (iLastIndexOf != -1) {
                return className.substring(iLastIndexOf + 1);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static void c(Activity activity, final Intent intent) {
        if (activity == null) {
            Logger.w("IntentUtils", "Activity or intent is null when calling startActivityOnUiThread()");
            return;
        }
        final Context context = f.f11648a;
        if (context == null) {
            Logger.w("IntentUtils", "Unable to get application context when calling startActivityOnUiThread()");
        }
        activity.runOnUiThread(new Runnable() { // from class: b9.j
            @Override // java.lang.Runnable
            public final void run() {
                k.e(context, intent);
            }
        });
    }

    public static boolean d(Context context, Intent intent) {
        if (context != null && intent != null) {
            try {
                return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
            } catch (Exception e10) {
                Logger.e("IntentUtils", "An error occurred whilst trying to check if intent is available on device", e10);
            }
        }
        return false;
    }

    public static /* synthetic */ void e(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Exception e10) {
            Logger.e("IntentUtils", "An error occurred whilst trying to start activity on Ui Thread", e10);
        }
    }
}
