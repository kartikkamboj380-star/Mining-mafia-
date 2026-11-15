package p117l6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.tasks.Task;
import p007a6.f;
import p087i6.g;
import p127m6.b;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes3.dex */
public class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f46090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f46091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f46092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    C7094k f46093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f46094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f46095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f46096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C7094k f46097h;

    public F(f fVar) {
        Object obj = new Object();
        this.f46092c = obj;
        this.f46093d = new C7094k();
        this.f46094e = false;
        this.f46095f = false;
        this.f46097h = new C7094k();
        Context contextM = fVar.m();
        this.f46091b = fVar;
        this.f46090a = AbstractC7048i.q(contextM);
        Boolean boolB = b();
        this.f46096g = boolB == null ? a(contextM) : boolB;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f46093d.e(null);
                    this.f46094e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean boolG = g(context);
        if (boolG == null) {
            this.f46095f = false;
            return null;
        }
        this.f46095f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolG));
    }

    private Boolean b() {
        if (!this.f46090a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f46095f = false;
        return Boolean.valueOf(this.f46090a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private boolean e() {
        try {
            return this.f46091b.x();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z9) {
        String str;
        String str2 = z9 ? "ENABLED" : "DISABLED";
        if (this.f46096g == null) {
            str = "global Firebase setting";
        } else {
            str = this.f46095f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        g.f().b(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e10) {
            g.f().e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    private static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("firebase_crashlytics_collection_enabled");
        }
        editorEdit.apply();
    }

    public void c(boolean z9) {
        if (!z9) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f46097h.e(null);
    }

    public synchronized boolean d() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f46096g;
            zBooleanValue = bool != null ? bool.booleanValue() : e();
            f(zBooleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    public synchronized void h(Boolean bool) {
        if (bool != null) {
            try {
                this.f46095f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f46096g = bool != null ? bool : a(this.f46091b.m());
        i(this.f46090a, bool);
        synchronized (this.f46092c) {
            try {
                if (d()) {
                    if (!this.f46094e) {
                        this.f46093d.e(null);
                        this.f46094e = true;
                    }
                } else if (this.f46094e) {
                    this.f46093d = new C7094k();
                    this.f46094e = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Task j() {
        Task taskA;
        synchronized (this.f46092c) {
            taskA = this.f46093d.a();
        }
        return taskA;
    }

    public Task k() {
        return b.b(this.f46097h.a(), j());
    }
}
