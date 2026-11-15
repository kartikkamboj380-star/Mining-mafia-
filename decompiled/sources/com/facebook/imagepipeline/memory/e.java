package com.facebook.imagepipeline.memory;

import R2.F;
import R2.G;
import R2.w;
import Y1.k;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f13953k;

    e(p013b2.d dVar, F f10, G g10) {
        super(dVar, f10, g10);
        SparseIntArray sparseIntArray = (SparseIntArray) k.g(f10.f5124c);
        this.f13953k = new int[sparseIntArray.size()];
        int i10 = 0;
        while (true) {
            int[] iArr = this.f13953k;
            if (i10 >= iArr.length) {
                r();
                return;
            } else {
                iArr[i10] = sparseIntArray.keyAt(i10);
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int n(w wVar) {
        k.g(wVar);
        return wVar.a();
    }

    int B() {
        return this.f13953k[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean t(w wVar) {
        k.g(wVar);
        return !wVar.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int m(int i10) {
        if (i10 <= 0) {
            throw new a.b(Integer.valueOf(i10));
        }
        for (int i11 : this.f13953k) {
            if (i11 >= i10) {
                return i11;
            }
        }
        return i10;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int o(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void j(w wVar) {
        k.g(wVar);
        wVar.close();
    }
}
