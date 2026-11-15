package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class B5 implements InterfaceC5570w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5570w2 f17472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5576w5 f17473b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC5828y5 f17478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JY0 f17479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17480i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17475d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17476e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f17477f = AbstractC4634ob0.f32118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P10 f17474c = new P10();

    public B5(InterfaceC5570w2 interfaceC5570w2, InterfaceC5576w5 interfaceC5576w5) {
        this.f17472a = interfaceC5570w2;
        this.f17473b = interfaceC5576w5;
    }

    private final void j(int i10) {
        int length = this.f17477f.length;
        int i11 = this.f17476e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f17475d;
        int iMax = Math.max(i12 + i12, i10 + i12);
        byte[] bArr = this.f17477f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f17475d, bArr2, 0, i12);
        this.f17475d = 0;
        this.f17476e = i12;
        this.f17477f = bArr2;
    }

    public final void a(boolean z9) {
        this.f17480i = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final void c(final long j10, final int i10, int i11, int i12, C5444v2 c5444v2) {
        if (this.f17478g == null) {
            this.f17472a.c(j10, i10, i11, i12, c5444v2);
            return;
        }
        AbstractC2418Ss0.b(c5444v2 == null, "DRM on subtitles is not supported");
        int i13 = (this.f17476e - i12) - i11;
        try {
            this.f17478g.a(this.f17477f, i13, i11, C5702x5.a(), new InterfaceC3977jO() { // from class: com.google.android.gms.internal.ads.A5
                @Override // com.google.android.gms.internal.ads.InterfaceC3977jO
                public final /* synthetic */ void zza(Object obj) {
                    this.f17237a.i(j10, i10, (C4695p5) obj);
                }
            });
        } catch (RuntimeException e10) {
            if (!this.f17480i) {
                throw e10;
            }
            YU.d("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e10);
        }
        int i14 = i13 + i11;
        this.f17475d = i14;
        if (i14 == this.f17476e) {
            this.f17475d = 0;
            this.f17476e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final void e(P10 p10, int i10, int i11) {
        if (this.f17478g == null) {
            this.f17472a.e(p10, i10, i11);
            return;
        }
        j(i10);
        p10.L(this.f17477f, this.f17476e, i10);
        this.f17476e += i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final void f(JY0 jy0) {
        String str = jy0.f19929o;
        str.getClass();
        AbstractC2418Ss0.a(A8.f(str) == 3);
        if (!jy0.equals(this.f17479h)) {
            this.f17479h = jy0;
            InterfaceC5576w5 interfaceC5576w5 = this.f17473b;
            this.f17478g = interfaceC5576w5.b(jy0) ? interfaceC5576w5.c(jy0) : null;
        }
        if (this.f17478g == null) {
            this.f17472a.f(jy0);
            return;
        }
        InterfaceC5570w2 interfaceC5570w2 = this.f17472a;
        C5507vX0 c5507vX0A = jy0.a();
        c5507vX0A.l0("application/x-media3-cues");
        c5507vX0A.i0(str);
        c5507vX0A.q0(Long.MAX_VALUE);
        c5507vX0A.k(this.f17473b.a(jy0));
        interfaceC5570w2.f(c5507vX0A.m());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5570w2
    public final int h(PQ0 pq0, int i10, boolean z9, int i11) throws EOFException {
        if (this.f17478g == null) {
            return this.f17472a.h(pq0, i10, z9, 0);
        }
        j(i10);
        int iF = pq0.F(this.f17477f, this.f17476e, i10);
        if (iF != -1) {
            this.f17476e += iF;
            return iF;
        }
        if (z9) {
            return -1;
        }
        throw new EOFException();
    }

    final /* synthetic */ void i(long j10, int i10, C4695p5 c4695p5) {
        this.f17479h.getClass();
        AbstractC5931yu0 abstractC5931yu0 = c4695p5.f32283a;
        long j11 = c4695p5.f32285c;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC5931yu0.size());
        Iterator<E> it = abstractC5931yu0.iterator();
        while (it.hasNext()) {
            arrayList.add(((KD) it.next()).b());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j11);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        P10 p10 = this.f17474c;
        int length = bArrMarshall.length;
        p10.A(bArrMarshall, length);
        InterfaceC5570w2 interfaceC5570w2 = this.f17472a;
        interfaceC5570w2.b(p10, length);
        long j12 = c4695p5.f32284b;
        if (j12 == -9223372036854775807L) {
            AbstractC2418Ss0.i(this.f17479h.f19934t == Long.MAX_VALUE);
        } else {
            long j13 = this.f17479h.f19934t;
            j10 = j13 == Long.MAX_VALUE ? j10 + j12 : j12 + j13;
        }
        interfaceC5570w2.c(j10, i10 | 1, length, 0, null);
    }
}
