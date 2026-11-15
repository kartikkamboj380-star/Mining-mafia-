package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4828q80 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4198l80 f32581a;

    private C4828q80(C4198l80 c4198l80) {
        this.f32581a = c4198l80;
    }

    public static C4828q80 b(C4198l80 c4198l80) {
        return new C4828q80(c4198l80);
    }

    public static String c(C4198l80 c4198l80) {
        String strE = c4198l80.e();
        AbstractC4738pQ0.b(strE);
        return strE;
    }

    public final String a() {
        return c(this.f32581a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return c(this.f32581a);
    }
}
