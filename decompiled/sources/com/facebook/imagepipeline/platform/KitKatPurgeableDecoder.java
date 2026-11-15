package com.facebook.imagepipeline.platform;

import R2.t;
import Y1.d;
import Y1.k;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import p013b2.h;
import p023c2.a;

/* JADX INFO: loaded from: classes.dex */
@d
@TargetApi(19)
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f13970c;

    @d
    public KitKatPurgeableDecoder(t tVar) {
        this.f13970c = tVar;
    }

    private static void h(byte[] bArr, int i10) {
        bArr[i10] = -1;
        bArr[i10 + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(a aVar, BitmapFactory.Options options) {
        h hVar = (h) aVar.G();
        int size = hVar.size();
        a aVarA = this.f13970c.a(size);
        try {
            byte[] bArr = (byte[]) aVarA.G();
            hVar.b(0, bArr, 0, size);
            return (Bitmap) k.h(BitmapFactory.decodeByteArray(bArr, 0, size, options), "BitmapFactory returned null");
        } finally {
            a.x(aVarA);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(a aVar, int i10, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.e(aVar, i10) ? null : DalvikPurgeableDecoder.f13958b;
        h hVar = (h) aVar.G();
        k.b(Boolean.valueOf(i10 <= hVar.size()));
        int i11 = i10 + 2;
        a aVarA = this.f13970c.a(i11);
        try {
            byte[] bArr2 = (byte[]) aVarA.G();
            hVar.b(0, bArr2, 0, i10);
            if (bArr != null) {
                h(bArr2, i10);
                i10 = i11;
            }
            return (Bitmap) k.h(BitmapFactory.decodeByteArray(bArr2, 0, i10, options), "BitmapFactory returned null");
        } finally {
            a.x(aVarA);
        }
    }
}
