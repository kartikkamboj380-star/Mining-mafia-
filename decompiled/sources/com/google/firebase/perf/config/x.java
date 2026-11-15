package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final R6.a f40401c = R6.a.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static x f40402d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile SharedPreferences f40403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f40404b;

    public x(ExecutorService executorService) {
        this.f40404b = executorService;
    }

    public static /* synthetic */ void a(x xVar, Context context) {
        if (xVar.f40403a != null || context == null) {
            return;
        }
        xVar.f40403a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    private Context e() {
        try {
            p007a6.f.o();
            return p007a6.f.o().m();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized x f() {
        try {
            if (f40402d == null) {
                f40402d = new x(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40402d;
    }

    public void b(String str) {
        if (str == null) {
            f40401c.a("Key is null. Cannot clear nullable key");
        } else {
            this.f40403a.edit().remove(str).apply();
        }
    }

    public X6.g c(String str) {
        if (str == null) {
            f40401c.a("Key is null when getting boolean value on device cache.");
            return X6.g.a();
        }
        if (this.f40403a == null) {
            i(e());
            if (this.f40403a == null) {
                return X6.g.a();
            }
        }
        if (!this.f40403a.contains(str)) {
            return X6.g.a();
        }
        try {
            return X6.g.e(Boolean.valueOf(this.f40403a.getBoolean(str, false)));
        } catch (ClassCastException e10) {
            f40401c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            return X6.g.a();
        }
    }

    public X6.g d(String str) {
        if (str == null) {
            f40401c.a("Key is null when getting double value on device cache.");
            return X6.g.a();
        }
        if (this.f40403a == null) {
            i(e());
            if (this.f40403a == null) {
                return X6.g.a();
            }
        }
        if (!this.f40403a.contains(str)) {
            return X6.g.a();
        }
        try {
            try {
                return X6.g.e(Double.valueOf(Double.longBitsToDouble(this.f40403a.getLong(str, 0L))));
            } catch (ClassCastException unused) {
                return X6.g.e(Double.valueOf(Float.valueOf(this.f40403a.getFloat(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).doubleValue()));
            }
        } catch (ClassCastException e10) {
            f40401c.b("Key %s from sharedPreferences has type other than double: %s", str, e10.getMessage());
            return X6.g.a();
        }
    }

    public X6.g g(String str) {
        if (str == null) {
            f40401c.a("Key is null when getting long value on device cache.");
            return X6.g.a();
        }
        if (this.f40403a == null) {
            i(e());
            if (this.f40403a == null) {
                return X6.g.a();
            }
        }
        if (!this.f40403a.contains(str)) {
            return X6.g.a();
        }
        try {
            return X6.g.e(Long.valueOf(this.f40403a.getLong(str, 0L)));
        } catch (ClassCastException e10) {
            f40401c.b("Key %s from sharedPreferences has type other than long: %s", str, e10.getMessage());
            return X6.g.a();
        }
    }

    public X6.g h(String str) {
        if (str == null) {
            f40401c.a("Key is null when getting String value on device cache.");
            return X6.g.a();
        }
        if (this.f40403a == null) {
            i(e());
            if (this.f40403a == null) {
                return X6.g.a();
            }
        }
        if (!this.f40403a.contains(str)) {
            return X6.g.a();
        }
        try {
            return X6.g.e(this.f40403a.getString(str, ""));
        } catch (ClassCastException e10) {
            f40401c.b("Key %s from sharedPreferences has type other than String: %s", str, e10.getMessage());
            return X6.g.a();
        }
    }

    public synchronized void i(final Context context) {
        if (this.f40403a == null && context != null) {
            this.f40404b.execute(new Runnable() { // from class: com.google.firebase.perf.config.w
                @Override // java.lang.Runnable
                public final void run() {
                    x.a(this.f40399a, context);
                }
            });
        }
    }

    public boolean j(String str, double d10) {
        if (str == null) {
            f40401c.a("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f40403a == null) {
            i(e());
            if (this.f40403a == null) {
                return false;
            }
        }
        this.f40403a.edit().putLong(str, Double.doubleToRawLongBits(d10)).apply();
        return true;
    }

    public boolean k(String str, long j10) {
        if (str == null) {
            f40401c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f40403a == null) {
            i(e());
            if (this.f40403a == null) {
                return false;
            }
        }
        this.f40403a.edit().putLong(str, j10).apply();
        return true;
    }

    public boolean l(String str, String str2) {
        if (str == null) {
            f40401c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f40403a == null) {
            i(e());
            if (this.f40403a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f40403a.edit().remove(str).apply();
            return true;
        }
        this.f40403a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean m(String str, boolean z9) {
        if (str == null) {
            f40401c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f40403a == null) {
            i(e());
            if (this.f40403a == null) {
                return false;
            }
        }
        this.f40403a.edit().putBoolean(str, z9).apply();
        return true;
    }
}
