package com.google.android.gms.internal.auth;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class F extends M {
    F(I i10, String str, Boolean bool, boolean z9) {
        super(i10, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.M
    final /* synthetic */ Object a(Object obj) {
        if (AbstractC6101l.f36107c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (AbstractC6101l.f36108d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + this.f35944b + ": " + ((String) obj));
        return null;
    }
}
