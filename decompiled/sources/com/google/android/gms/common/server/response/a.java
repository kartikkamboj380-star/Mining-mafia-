package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

/* JADX INFO: loaded from: classes2.dex */
final class a implements i {
    a() {
    }

    @Override // com.google.android.gms.common.server.response.i
    public final /* synthetic */ Object a(FastParser fastParser, BufferedReader bufferedReader) {
        return Integer.valueOf(fastParser.zal(bufferedReader));
    }
}
