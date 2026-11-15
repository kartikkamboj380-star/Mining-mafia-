package com.facebook.imagepipeline.nativecode;

import I2.g;
import I2.h;
import O2.j;
import Y1.k;
import android.graphics.ColorSpace;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
@Y1.d
public class NativeJpegTranscoder implements W2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f13960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f13962c;

    public NativeJpegTranscoder(boolean z9, int i10, boolean z10, boolean z11) {
        this.f13960a = z9;
        this.f13961b = i10;
        this.f13962c = z10;
        if (z11) {
            f.a();
        }
    }

    public static void e(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) {
        f.a();
        k.b(Boolean.valueOf(i11 >= 1));
        k.b(Boolean.valueOf(i11 <= 16));
        k.b(Boolean.valueOf(i12 >= 0));
        k.b(Boolean.valueOf(i12 <= 100));
        k.b(Boolean.valueOf(W2.e.j(i10)));
        k.c((i11 == 8 && i10 == 0) ? false : true, "no transformation requested");
        nativeTranscodeJpeg((InputStream) k.g(inputStream), (OutputStream) k.g(outputStream), i10, i11, i12);
    }

    public static void f(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12) {
        f.a();
        k.b(Boolean.valueOf(i11 >= 1));
        k.b(Boolean.valueOf(i11 <= 16));
        k.b(Boolean.valueOf(i12 >= 0));
        k.b(Boolean.valueOf(i12 <= 100));
        k.b(Boolean.valueOf(W2.e.i(i10)));
        k.c((i11 == 8 && i10 == 1) ? false : true, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) k.g(inputStream), (OutputStream) k.g(outputStream), i10, i11, i12);
    }

    @Y1.d
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12);

    @Y1.d
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i10, int i11, int i12);

    @Override // W2.c
    public String a() {
        return "NativeJpegTranscoder";
    }

    @Override // W2.c
    public boolean b(j jVar, h hVar, g gVar) {
        if (hVar == null) {
            hVar = h.c();
        }
        return W2.e.f(hVar, gVar, jVar, this.f13960a) < 8;
    }

    @Override // W2.c
    public W2.b c(j jVar, OutputStream outputStream, h hVar, g gVar, D2.c cVar, Integer num, ColorSpace colorSpace) {
        if (num == null) {
            num = 85;
        }
        if (hVar == null) {
            hVar = h.c();
        }
        int iB = W2.a.b(hVar, gVar, jVar, this.f13961b);
        try {
            int iF = W2.e.f(hVar, gVar, jVar, this.f13960a);
            int iA = W2.e.a(iB);
            if (this.f13962c) {
                iF = iA;
            }
            InputStream inputStreamJ = jVar.J();
            if (W2.e.f6551b.contains(Integer.valueOf(jVar.n0()))) {
                f((InputStream) k.h(inputStreamJ, "Cannot transcode from null input stream!"), outputStream, W2.e.d(hVar, jVar), iF, num.intValue());
            } else {
                e((InputStream) k.h(inputStreamJ, "Cannot transcode from null input stream!"), outputStream, W2.e.e(hVar, jVar), iF, num.intValue());
            }
            Y1.b.b(inputStreamJ);
            return new W2.b(iB != 1 ? 0 : 1);
        } catch (Throwable th) {
            Y1.b.b(null);
            throw th;
        }
    }

    @Override // W2.c
    public boolean d(D2.c cVar) {
        return cVar == D2.b.f440b;
    }
}
