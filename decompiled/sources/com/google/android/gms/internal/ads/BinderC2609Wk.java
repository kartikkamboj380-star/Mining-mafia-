package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC2609Wk extends AbstractBinderC1518Bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2713Yk f24863a;

    /* synthetic */ BinderC2609Wk(C2713Yk c2713Yk, byte[] bArr) {
        Objects.requireNonNull(c2713Yk);
        this.f24863a = c2713Yk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1570Ck
    public final void V1(InterfaceC5154sk interfaceC5154sk, String str) {
        C2713Yk c2713Yk = this.f24863a;
        if (c2713Yk.d() == null) {
            return;
        }
        c2713Yk.d().b(c2713Yk.e(interfaceC5154sk), str);
    }
}
