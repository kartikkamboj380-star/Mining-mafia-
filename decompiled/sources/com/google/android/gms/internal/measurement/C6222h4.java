package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6222h4 extends AbstractC6303q4 {
    C6222h4(C6249k4 c6249k4, String str, Boolean bool, boolean z9) {
        super(c6249k4, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6303q4
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (K3.f36321c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (K3.f36322d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.f36862b;
        String string = obj.toString();
        StringBuilder sb = new StringBuilder(str2.length() + 28 + string.length());
        sb.append("Invalid boolean value for ");
        sb.append(str2);
        sb.append(": ");
        sb.append(string);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
