package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6168b4 implements Y3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static C6168b4 f36632d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentObserver f36634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36635c;

    private C6168b4() {
        this.f36635c = false;
        this.f36633a = null;
        this.f36634b = null;
    }

    static C6168b4 b(Context context) {
        C6168b4 c6168b4;
        synchronized (C6168b4.class) {
            try {
                if (f36632d == null) {
                    f36632d = C.f.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C6168b4(context) : new C6168b4();
                }
                C6168b4 c6168b5 = f36632d;
                if (c6168b5 != null && c6168b5.f36634b != null && !c6168b5.f36635c) {
                    try {
                        context.getContentResolver().registerContentObserver(K3.f36319a, true, f36632d.f36634b);
                        ((C6168b4) X5.j.h(f36632d)).f36635c = true;
                    } catch (SecurityException e10) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e10);
                    }
                }
                c6168b4 = (C6168b4) X5.j.h(f36632d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6168b4;
    }

    static synchronized void d() {
        Context context;
        try {
            C6168b4 c6168b4 = f36632d;
            if (c6168b4 != null && (context = c6168b4.f36633a) != null && c6168b4.f36634b != null && c6168b4.f36635c) {
                context.getContentResolver().unregisterContentObserver(f36632d.f36634b);
            }
            f36632d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y3
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String k(final String str) {
        Context context = this.f36633a;
        if (context != null && !Q3.b(context)) {
            try {
                return (String) Y3.a(new X3() { // from class: com.google.android.gms.internal.measurement.a4
                    @Override // com.google.android.gms.internal.measurement.X3
                    public final /* synthetic */ Object zza() {
                        return this.f36623a.e(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e10);
            }
        }
        return null;
    }

    final /* synthetic */ String e(String str) {
        return J3.a(((Context) X5.j.h(this.f36633a)).getContentResolver(), str, null);
    }

    private C6168b4(Context context) {
        this.f36635c = false;
        this.f36633a = context;
        this.f36634b = new Z3(this, null);
    }
}
