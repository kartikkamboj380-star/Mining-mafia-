package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5680wv extends AbstractC3571g9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C5680wv f34671c = new C5680wv();

    C5680wv() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3571g9
    public final InterfaceC4073k9 b(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new C4325m9();
        }
        return "mvhd".equals(str) ? new C4451n9() : new C4577o9(str);
    }
}
