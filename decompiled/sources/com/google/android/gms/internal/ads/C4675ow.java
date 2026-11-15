package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4675ow extends YF0 {
    public C4675ow(int i10, Map map, C4454nA0 c4454nA0, int i11) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 15);
        sb.append("Response code: ");
        sb.append(i10);
        super(sb.toString(), c4454nA0, 2000, i11);
    }
}
