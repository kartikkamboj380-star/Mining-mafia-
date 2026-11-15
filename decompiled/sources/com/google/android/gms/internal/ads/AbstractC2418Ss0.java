package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ss0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2418Ss0 {
    public static void a(boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void c(boolean z9, String str, char c10) {
        if (!z9) {
            throw new IllegalArgumentException(AbstractC4040jt0.d(str, Character.valueOf(c10)));
        }
    }

    public static void d(boolean z9, String str, int i10) {
        if (!z9) {
            throw new IllegalArgumentException(AbstractC4040jt0.d(str, Integer.valueOf(i10)));
        }
    }

    public static void e(boolean z9, String str, long j10) {
        if (!z9) {
            throw new IllegalArgumentException(AbstractC4040jt0.d(str, Long.valueOf(j10)));
        }
    }

    public static void f(boolean z9, String str, Object obj) {
        if (!z9) {
            throw new IllegalArgumentException(AbstractC4040jt0.d(str, obj));
        }
    }

    public static void g(boolean z9, String str, int i10, int i11) {
        if (!z9) {
            throw new IllegalArgumentException(AbstractC4040jt0.d(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void h(boolean z9, String str, Object obj, Object obj2) {
        if (!z9) {
            throw new IllegalArgumentException(AbstractC4040jt0.d(str, obj, obj2));
        }
    }

    public static void i(boolean z9) {
        if (!z9) {
            throw new IllegalStateException();
        }
    }

    public static void j(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static Object k(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object l(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(AbstractC4040jt0.d(str, obj2));
    }

    public static int m(int i10, int i11, String str) {
        String strD;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strD = AbstractC4040jt0.d("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 15);
                sb.append("negative size: ");
                sb.append(i11);
                throw new IllegalArgumentException(sb.toString());
            }
            strD = AbstractC4040jt0.d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strD);
    }

    public static int n(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(p(i10, i11, "index"));
        }
        return i10;
    }

    public static void o(int i10, int i11, int i12) {
        String strP;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strP = p(i10, i12, "start index");
            } else {
                strP = (i11 < 0 || i11 > i12) ? p(i11, i12, "end index") : AbstractC4040jt0.d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strP);
        }
    }

    private static String p(int i10, int i11, String str) {
        if (i10 < 0) {
            return AbstractC4040jt0.d("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return AbstractC4040jt0.d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 15);
        sb.append("negative size: ");
        sb.append(i11);
        throw new IllegalArgumentException(sb.toString());
    }
}
