package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3373ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5710x9 f27808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z9 f27809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W9 f27810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R9 f27811d;

    public C3373ea(C5710x9 c5710x9, Z9 z9, R9 r10) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        this.f27808a = c5710x9;
        this.f27809b = z9;
        this.f27811d = r10;
        this.f27810c = new W9((i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)) ^ (i17 % 454333378));
    }

    public final Optional a() {
        EnumC4954r9 enumC4954r9;
        try {
            ArrayDeque arrayDeque = this.f27810c.f24718a;
            if (arrayDeque.isEmpty()) {
                throw new V9();
            }
            T9 t10 = (T9) arrayDeque.pop();
            long j10 = t10.f23449a;
            long j11 = t10.f23450b;
            long j12 = t10.f23451c;
            Z9 z9 = this.f27809b;
            if (z9.f26124b < j11) {
                return Optional.of(EnumC4954r9.f32820Y);
            }
            this.f27811d.a(j10);
            if (j12 == 0) {
                while (z9.f26124b > j11) {
                    z9.c();
                }
            }
            return Optional.empty();
        } catch (P9 e10) {
            e = e10;
            throw new AssertionError(K9.a("CEiv6BFfPnitUE+D"), e);
        } catch (Q9 e11) {
            e = e11;
            throw new AssertionError(K9.a("CEiv6BFfPnitUE+D"), e);
        } catch (V9 unused) {
            enumC4954r9 = EnumC4954r9.f32810O;
            return Optional.of(enumC4954r9);
        } catch (X9 unused2) {
            enumC4954r9 = EnumC4954r9.f32820Y;
            return Optional.of(enumC4954r9);
        }
    }
}
