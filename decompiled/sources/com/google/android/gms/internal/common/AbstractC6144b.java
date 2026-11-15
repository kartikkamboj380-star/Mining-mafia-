package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.common.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC6144b extends AbstractC6145c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f36213a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f36214b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f36215c;

    AbstractC6144b(int i10) {
    }

    public final AbstractC6144b a(Object obj) {
        int i10;
        obj.getClass();
        int length = this.f36213a.length;
        int i11 = this.f36214b;
        int i12 = i11 + 1;
        if (i12 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i12 <= length) {
            i10 = length;
        } else {
            i10 = (length >> 1) + length + 1;
            if (i10 < i12) {
                int iHighestOneBit = Integer.highestOneBit(i11);
                i10 = iHighestOneBit + iHighestOneBit;
            }
            if (i10 < 0) {
                i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
        }
        if (i10 > length || this.f36215c) {
            this.f36213a = Arrays.copyOf(this.f36213a, i10);
            this.f36215c = false;
        }
        Object[] objArr = this.f36213a;
        int i13 = this.f36214b;
        this.f36214b = i13 + 1;
        objArr[i13] = obj;
        return this;
    }
}
