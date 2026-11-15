package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes2.dex */
final class O6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5570w2 f21465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f21466b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f21467c = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f21468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f21470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f21471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f21473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f21474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f21475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21476l;

    public O6(InterfaceC5570w2 interfaceC5570w2, boolean z9, boolean z10) {
        this.f21465a = interfaceC5570w2;
        byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        this.f21468d = bArr;
        new C1999Kq0(bArr, 0, 0);
        this.f21472h = false;
    }

    public final void a(C1893Ip0 c1893Ip0) {
        this.f21466b.append(c1893Ip0.f19662d, c1893Ip0);
    }

    public final void b(C3530fp0 c3530fp0) {
        this.f21467c.append(c3530fp0.f28483a, c3530fp0);
    }

    public final void c() {
        this.f21472h = false;
    }

    public final void d(long j10, int i10, long j11, boolean z9) {
        this.f21469e = i10;
        this.f21471g = j11;
        this.f21470f = j10;
        this.f21476l = z9;
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
    public final boolean e(long j10, int i10, boolean z9) {
        boolean z10 = false;
        if (this.f21469e == 9) {
            if (z9 && this.f21472h) {
                long j11 = this.f21470f;
                int i11 = i10 + ((int) (j10 - j11));
                long j12 = this.f21474j;
                if (j12 != -9223372036854775807L) {
                    long j13 = this.f21473i;
                    if (j11 != j13) {
                        this.f21465a.c(j12, this.f21475k ? 1 : 0, (int) (j11 - j13), i11, null);
                    }
                }
            }
            this.f21473i = this.f21470f;
            this.f21474j = this.f21471g;
            this.f21475k = false;
            this.f21472h = true;
        }
        boolean z11 = this.f21476l;
        boolean z12 = this.f21475k;
        int i12 = this.f21469e;
        if (i12 == 5 || (z11 && i12 == 1)) {
            z10 = true;
        }
        boolean z13 = z12 | z10;
        this.f21475k = z13;
        this.f21469e = 24;
        return z13;
    }
}
