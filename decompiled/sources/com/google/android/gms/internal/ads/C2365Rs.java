package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2365Rs implements InterfaceC5520ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f22937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22939d;

    public C2365Rs(Context context, String str) {
        this.f22936a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f22938c = str;
        this.f22939d = false;
        this.f22937b = new Object();
    }

    public final void b(boolean z9) {
        C2521Us c2521UsD = G4.t.d();
        Context context = this.f22936a;
        if (c2521UsD.a(context)) {
            synchronized (this.f22937b) {
                try {
                    if (this.f22939d == z9) {
                        return;
                    }
                    this.f22939d = z9;
                    String str = this.f22938c;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.f22939d) {
                        G4.t.d().d(context, str);
                    } else {
                        G4.t.d().e(context, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String e() {
        return this.f22938c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5520ve
    public final void s0(C5394ue c5394ue) {
        b(c5394ue.f33869j);
    }
}
