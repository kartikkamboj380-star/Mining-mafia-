package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ln0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2045Ln0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5043rr0 f20667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1731Fm0 f20668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20669d;

    C2045Ln0(Context context, C5043rr0 c5043rr0, C1731Fm0 c1731Fm0, C1571Ck0 c1571Ck0) {
        this.f20666a = context;
        this.f20667b = c5043rr0;
        this.f20668c = c1731Fm0;
        this.f20669d = c1571Ck0.k0();
    }

    public final String a(boolean z9, long j10) {
        String string;
        C4792pr0 c4792pr0A = this.f20667b.a(55);
        try {
            try {
                try {
                    c4792pr0A.a();
                    C5388ub c5388ubD0 = C5514vb.d0();
                    c5388ubD0.B(this.f20669d);
                    c5388ubD0.A("0.825731049");
                    Context context = this.f20666a;
                    c5388ubD0.D(context.getPackageName());
                    c5388ubD0.C(System.currentTimeMillis() / 1000);
                    c5388ubD0.F((System.currentTimeMillis() - j10) / 1000);
                    try {
                        c5388ubD0.E(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                        c5388ubD0.E(-1L);
                    }
                    C1731Fm0 c1731Fm0 = this.f20668c;
                    if (!c1731Fm0.c()) {
                        c1731Fm0.a();
                    }
                    C1500Bb c1500BbF = c1731Fm0.f(((C5514vb) c5388ubD0.w()).i(), null);
                    c1500BbF.C(5);
                    c1500BbF.D(2);
                    string = AbstractC2714Yk0.a(((C1552Cb) c1500BbF.w()).i(), true);
                } catch (UnsupportedEncodingException e10) {
                    c4792pr0A.b(e10);
                    string = Integer.toString(7);
                }
                c4792pr0A.c();
                return string;
            } catch (Throwable th) {
                c4792pr0A.b(th);
                throw th;
            }
        } catch (Throwable th2) {
            c4792pr0A.c();
            throw th2;
        }
    }
}
