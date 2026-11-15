package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public final class WE0 extends AbstractC2368Rt0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RandomAccessFile f24736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f24737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f24738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24739h;

    public WE0() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.PQ0
    public final int F(byte[] bArr, int i10, int i11) throws C5469vE0 {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f24738g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f24736e;
            String str = AbstractC4634ob0.f32117a;
            int i12 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i12 > 0) {
                this.f24738g -= (long) i12;
                g(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new C5469vE0(e10, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final long a(C4454nA0 c4454nA0) throws C5469vE0 {
        Uri uri = c4454nA0.f31730a;
        this.f24737f = uri;
        c(c4454nA0);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            this.f24736e = randomAccessFile;
            try {
                long j10 = c4454nA0.f31734e;
                randomAccessFile.seek(j10);
                long length = c4454nA0.f31735f;
                if (length == -1) {
                    length = this.f24736e.length() - j10;
                }
                this.f24738g = length;
                if (length < 0) {
                    throw new C5469vE0(null, null, 2008);
                }
                this.f24739h = true;
                f(c4454nA0);
                return this.f24738g;
            } catch (IOException e10) {
                throw new C5469vE0(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C5469vE0(e11, ((e11.getCause() instanceof ErrnoException) && ((ErrnoException) e11.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new C5469vE0(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11, 1004);
        } catch (SecurityException e12) {
            throw new C5469vE0(e12, 2006);
        } catch (RuntimeException e13) {
            throw new C5469vE0(e13, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final Uri zzc() {
        return this.f24737f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void zzd() {
        this.f24737f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f24736e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f24736e = null;
                if (this.f24739h) {
                    this.f24739h = false;
                    h();
                }
            } catch (IOException e10) {
                throw new C5469vE0(e10, 2000);
            }
        } catch (Throwable th) {
            this.f24736e = null;
            if (this.f24739h) {
                this.f24739h = false;
                h();
            }
            throw th;
        }
    }
}
