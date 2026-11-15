package S6;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f5506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f5507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f5508c;

        public a(int i10, int i11, int i12) {
            this.f5506a = i10;
            this.f5507b = i11;
            this.f5508c = i12;
        }

        public a a(a aVar) {
            return new a(this.f5506a - aVar.d(), this.f5507b - aVar.c(), this.f5508c - aVar.b());
        }

        public int b() {
            return this.f5508c;
        }

        public int c() {
            return this.f5507b;
        }

        public int d() {
            return this.f5506a;
        }
    }

    public static a a(SparseIntArray[] sparseIntArrayArr) {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        int i12 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i12);
                int iValueAt = sparseIntArray.valueAt(i12);
                i13 += iValueAt;
                if (iKeyAt > 700) {
                    i11 += iValueAt;
                }
                if (iKeyAt > 16) {
                    i10 += iValueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new a(i12, i10, i11);
    }
}
