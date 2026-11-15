package com.facebook.imagepipeline.memory;

import R2.F;
import R2.G;
import android.util.SparseIntArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class d extends a implements p013b2.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f13952k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p013b2.d memoryTrimmableRegistry, F poolParams, G poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        Intrinsics.checkNotNullParameter(memoryTrimmableRegistry, "memoryTrimmableRegistry");
        Intrinsics.checkNotNullParameter(poolParams, "poolParams");
        Intrinsics.checkNotNullParameter(poolStatsTracker, "poolStatsTracker");
        SparseIntArray sparseIntArray = poolParams.f5124c;
        if (sparseIntArray != null) {
            this.f13952k = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f13952k[i10] = sparseIntArray.keyAt(i10);
            }
        } else {
            this.f13952k = new int[0];
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void j(byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int n(byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.length;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int m(int i10) {
        if (i10 <= 0) {
            throw new a.b(Integer.valueOf(i10));
        }
        for (int i11 : this.f13952k) {
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
    public byte[] f(int i10) {
        return new byte[i10];
    }
}
