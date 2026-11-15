package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class O60 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2521Us f21477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f21478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f21479c;

    public O60(C2521Us c2521Us, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, Context context) {
        this.f21477a = c2521Us;
        this.f21478b = interfaceExecutorServiceC1805Gx0;
        this.f21479c = context;
    }

    final /* synthetic */ P60 a() {
        C2521Us c2521Us = this.f21477a;
        Context context = this.f21479c;
        if (!c2521Us.a(context)) {
            return new P60(null, null, null, null, null);
        }
        String strH = c2521Us.h(context);
        String str = strH == null ? "" : strH;
        String strI = c2521Us.i(context);
        String str2 = strI == null ? "" : strI;
        String strJ = c2521Us.j(context);
        String str3 = strJ == null ? "" : strJ;
        boolean zA = c2521Us.a(context);
        Long l10 = null;
        String str4 = true != zA ? null : "fa";
        if ("TIME_OUT".equals(str2)) {
            l10 = (Long) H4.B.c().d(AbstractC3892ii.f29670R0);
        }
        return new P60(str, str2, str3, str4 == null ? "" : str4, l10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f21478b.e0(new Callable() { // from class: com.google.android.gms.internal.ads.N60
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f21071a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 34;
    }
}
