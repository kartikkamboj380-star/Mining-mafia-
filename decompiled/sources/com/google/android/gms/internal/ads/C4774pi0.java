package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4774pi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3507fe f32456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f32457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f32458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f32459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f32460e;

    public C4774pi0(C3507fe c3507fe, File file, File file2, File file3) {
        this.f32456a = c3507fe;
        this.f32457b = file;
        this.f32458c = file3;
        this.f32459d = file2;
    }

    public final C3507fe a() {
        return this.f32456a;
    }

    public final File b() {
        return this.f32457b;
    }

    public final File c() {
        return this.f32458c;
    }

    public final byte[] d() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrD;
        FileInputStream fileInputStream2 = null;
        if (this.f32460e == null) {
            try {
                fileInputStream = new FileInputStream(this.f32459d);
                try {
                    AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
                    ArrayList arrayList = new ArrayList();
                    int iMin = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    while (true) {
                        byte[] bArr = new byte[iMin];
                        int i10 = 0;
                        while (i10 < iMin) {
                            int i11 = fileInputStream.read(bArr, i10, iMin - i10);
                            if (i11 == -1) {
                                break;
                            }
                            i10 += i11;
                        }
                        AbstractC5231tL0 abstractC5231tL0W = i10 == 0 ? null : AbstractC5231tL0.w(bArr, 0, i10);
                        if (abstractC5231tL0W == null) {
                            break;
                        }
                        arrayList.add(abstractC5231tL0W);
                        iMin = Math.min(iMin + iMin, 8192);
                    }
                    bArrD = AbstractC5231tL0.B(arrayList).D();
                    IOUtils.closeQuietly(fileInputStream);
                } catch (IOException unused) {
                    IOUtils.closeQuietly(fileInputStream);
                    bArrD = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    IOUtils.closeQuietly(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.f32460e = bArrD;
        }
        byte[] bArr2 = this.f32460e;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    public final boolean e(long j10) {
        return this.f32456a.f0() - (System.currentTimeMillis() / 1000) < 3600;
    }
}
