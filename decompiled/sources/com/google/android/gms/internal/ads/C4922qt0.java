package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4922qt0 extends AbstractC2368Rt0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AssetManager f32742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f32743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InputStream f32744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f32745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f32746i;

    public C4922qt0(Context context) {
        super(false);
        this.f32742e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.PQ0
    public final int F(byte[] bArr, int i10, int i11) throws C2262Ps0 {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f32745h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new C2262Ps0(e10, 2000);
            }
        }
        InputStream inputStream = this.f32744g;
        String str = AbstractC4634ob0.f32117a;
        int i12 = inputStream.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f32745h;
        if (j11 != -1) {
            this.f32745h = j11 - ((long) i12);
        }
        g(i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final long a(C4454nA0 c4454nA0) throws C2262Ps0 {
        try {
            Uri uri = c4454nA0.f31730a;
            this.f32743f = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            c(c4454nA0);
            InputStream inputStreamOpen = this.f32742e.open(path, 1);
            this.f32744g = inputStreamOpen;
            long j10 = c4454nA0.f31734e;
            if (inputStreamOpen.skip(j10) < j10) {
                throw new C2262Ps0(null, 2008);
            }
            long j11 = c4454nA0.f31735f;
            if (j11 != -1) {
                this.f32745h = j11;
            } else {
                long jAvailable = this.f32744g.available();
                this.f32745h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f32745h = -1L;
                }
            }
            this.f32746i = true;
            f(c4454nA0);
            return this.f32745h;
        } catch (C2262Ps0 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new C2262Ps0(e11, true != (e11 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final Uri zzc() {
        return this.f32743f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void zzd() {
        this.f32743f = null;
        try {
            try {
                InputStream inputStream = this.f32744g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f32744g = null;
                if (this.f32746i) {
                    this.f32746i = false;
                    h();
                }
            } catch (IOException e10) {
                throw new C2262Ps0(e10, 2000);
            }
        } catch (Throwable th) {
            this.f32744g = null;
            if (this.f32746i) {
                this.f32746i = false;
                h();
            }
            throw th;
        }
    }
}
