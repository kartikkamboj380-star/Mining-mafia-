package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ZG0 extends YF0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26140c;

    public ZG0(int i10, String str, IOException iOException, Map map, C4454nA0 c4454nA0, byte[] bArr) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 15);
        sb.append("Response code: ");
        sb.append(i10);
        super(sb.toString(), iOException, c4454nA0, 2004, 1);
        this.f26140c = i10;
    }
}
