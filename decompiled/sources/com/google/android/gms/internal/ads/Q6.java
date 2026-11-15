package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class Q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5570w2 f22298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f22299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f22302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f22307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f22308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f22309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f22310m;

    public Q6(InterfaceC5570w2 interfaceC5570w2) {
        this.f22298a = interfaceC5570w2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void e(int i10) {
        long j10 = this.f22309l;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f22299b;
            long j12 = this.f22308k;
            if (j11 == j12) {
                return;
            }
            int i11 = (int) (j11 - j12);
            this.f22298a.c(j10, this.f22310m ? 1 : 0, i11, i10, null);
        }
    }

    public final void a() {
        this.f22303f = false;
        this.f22304g = false;
        this.f22305h = false;
        this.f22306i = false;
        this.f22307j = false;
    }

    public final void b(long j10, int i10, int i11, long j11, boolean z9) {
        this.f22304g = false;
        this.f22305h = false;
        this.f22302e = j11;
        this.f22301d = 0;
        this.f22299b = j10;
        if (i11 >= 32 && i11 != 40) {
            if (this.f22306i && !this.f22307j) {
                if (z9) {
                    e(i10);
                }
                this.f22306i = false;
            }
            if (i11 <= 35 || i11 == 39) {
                this.f22305h = !this.f22307j;
                this.f22307j = true;
            }
        }
        boolean z10 = i11 >= 16 && i11 <= 21;
        this.f22300c = z10;
        this.f22303f = z10 || i11 <= 9;
    }

    public final void c(byte[] bArr, int i10, int i11) {
        if (this.f22303f) {
            int i12 = this.f22301d;
            int i13 = (i10 + 2) - i12;
            if (i13 >= i11) {
                this.f22301d = i12 + (i11 - i10);
            } else {
                this.f22304g = (bArr[i13] & 128) != 0;
                this.f22303f = false;
            }
        }
    }

    public final void d(long j10, int i10, boolean z9) {
        if (this.f22307j && this.f22304g) {
            this.f22310m = this.f22300c;
            this.f22307j = false;
        } else if (this.f22305h || this.f22304g) {
            if (z9 && this.f22306i) {
                e(i10 + ((int) (j10 - this.f22299b)));
            }
            this.f22308k = this.f22299b;
            this.f22309l = this.f22302e;
            this.f22310m = this.f22300c;
            this.f22306i = true;
        }
    }
}
