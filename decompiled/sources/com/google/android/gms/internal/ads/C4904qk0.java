package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4904qk0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32720a;

    private C4904qk0(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f32720a = interfaceC4864qQ0;
    }

    public static C4904qk0 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C4904qk0(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        File dir = ((Context) this.f32720a.zzb()).getDir("yqzdkcache", 0);
        AbstractC4738pQ0.b(dir);
        return dir;
    }
}
