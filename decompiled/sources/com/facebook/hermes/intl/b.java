package com.facebook.hermes.intl;

import java.text.AttributedCharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f13794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f13795c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f13796d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f13797e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f13798f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final /* synthetic */ int[] f13799g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final /* synthetic */ int[] f13800h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final /* synthetic */ int[] f13801i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final /* synthetic */ int[] f13802j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final /* synthetic */ int[] f13803k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final /* synthetic */ int[] f13804l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final /* synthetic */ int[] f13805m;

        static {
            int[] iArr = new int[k.values().length];
            f13805m = iArr;
            try {
                iArr[k.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13805m[k.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13805m[k.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13805m[k.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13805m[k.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC0322b.values().length];
            f13804l = iArr2;
            try {
                iArr2[EnumC0322b.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13804l[EnumC0322b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13804l[EnumC0322b.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13804l[EnumC0322b.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13804l[EnumC0322b.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[l.values().length];
            f13803k = iArr3;
            try {
                iArr3[l.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13803k[l.LONGOFFSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13803k[l.LONGGENERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13803k[l.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13803k[l.SHORTOFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13803k[l.SHORTGENERIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f13803k[l.UNDEFINED.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr4 = new int[j.values().length];
            f13802j = iArr4;
            try {
                iArr4[j.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f13802j[j.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f13802j[j.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr5 = new int[h.values().length];
            f13801i = iArr5;
            try {
                iArr5[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f13801i[h.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f13801i[h.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            int[] iArr6 = new int[f.values().length];
            f13800h = iArr6;
            try {
                iArr6[f.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f13800h[f.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f13800h[f.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr7 = new int[c.values().length];
            f13799g = iArr7;
            try {
                iArr7[c.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f13799g[c.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f13799g[c.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            int[] iArr8 = new int[i.values().length];
            f13798f = iArr8;
            try {
                iArr8[i.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f13798f[i.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f13798f[i.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f13798f[i.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f13798f[i.NARROW.ordinal()] = 5;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f13798f[i.UNDEFINED.ordinal()] = 6;
            } catch (NoSuchFieldError unused35) {
            }
            int[] iArr9 = new int[n.values().length];
            f13797e = iArr9;
            try {
                iArr9[n.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f13797e[n.DIGIT2.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f13797e[n.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr10 = new int[d.values().length];
            f13796d = iArr10;
            try {
                iArr10[d.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f13796d[d.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f13796d[d.NARROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f13796d[d.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            int[] iArr11 = new int[m.values().length];
            f13795c = iArr11;
            try {
                iArr11[m.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f13795c[m.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f13795c[m.NARROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f13795c[m.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused46) {
            }
            int[] iArr12 = new int[g.values().length];
            f13794b = iArr12;
            try {
                iArr12[g.H11.ordinal()] = 1;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f13794b[g.H12.ordinal()] = 2;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f13794b[g.H23.ordinal()] = 3;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f13794b[g.H24.ordinal()] = 4;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f13794b[g.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused51) {
            }
            int[] iArr13 = new int[e.values().length];
            f13793a = iArr13;
            try {
                iArr13[e.BESTFIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f13793a[e.BASIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused53) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.hermes.intl.b$b, reason: collision with other inner class name */
    public enum EnumC0322b {
        FULL,
        LONG,
        MEDIUM,
        SHORT,
        UNDEFINED;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f13804l[ordinal()];
            if (i10 == 1) {
                return "full";
            }
            if (i10 == 2) {
                return "long";
            }
            if (i10 == 3) {
                return "medium";
            }
            if (i10 == 4) {
                return "short";
            }
            if (i10 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum c {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String d() {
            int i10 = a.f13799g[ordinal()];
            if (i10 == 1) {
                return "d";
            }
            if (i10 == 2) {
                return "dd";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f13799g[ordinal()];
            if (i10 == 1) {
                return "numeric";
            }
            if (i10 == 2) {
                return "2-digit";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum d {
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String d() {
            int i10 = a.f13796d[ordinal()];
            if (i10 == 1) {
                return "GGGG";
            }
            if (i10 == 2) {
                return "GGG";
            }
            if (i10 == 3) {
                return "G5";
            }
            if (i10 == 4) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f13796d[ordinal()];
            if (i10 == 1) {
                return "long";
            }
            if (i10 == 2) {
                return "short";
            }
            if (i10 == 3) {
                return "narrow";
            }
            if (i10 == 4) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum e {
        BESTFIT,
        BASIC;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f13793a[ordinal()];
            if (i10 == 1) {
                return "best fit";
            }
            if (i10 == 2) {
                return "basic";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum f {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String d() {
            int i10 = a.f13800h[ordinal()];
            if (i10 == 1) {
                return "h";
            }
            if (i10 == 2) {
                return "hh";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        public String e() {
            int i10 = a.f13800h[ordinal()];
            if (i10 == 1) {
                return "k";
            }
            if (i10 == 2) {
                return "kk";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f13800h[ordinal()];
            if (i10 == 1) {
                return "numeric";
            }
            if (i10 == 2) {
                return "2-digit";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum g {
        H11,
        H12,
        H23,
        H24,
        UNDEFINED;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f13794b[ordinal()];
            if (i10 == 1) {
                return "h11";
            }
            if (i10 == 2) {
                return "h12";
            }
            if (i10 == 3) {
                return "h23";
            }
            if (i10 == 4) {
                return "h24";
            }
            if (i10 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum h {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String d() {
            int i10 = a.f13801i[ordinal()];
            if (i10 == 1) {
                return "m";
            }
            if (i10 == 2) {
                return "mm";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f13801i[ordinal()];
            if (i10 == 1) {
                return "numeric";
            }
            if (i10 == 2) {
                return "2-digit";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum i {
        NUMERIC,
        DIGIT2,
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String d() {
            switch (a.f13798f[ordinal()]) {
                case 1:
                    return "M";
                case 2:
                    return "MM";
                case 3:
                    return "MMMM";
                case 4:
                    return "MMM";
                case 5:
                    return "MMMMM";
                case 6:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (a.f13798f[ordinal()]) {
                case 1:
                    return "numeric";
                case 2:
                    return "2-digit";
                case 3:
                    return "long";
                case 4:
                    return "short";
                case 5:
                    return "narrow";
                case 6:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public enum j {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String d() {
            int i10 = a.f13802j[ordinal()];
            if (i10 == 1) {
                return "s";
            }
            if (i10 == 2) {
                return "ss";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f13802j[ordinal()];
            if (i10 == 1) {
                return "numeric";
            }
            if (i10 == 2) {
                return "2-digit";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum k {
        FULL,
        LONG,
        MEDIUM,
        SHORT,
        UNDEFINED;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f13805m[ordinal()];
            if (i10 == 1) {
                return "full";
            }
            if (i10 == 2) {
                return "long";
            }
            if (i10 == 3) {
                return "medium";
            }
            if (i10 == 4) {
                return "short";
            }
            if (i10 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum l {
        LONG,
        LONGOFFSET,
        LONGGENERIC,
        SHORT,
        SHORTOFFSET,
        SHORTGENERIC,
        UNDEFINED;

        public String d() {
            switch (a.f13803k[ordinal()]) {
                case 1:
                    return "zzzz";
                case 2:
                    return "OOOO";
                case 3:
                    return "vvvv";
                case 4:
                    return "z";
                case 5:
                    return "O";
                case 6:
                    return "v";
                case 7:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            switch (a.f13803k[ordinal()]) {
                case 1:
                    return "long";
                case 2:
                    return "longOffset";
                case 3:
                    return "longGeneric";
                case 4:
                    return "short";
                case 5:
                    return "shortOffset";
                case 6:
                    return "shortGeneric";
                case 7:
                    return "";
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public enum m {
        LONG,
        SHORT,
        NARROW,
        UNDEFINED;

        public String d() {
            int i10 = a.f13795c[ordinal()];
            if (i10 == 1) {
                return "EEEE";
            }
            if (i10 == 2) {
                return "EEE";
            }
            if (i10 == 3) {
                return "EEEEE";
            }
            if (i10 == 4) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f13795c[ordinal()];
            if (i10 == 1) {
                return "long";
            }
            if (i10 == 2) {
                return "short";
            }
            if (i10 == 3) {
                return "narrow";
            }
            if (i10 == 4) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum n {
        NUMERIC,
        DIGIT2,
        UNDEFINED;

        public String d() {
            int i10 = a.f13797e[ordinal()];
            if (i10 == 1) {
                return "yyyy";
            }
            if (i10 == 2) {
                return "yy";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f13797e[ordinal()];
            if (i10 == 1) {
                return "numeric";
            }
            if (i10 == 2) {
                return "2-digit";
            }
            if (i10 == 3) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    AttributedCharacterIterator a(double d10);

    String b(B2.b bVar);

    String c(double d10);

    void d(B2.b bVar, String str, String str2, e eVar, m mVar, d dVar, n nVar, i iVar, c cVar, f fVar, h hVar, j jVar, l lVar, g gVar, Object obj, EnumC0322b enumC0322b, k kVar, Object obj2);

    String e(B2.b bVar);

    g f(B2.b bVar);

    String g(AttributedCharacterIterator.Attribute attribute, String str);

    String h(B2.b bVar);
}
