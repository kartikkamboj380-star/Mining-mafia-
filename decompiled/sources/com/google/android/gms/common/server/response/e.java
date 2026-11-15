package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

/* JADX INFO: loaded from: classes2.dex */
final class e implements i {
    e() {
    }

    @Override // com.google.android.gms.common.server.response.i
    public final /* bridge */ /* synthetic */ Object a(FastParser fastParser, BufferedReader bufferedReader) {
        return Boolean.valueOf(fastParser.zay(bufferedReader, false));
    }
}
