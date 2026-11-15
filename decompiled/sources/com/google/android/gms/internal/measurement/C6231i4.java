package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6231i4 extends AbstractC6303q4 {
    C6231i4(C6249k4 c6249k4, String str, Double d10, boolean z9) {
        super(c6249k4, "measurement.test.double_flag", d10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6303q4
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.f36862b;
        String string = obj.toString();
        StringBuilder sb = new StringBuilder(str.length() + 27 + string.length());
        sb.append("Invalid double value for ");
        sb.append(str);
        sb.append(": ");
        sb.append(string);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
