package com.google.android.gms.internal.ads;

import K4.AbstractC0763d;
import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2814a70 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f26431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f26432b;

    C2814a70(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, Context context) {
        this.f26431a = interfaceExecutorServiceC1805Gx0;
        this.f26432b = context;
    }

    final /* synthetic */ Y60 a() {
        return new Y60(AbstractC0763d.b(this.f26432b, (String) H4.B.c().d(AbstractC3892ii.f29778b7)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f26431a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.Z60
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f26116a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 37;
    }
}
