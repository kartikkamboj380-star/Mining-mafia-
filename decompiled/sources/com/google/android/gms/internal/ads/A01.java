package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class A01 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A01 f17221d = new A01(new C2495Uf[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC5931yu0 f17223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17224c;

    static {
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
    }

    public A01(C2495Uf... c2495UfArr) {
        this.f17223b = AbstractC5931yu0.v(c2495UfArr);
        this.f17222a = c2495UfArr.length;
        int i10 = 0;
        while (i10 < this.f17223b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f17223b.size(); i12++) {
                if (((C2495Uf) this.f17223b.get(i10)).equals(this.f17223b.get(i12))) {
                    YU.f("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final C2495Uf a(int i10) {
        return (C2495Uf) this.f17223b.get(i10);
    }

    public final int b(C2495Uf c2495Uf) {
        int iIndexOf = this.f17223b.indexOf(c2495Uf);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final AbstractC5931yu0 c() {
        return AbstractC5931yu0.u(AbstractC2786Zu0.c(this.f17223b, C5945z01.f35613a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A01.class == obj.getClass()) {
            A01 a01 = (A01) obj;
            if (this.f17222a == a01.f17222a && this.f17223b.equals(a01.f17223b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f17224c;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f17223b.hashCode();
        this.f17224c = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.f17223b.toString();
    }
}
