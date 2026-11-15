package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class I2 implements I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f19452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H2 f19453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC5576w5 f19455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private L1 f19457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private J2 f19458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private L2[] f19460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f19461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private L2 f19462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f19463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f19464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f19465n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19466o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19467p;

    public I2(int i10, InterfaceC5576w5 interfaceC5576w5) {
        this.f19455d = interfaceC5576w5;
        this.f19454c = 1 == (i10 ^ 1);
        this.f19452a = new P10(12);
        this.f19453b = new H2(null);
        this.f19457f = new C3683h2();
        this.f19460i = new L2[0];
        this.f19464m = -1L;
        this.f19465n = -1L;
        this.f19463l = -1;
        this.f19459h = -9223372036854775807L;
    }

    private final L2 c(int i10) {
        for (L2 l10 : this.f19460i) {
            if (l10.c(i10)) {
                return l10;
            }
        }
        return null;
    }

    final /* synthetic */ L2[] a() {
        return this.f19460i;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void d(long j10, long j11) {
        this.f19461j = -1L;
        this.f19462k = null;
        for (L2 l10 : this.f19460i) {
            l10.f(j10);
        }
        if (j10 == 0) {
            this.f19456e = this.f19460i.length != 0 ? 3 : 0;
        } else {
            this.f19456e = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final boolean e(J1 j10) {
        P10 p10 = this.f19452a;
        j10.J(p10.H(), 0, 12);
        p10.G(0);
        if (p10.c() != 1179011410) {
            return false;
        }
        p10.J(4);
        return p10.c() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void f(L1 l10) {
        this.f19456e = 0;
        if (this.f19454c) {
            l10 = new C5954z5(l10, this.f19455d);
        }
        this.f19457f = l10;
        this.f19461j = -1L;
    }

    /* JADX WARN: Failed to calculate best type for var: r2v35 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v35 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v35 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v35 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v24 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v25 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v27 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v35 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // com.google.android.gms.internal.ads.I1
    public final int g(com.google.android.gms.internal.ads.J1 r22, com.google.android.gms.internal.ads.C3933j2 r23) {
        /*
            Method dump skipped, instruction units count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.I2.g(com.google.android.gms.internal.ads.J1, com.google.android.gms.internal.ads.j2):int");
    }
}
