package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4324m80 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4198l80 f31450a;

    private C4324m80(C4198l80 c4198l80) {
        this.f31450a = c4198l80;
    }

    public static C4324m80 b(C4198l80 c4198l80) {
        return new C4324m80(c4198l80);
    }

    public static String c(C4198l80 c4198l80) {
        String strA = c4198l80.a();
        AbstractC4738pQ0.b(strA);
        return strA;
    }

    public final String a() {
        return c(this.f31450a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return c(this.f31450a);
    }
}
