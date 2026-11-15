package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
public final class W9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f24718a = new ArrayDeque();

    public W9(int i10) {
    }

    public final void a(long j10, long j11, long j12) throws U9 {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        T9 t10 = new T9(j10, j11, j12);
        ArrayDeque arrayDeque = this.f24718a;
        if (arrayDeque.size() >= ((i17 % 452867621) ^ i18)) {
            throw new U9();
        }
        arrayDeque.push(t10);
    }

    public final T9 b() {
        return (T9) Optional.ofNullable((T9) this.f24718a.peek()).orElseThrow(S9.f23139b);
    }
}
