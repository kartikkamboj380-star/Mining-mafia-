package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class M6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5570w2 f20757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f20763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f20764h;

    public M6(InterfaceC5570w2 interfaceC5570w2) {
        this.f20757a = interfaceC5570w2;
    }

    public final void a() {
        this.f20758b = false;
        this.f20759c = false;
        this.f20760d = false;
        this.f20761e = -1;
    }

    public final void b(int i10, long j10) {
        boolean z9;
        this.f20761e = i10;
        this.f20760d = false;
        if (i10 == 182) {
            z9 = true;
        } else if (i10 == 179) {
            i10 = 179;
            z9 = true;
        } else {
            z9 = false;
        }
        this.f20758b = z9;
        this.f20759c = i10 == 182;
        this.f20762f = 0;
        this.f20764h = j10;
    }

    public final void c(byte[] bArr, int i10, int i11) {
        if (this.f20759c) {
            int i12 = this.f20762f;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.f20762f = i12 + (i11 - i10);
            } else {
                this.f20760d = ((bArr[i13] & 192) >> 6) == 0;
                this.f20759c = false;
            }
        }
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
    public final void d(long j10, int i10, boolean z9) {
        AbstractC2418Ss0.i(this.f20764h != -9223372036854775807L);
        if (this.f20761e == 182 && z9 && this.f20758b) {
            this.f20757a.c(this.f20764h, this.f20760d ? 1 : 0, (int) (j10 - this.f20763g), i10, null);
        }
        if (this.f20761e != 179) {
            this.f20763g = j10;
        }
    }
}
