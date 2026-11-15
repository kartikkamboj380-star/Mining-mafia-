package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

/* JADX INFO: loaded from: classes2.dex */
final class f implements PendingResultUtil.ResultConverter {
    /* synthetic */ f(byte[] bArr) {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ Object convert(Result result) {
        return ((p006a5.b) result).a();
    }
}
