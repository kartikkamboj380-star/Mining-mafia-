package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.gms.internal.measurement.J0;
import com.google.android.gms.tasks.Task;
import com.tenjin.android.config.TenjinConsts;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p136n5.E;
import p176r5.AbstractC7096m;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile FirebaseAnalytics f39964c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B1 f39965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f39966b;

    public enum a {
        GRANTED,
        DENIED
    }

    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public FirebaseAnalytics(B1 b10) {
        Preconditions.checkNotNull(b10);
        this.f39965a = b10;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f39964c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f39964c == null) {
                        f39964c = new FirebaseAnalytics(B1.s(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f39964c;
    }

    @Keep
    public static E getScionFrontendApiImplementation(Context context, Bundle bundle) {
        B1 b1S = B1.s(context, bundle);
        if (b1S == null) {
            return null;
        }
        return new d(b1S);
    }

    private final ExecutorService l() throws Throwable {
        FirebaseAnalytics firebaseAnalytics;
        synchronized (FirebaseAnalytics.class) {
            try {
                try {
                    if (this.f39966b == null) {
                        firebaseAnalytics = this;
                        firebaseAnalytics.f39966b = new com.google.firebase.analytics.a(firebaseAnalytics, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                    } else {
                        firebaseAnalytics = this;
                    }
                    return firebaseAnalytics.f39966b;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public Task a() {
        try {
            return AbstractC7096m.d(l(), new com.google.firebase.analytics.b(this));
        } catch (RuntimeException e10) {
            this.f39965a.d(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return AbstractC7096m.e(e10);
        }
    }

    public Task b() {
        try {
            return AbstractC7096m.d(l(), new c(this));
        } catch (RuntimeException e10) {
            this.f39965a.d(5, "Failed to schedule task for getSessionId", null, null, null);
            return AbstractC7096m.e(e10);
        }
    }

    public void c(String str, Bundle bundle) {
        this.f39965a.w(str, bundle);
    }

    public void d() {
        this.f39965a.G();
    }

    public void e(boolean z9) {
        this.f39965a.E(Boolean.valueOf(z9));
    }

    public void f(Map map) {
        Bundle bundle = new Bundle();
        a aVar = (a) map.get(b.AD_STORAGE);
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = (a) map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = (a) map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int iOrdinal3 = aVar3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString(TenjinConsts.TENJIN_GOOGLE_AD_USER_DATA, "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString(TenjinConsts.TENJIN_GOOGLE_AD_USER_DATA, "denied");
            }
        }
        a aVar4 = (a) map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int iOrdinal4 = aVar4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString(TenjinConsts.TENJIN_GOOGLE_AD_PERSONALIZATION, "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString(TenjinConsts.TENJIN_GOOGLE_AD_PERSONALIZATION, "denied");
            }
        }
        this.f39965a.F(bundle);
    }

    public void g(Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.f39965a.i(bundle);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) AbstractC7096m.b(com.google.firebase.installations.c.p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public void h(long j10) {
        this.f39965a.H(j10);
    }

    public void i(String str) {
        this.f39965a.C(str);
    }

    public void j(String str, String str2) {
        this.f39965a.y(null, str, str2, false);
    }

    final /* synthetic */ B1 k() {
        return this.f39965a;
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, String str, String str2) {
        this.f39965a.D(J0.a(activity), str, str2);
    }
}
