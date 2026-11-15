package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class FC0 extends AbstractC1495Ay0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC5725xG0 f18718b;

    /* synthetic */ FC0(String str, EnumC5725xG0 enumC5725xG0, byte[] bArr) {
        this.f18717a = str;
        this.f18718b = enumC5725xG0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f18718b != EnumC5725xG0.RAW;
    }

    public final String toString() {
        String str;
        String str2 = this.f18717a;
        int iOrdinal = this.f18718b.ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str2, str);
    }
}
