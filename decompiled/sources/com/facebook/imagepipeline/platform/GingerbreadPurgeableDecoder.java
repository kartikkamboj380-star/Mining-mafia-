package com.facebook.imagepipeline.platform;

import Y1.d;
import Y1.k;
import Y1.p;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import p013b2.h;
import p013b2.j;
import p023c2.a;
import p073h2.b;

/* JADX INFO: loaded from: classes.dex */
@d
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f13969c;

    @d
    public GingerbreadPurgeableDecoder() {
        b.i();
    }

    private static MemoryFile h(a aVar, int i10, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        p043e2.a aVar2;
        j jVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i10);
        memoryFile.allowPurging(false);
        try {
            j jVar2 = new j((h) aVar.G());
            try {
                aVar2 = new p043e2.a(jVar2, i10);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    Y1.a.a(aVar2, outputStream2);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i10, bArr.length);
                    }
                    a.x(aVar);
                    Y1.b.b(jVar2);
                    Y1.b.b(aVar2);
                    Y1.b.a(outputStream2, true);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    jVar = jVar2;
                    a.x(aVar);
                    Y1.b.b(jVar);
                    Y1.b.b(aVar2);
                    Y1.b.a(outputStream, true);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                aVar2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            aVar2 = null;
        }
    }

    private Bitmap i(a aVar, int i10, byte[] bArr, BitmapFactory.Options options) {
        MemoryFile memoryFileH = null;
        try {
            try {
                memoryFileH = h(aVar, i10, bArr);
                k(memoryFileH);
                throw new IllegalStateException("WebpBitmapFactory is null");
            } catch (IOException e10) {
                throw p.a(e10);
            }
        } catch (Throwable th) {
            if (memoryFileH != null) {
                memoryFileH.close();
            }
            throw th;
        }
    }

    private synchronized Method j() {
        if (f13969c == null) {
            try {
                f13969c = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
            } catch (Exception e10) {
                throw p.a(e10);
            }
        }
        return f13969c;
    }

    private FileDescriptor k(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) k.g(j().invoke(memoryFile, null));
        } catch (Exception e10) {
            throw p.a(e10);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(a aVar, BitmapFactory.Options options) {
        return i(aVar, ((h) aVar.G()).size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(a aVar, int i10, BitmapFactory.Options options) {
        return i(aVar, i10, DalvikPurgeableDecoder.e(aVar, i10) ? null : DalvikPurgeableDecoder.f13958b, options);
    }
}
