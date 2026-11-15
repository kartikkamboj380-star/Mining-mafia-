package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6226i implements InterfaceC6289p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f36707a;

    public C6226i(Double d10) {
        if (d10 == null) {
            this.f36707a = Double.valueOf(Double.NaN);
        } else {
            this.f36707a = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p e(String str, C6157a2 c6157a2, List list) {
        if ("toString".equals(str)) {
            return new C6324t(zzc());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzc(), str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6226i) {
            return this.f36707a.equals(((C6226i) obj).f36707a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p g() {
        return new C6226i(this.f36707a);
    }

    public final int hashCode() {
        return this.f36707a.hashCode();
    }

    public final String toString() {
        return zzc();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final String zzc() {
        Double d10 = this.f36707a;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalA = com.bytedance.adsdk.kq.a.a(BigDecimal.valueOf(d10.doubleValue()));
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalA.scale() > 0 ? bigDecimalA.precision() : bigDecimalA.scale()) - 1);
        String str = decimalFormat.format(bigDecimalA);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i10 >= 0 || i10 <= -7) && (i10 < 0 || i10 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimalA.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Double zzd() {
        return this.f36707a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6289p
    public final Boolean zze() {
        Double d10 = this.f36707a;
        boolean z9 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z9 = true;
        }
        return Boolean.valueOf(z9);
    }
}
