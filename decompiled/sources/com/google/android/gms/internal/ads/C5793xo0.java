package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import p176r5.C7094k;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5793xo0 extends C1721Fh0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC1781Gl0 f35013g;

    C5793xo0(Context context, Executor executor, InterfaceC1781Gl0 interfaceC1781Gl0) {
        super(context, executor, new C7094k().a(), false);
        this.f35013g = interfaceC1781Gl0;
    }

    private static Task i() {
        C7094k c7094k = new C7094k();
        c7094k.c(Boolean.TRUE);
        return c7094k.a();
    }

    @Override // com.google.android.gms.internal.ads.C1721Fh0
    public final Task b(int i10, long j10) {
        this.f35013g.b(i10, j10, null, null);
        return i();
    }

    @Override // com.google.android.gms.internal.ads.C1721Fh0
    public final Task c(int i10, long j10, Exception exc) {
        this.f35013g.b(i10, j10, exc, null);
        return i();
    }

    @Override // com.google.android.gms.internal.ads.C1721Fh0
    public final Task e(int i10, String str) {
        this.f35013g.b(i10, -1L, null, str);
        return i();
    }
}
