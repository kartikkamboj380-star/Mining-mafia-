package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class HC0 extends AbstractC1495Ay0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5593wD0 f19240a;

    public HC0(C5593wD0 c5593wD0) {
        this.f19240a = c5593wD0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f19240a.d().f0() != EnumC5725xG0.RAW;
    }

    public final C5593wD0 b() {
        return this.f19240a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HC0)) {
            return false;
        }
        C5593wD0 c5593wD0 = ((HC0) obj).f19240a;
        C5593wD0 c5593wD1 = this.f19240a;
        return c5593wD1.d().f0().equals(c5593wD0.d().f0()) && c5593wD1.d().d0().equals(c5593wD0.d().d0()) && c5593wD1.d().e0().equals(c5593wD0.d().e0());
    }

    public final int hashCode() {
        C5593wD0 c5593wD0 = this.f19240a;
        return Objects.hash(c5593wD0.d(), c5593wD0.b());
    }

    public final String toString() {
        String str;
        C5593wD0 c5593wD0 = this.f19240a;
        String strD0 = c5593wD0.d().d0();
        int iOrdinal = c5593wD0.d().f0().ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", strD0, str);
    }
}
