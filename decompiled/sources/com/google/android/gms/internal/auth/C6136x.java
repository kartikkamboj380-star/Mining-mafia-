package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6136x implements InterfaceC6127u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C6136x f36163c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentObserver f36165b;

    private C6136x() {
        this.f36164a = null;
        this.f36165b = null;
    }

    static C6136x a(Context context) {
        C6136x c6136x;
        synchronized (C6136x.class) {
            try {
                if (f36163c == null) {
                    f36163c = C.f.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C6136x(context) : new C6136x();
                }
                c6136x = f36163c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6136x;
    }

    static synchronized void d() {
        Context context;
        try {
            C6136x c6136x = f36163c;
            if (c6136x != null && (context = c6136x.f36164a) != null && c6136x.f36165b != null) {
                context.getContentResolver().unregisterContentObserver(f36163c.f36165b);
            }
            f36163c = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC6127u
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String j(final String str) {
        Context context = this.f36164a;
        if (context != null && !AbstractC6104m.a(context)) {
            try {
                return (String) AbstractC6121s.a(new InterfaceC6124t() { // from class: com.google.android.gms.internal.auth.v
                    @Override // com.google.android.gms.internal.auth.InterfaceC6124t
                    public final Object zza() {
                        return this.f36158a.c(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e10);
            }
        }
        return null;
    }

    final /* synthetic */ String c(String str) {
        return AbstractC6101l.a(this.f36164a.getContentResolver(), str, null);
    }

    private C6136x(Context context) {
        this.f36164a = context;
        C6133w c6133w = new C6133w(this, null);
        this.f36165b = c6133w;
        context.getContentResolver().registerContentObserver(AbstractC6101l.f36105a, true, c6133w);
    }
}
