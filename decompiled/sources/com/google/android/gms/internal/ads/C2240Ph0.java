package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ph0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2240Ph0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Looper f22150b;

    public C2240Ph0(Context context, Looper looper) {
        this.f22149a = context;
        this.f22150b = looper;
    }

    public final void a(String str) {
        C2888ai0 c2888ai0D0 = C3139ci0.d0();
        Context context = this.f22149a;
        c2888ai0D0.A(context.getPackageName());
        c2888ai0D0.C(2);
        C2656Xh0 c2656Xh0D0 = C2760Zh0.d0();
        c2656Xh0D0.A(str);
        c2656Xh0D0.B(2);
        c2888ai0D0.B(c2656Xh0D0);
        new C2292Qh0(context, this.f22150b, (C3139ci0) c2888ai0D0.w()).a();
    }
}
