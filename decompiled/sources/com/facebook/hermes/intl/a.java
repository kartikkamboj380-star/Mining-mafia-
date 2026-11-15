package com.facebook.hermes.intl;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: com.facebook.hermes.intl.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0321a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f13778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f13779c;

        static {
            int[] iArr = new int[b.values().length];
            f13779c = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13779c[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13779c[b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.values().length];
            f13778b = iArr2;
            try {
                iArr2[d.SORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13778b[d.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[c.values().length];
            f13777a = iArr3;
            try {
                iArr3[c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13777a[c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13777a[c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13777a[c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13777a[c.LOCALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public enum b {
        UPPER,
        LOWER,
        FALSE;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = C0321a.f13779c[ordinal()];
            if (i10 == 1) {
                return "upper";
            }
            if (i10 == 2) {
                return "lower";
            }
            if (i10 == 3) {
                return "false";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum c {
        BASE,
        ACCENT,
        CASE,
        VARIANT,
        LOCALE;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = C0321a.f13777a[ordinal()];
            if (i10 == 1) {
                return "base";
            }
            if (i10 == 2) {
                return "accent";
            }
            if (i10 == 3) {
                return "case";
            }
            if (i10 == 4) {
                return "variant";
            }
            if (i10 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum d {
        SORT,
        SEARCH;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = C0321a.f13778b[ordinal()];
            if (i10 == 1) {
                return "sort";
            }
            if (i10 == 2) {
                return "search";
            }
            throw new IllegalArgumentException();
        }
    }

    int a(String str, String str2);

    c b();

    a c(boolean z9);

    a d(b bVar);

    a e(boolean z9);

    a f(B2.b bVar);

    a g(c cVar);
}
