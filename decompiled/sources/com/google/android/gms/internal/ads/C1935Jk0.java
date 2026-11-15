package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1935Jk0 implements InterfaceC6037zk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExecutorService f19984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f19985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1571Ck0 f19986c;

    /* synthetic */ C1935Jk0(byte[] bArr) {
    }

    public final C1935Jk0 a(ExecutorService executorService) {
        executorService.getClass();
        this.f19984a = executorService;
        return this;
    }

    public final C1935Jk0 b(Context context) {
        context.getClass();
        this.f19985b = context;
        return this;
    }

    public final C1935Jk0 c(C1571Ck0 c1571Ck0) {
        c1571Ck0.getClass();
        this.f19986c = c1571Ck0;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6037zk0
    public final InterfaceC1467Ak0 zza() {
        AbstractC4738pQ0.c(this.f19984a, ExecutorService.class);
        AbstractC4738pQ0.c(this.f19985b, Context.class);
        AbstractC4738pQ0.c(this.f19986c, C1571Ck0.class);
        return new C1883Ik0(new C2148Nn0(), new C2252Pn0(), new C2356Rn0(), this.f19984a, this.f19985b, this.f19986c);
    }
}
