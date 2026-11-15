package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3562g40 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C90 f28558a;

    C3562g40(C90 c90) {
        this.f28558a = c90;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        C90 c90 = this.f28558a;
        if (c90 == null) {
            return AbstractC5685wx0.a(new C3436f40(null));
        }
        String strA = c90.a();
        return Strings.isEmptyOrWhitespace(strA) ? AbstractC5685wx0.a(new C3436f40(null)) : AbstractC5685wx0.a(new C3436f40(strA));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 15;
    }
}
