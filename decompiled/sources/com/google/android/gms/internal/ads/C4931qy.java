package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4931qy implements InterfaceC3732hQ0 {
    private C4931qy(C3170cy c3170cy) {
    }

    public static C4931qy a(C3170cy c3170cy) {
        return new C4931qy(c3170cy);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d"));
        return intent;
    }
}
