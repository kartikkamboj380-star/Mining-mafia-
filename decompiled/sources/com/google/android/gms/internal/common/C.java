package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C {
    public static void a(boolean z9) {
        if (!z9) {
            throw new IllegalStateException();
        }
    }

    public static int b(int i10, int i11, String str) {
        String strA;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strA = I.a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 15);
                sb.append("negative size: ");
                sb.append(i11);
                throw new IllegalArgumentException(sb.toString());
            }
            strA = I.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strA);
    }

    public static int c(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(e(i10, i11, "index"));
        }
        return i10;
    }

    public static void d(int i10, int i11, int i12) {
        String strE;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strE = e(i10, i12, "start index");
            } else {
                strE = (i11 < 0 || i11 > i12) ? e(i11, i12, "end index") : I.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strE);
        }
    }

    private static String e(int i10, int i11, String str) {
        if (i10 < 0) {
            return I.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return I.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 15);
        sb.append("negative size: ");
        sb.append(i11);
        throw new IllegalArgumentException(sb.toString());
    }
}
