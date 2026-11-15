package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class M {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Comparator f20702g = L.f20310a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator f20703h = K.f20037a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20709f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J[] f20705b = new J[5];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f20704a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20706c = -1;

    public M(int i10) {
    }

    public final void a() {
        this.f20704a.clear();
        this.f20706c = -1;
        this.f20707d = 0;
        this.f20708e = 0;
    }

    public final void b(int i10, float f10) {
        J j10;
        if (this.f20706c != 1) {
            Collections.sort(this.f20704a, f20702g);
            this.f20706c = 1;
        }
        int i11 = this.f20709f;
        if (i11 > 0) {
            J[] jArr = this.f20705b;
            int i12 = i11 - 1;
            this.f20709f = i12;
            j10 = jArr[i12];
        } else {
            j10 = new J(null);
        }
        int i13 = this.f20707d;
        this.f20707d = i13 + 1;
        j10.f19705a = i13;
        j10.f19706b = i10;
        j10.f19707c = f10;
        ArrayList arrayList = this.f20704a;
        arrayList.add(j10);
        this.f20708e += i10;
        while (true) {
            int i14 = this.f20708e;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 - 2000;
            J j11 = (J) arrayList.get(0);
            int i16 = j11.f19706b;
            if (i16 <= i15) {
                this.f20708e -= i16;
                arrayList.remove(0);
                int i17 = this.f20709f;
                if (i17 < 5) {
                    J[] jArr2 = this.f20705b;
                    this.f20709f = i17 + 1;
                    jArr2[i17] = j11;
                }
            } else {
                j11.f19706b = i16 - i15;
                this.f20708e -= i15;
            }
        }
    }

    public final float c(float f10) {
        int i10 = 0;
        if (this.f20706c != 0) {
            Collections.sort(this.f20704a, f20703h);
            this.f20706c = 0;
        }
        float f11 = this.f20708e;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f20704a;
            if (i10 >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((J) arrayList.get(arrayList.size() - 1)).f19707c;
            }
            float f12 = 0.5f * f11;
            J j10 = (J) arrayList.get(i10);
            i11 += j10.f19706b;
            if (i11 >= f12) {
                return j10.f19707c;
            }
            i10++;
        }
    }
}
