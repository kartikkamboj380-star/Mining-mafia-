package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6428l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f37300a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f37301b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    C6424k f37302c;

    public final C6428l a(Object obj, Object obj2) {
        int i10 = this.f37301b + 1;
        Object[] objArr = this.f37300a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = iHighestOneBit + iHighestOneBit;
            }
            if (i12 < 0) {
                i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            this.f37300a = Arrays.copyOf(objArr, i12);
        }
        AbstractC6400e.a(obj, obj2);
        Object[] objArr2 = this.f37300a;
        int i13 = this.f37301b;
        int i14 = i13 + i13;
        objArr2[i14] = obj;
        objArr2[i14 + 1] = obj2;
        this.f37301b = i13 + 1;
        return this;
    }

    public final AbstractC6432m b() {
        C6424k c6424k = this.f37302c;
        if (c6424k != null) {
            throw c6424k.a();
        }
        C6463u c6463uH = C6463u.h(this.f37301b, this.f37300a, this);
        C6424k c6424k2 = this.f37302c;
        if (c6424k2 == null) {
            return c6463uH;
        }
        throw c6424k2.a();
    }
}
