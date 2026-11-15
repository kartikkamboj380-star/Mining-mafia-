package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5454v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f33995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f33996e;

    public C5454v7(int i10, String str, int i11, List list, byte[] bArr) {
        this.f33992a = i10;
        this.f33993b = str;
        this.f33994c = i11;
        this.f33995d = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.f33996e = bArr;
    }

    public final int a() {
        int i10 = this.f33994c;
        if (i10 == 2) {
            return 2048;
        }
        if (i10 != 3) {
            return 0;
        }
        return IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
    }
}
