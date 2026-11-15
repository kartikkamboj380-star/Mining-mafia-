package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class CS0 extends YO0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f17877k = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f17879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f17880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f17881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC5270tf[] f17882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object[] f17883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final HashMap f17884j;

    /* JADX WARN: Illegal instructions before constructor call */
    public CS0(Collection collection, C5189t01 c5189t01) {
        AbstractC5270tf[] abstractC5270tfArr = new AbstractC5270tf[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            abstractC5270tfArr[i11] = ((InterfaceC3986jS0) it.next()).zzb();
            i11++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i10] = ((InterfaceC3986jS0) it2.next()).zza();
            i10++;
        }
        this(abstractC5270tfArr, objArr, c5189t01);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final int a() {
        return this.f17878d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5270tf
    public final int c() {
        return this.f17879e;
    }

    @Override // com.google.android.gms.internal.ads.YO0
    protected final int p(int i10) {
        return AbstractC4634ob0.H(this.f17880f, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.YO0
    protected final int q(int i10) {
        return AbstractC4634ob0.H(this.f17881g, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.YO0
    protected final int r(Object obj) {
        Integer num = (Integer) this.f17884j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.YO0
    protected final AbstractC5270tf s(int i10) {
        return this.f17882h[i10];
    }

    @Override // com.google.android.gms.internal.ads.YO0
    protected final int t(int i10) {
        return this.f17880f[i10];
    }

    @Override // com.google.android.gms.internal.ads.YO0
    protected final int u(int i10) {
        return this.f17881g[i10];
    }

    @Override // com.google.android.gms.internal.ads.YO0
    protected final Object v(int i10) {
        return this.f17883i[i10];
    }

    final List y() {
        return Arrays.asList(this.f17882h);
    }

    public final CS0 z(C5189t01 c5189t01) {
        AbstractC5270tf[] abstractC5270tfArr = this.f17882h;
        AbstractC5270tf[] abstractC5270tfArr2 = new AbstractC5270tf[abstractC5270tfArr.length];
        for (int i10 = 0; i10 < abstractC5270tfArr.length; i10++) {
            abstractC5270tfArr2[i10] = new BS0(this, abstractC5270tfArr[i10]);
        }
        return new CS0(abstractC5270tfArr2, this.f17883i, c5189t01);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private CS0(AbstractC5270tf[] abstractC5270tfArr, Object[] objArr, C5189t01 c5189t01) {
        super(false, c5189t01);
        int i10 = 0;
        this.f17882h = abstractC5270tfArr;
        int length = abstractC5270tfArr.length;
        this.f17880f = new int[length];
        this.f17881g = new int[length];
        this.f17883i = objArr;
        this.f17884j = new HashMap();
        int iA = 0;
        int iC = 0;
        int i11 = 0;
        while (i10 < abstractC5270tfArr.length) {
            AbstractC5270tf abstractC5270tf = abstractC5270tfArr[i10];
            this.f17882h[i11] = abstractC5270tf;
            this.f17881g[i11] = iA;
            this.f17880f[i11] = iC;
            iA += abstractC5270tf.a();
            iC += this.f17882h[i11].c();
            this.f17884j.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f17878d = iA;
        this.f17879e = iC;
    }
}
