package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6213g4 extends AbstractC6303q4 {
    C6213g4(C6249k4 c6249k4, String str, Long l10, boolean z9) {
        super(c6249k4, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6303q4
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.f36862b;
        String string = obj.toString();
        StringBuilder sb = new StringBuilder(str.length() + 25 + string.length());
        sb.append("Invalid long value for ");
        sb.append(str);
        sb.append(": ");
        sb.append(string);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
