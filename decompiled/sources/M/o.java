package M;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f3443a = new e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f3444b = new e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f3445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f3446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f3447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f3448f;

    private static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final a f3449b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f3450a;

        private a(boolean z9) {
            this.f3450a = z9;
        }

        @Override // M.o.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z9 = false;
            while (i10 < i12) {
                int iA = o.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                    } else if (!this.f3450a) {
                        return 1;
                    }
                    i10++;
                    z9 = z9;
                } else if (this.f3450a) {
                    return 0;
                }
                z9 = true;
                i10++;
                z9 = z9;
            }
            if (z9) {
                return this.f3450a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f3451a = new b();

        private b() {
        }

        @Override // M.o.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = o.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    private static abstract class d implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f3452a;

        d(c cVar) {
            this.f3452a = cVar;
        }

        private boolean b(CharSequence charSequence, int i10, int i11) {
            int iA = this.f3452a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        protected abstract boolean a();

        @Override // M.n
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f3452a == null ? a() : b(charSequence, i10, i11);
        }
    }

    private static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f3453b;

        e(c cVar, boolean z9) {
            super(cVar);
            this.f3453b = z9;
        }

        @Override // M.o.d
        protected boolean a() {
            return this.f3453b;
        }
    }

    private static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f f3454b = new f();

        f() {
            super(null);
        }

        @Override // M.o.d
        protected boolean a() {
            return p.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f3451a;
        f3445c = new e(bVar, false);
        f3446d = new e(bVar, true);
        f3447e = new e(a.f3449b, false);
        f3448f = f.f3454b;
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
