package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6320s4 implements Y3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f36883f = new p190t.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f36884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f36885b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Map f36887d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f36886c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f36888e = new ArrayList();

    private C6320s4(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f36884a = sharedPreferences;
    }

    static C6320s4 b(Context context, String str, Runnable runnable) {
        final C6320s4 c6320s4;
        SharedPreferences sharedPreferencesA;
        if (Q3.a() && !str.startsWith("direct_boot:") && !Q3.c(context)) {
            return null;
        }
        synchronized (C6320s4.class) {
            Map map = f36883f;
            c6320s4 = (C6320s4) map.get(str);
            if (c6320s4 == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (Q3.a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferencesA = AbstractC6236j0.a(context, str.substring(12), 0, AbstractC6200f0.f36677a);
                    } else {
                        sharedPreferencesA = AbstractC6236j0.a(context, str, 0, AbstractC6200f0.f36677a);
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    c6320s4 = new C6320s4(sharedPreferencesA, runnable);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.r4
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            this.f36875a.d(sharedPreferences, str2);
                        }
                    };
                    c6320s4.f36885b = onSharedPreferenceChangeListener;
                    c6320s4.f36884a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, c6320s4);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th;
                }
            }
        }
        return c6320s4;
    }

    static synchronized void c() {
        try {
            Map map = f36883f;
            for (C6320s4 c6320s4 : map.values()) {
                c6320s4.f36884a.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) X5.j.h(c6320s4.f36885b));
            }
            map.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ void d(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f36886c) {
            this.f36887d = null;
            AbstractC6303q4.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f36888e.iterator();
                if (it.hasNext()) {
                    p070h.w.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    public final Object k(String str) {
        Map<String, ?> map = this.f36887d;
        if (map == null) {
            synchronized (this.f36886c) {
                try {
                    map = this.f36887d;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f36884a.getAll();
                            this.f36887d = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
