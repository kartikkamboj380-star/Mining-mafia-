package L6;

import C.b;
import D6.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f3155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f3156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3157d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f3154a = contextA;
        this.f3155b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f3156c = cVar;
        this.f3157d = c();
    }

    private static Context a(Context context) {
        return b.b(context);
    }

    private boolean c() {
        return this.f3155b.contains("firebase_data_collection_default_enabled") ? this.f3155b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f3154a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f3154a.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z9) {
        if (this.f3157d != z9) {
            this.f3157d = z9;
            this.f3156c.b(new D6.a(p007a6.b.class, new p007a6.b(z9)));
        }
    }

    public synchronized boolean b() {
        return this.f3157d;
    }

    public synchronized void e(Boolean bool) {
        try {
            if (bool == null) {
                this.f3155b.edit().remove("firebase_data_collection_default_enabled").apply();
                f(d());
            } else {
                boolean zEquals = Boolean.TRUE.equals(bool);
                this.f3155b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
                f(zEquals);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
