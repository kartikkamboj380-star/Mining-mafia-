package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5431uw0 extends AbstractC2368Rt0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ContentResolver f33947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f33948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f33949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FileInputStream f33950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f33951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f33952j;

    public C5431uw0(Context context) {
        super(false);
        this.f33947e = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.PQ0
    public final int F(byte[] bArr, int i10, int i11) throws C2476Tv0 {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f33951i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new C2476Tv0(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f33950h;
        String str = AbstractC4634ob0.f32117a;
        int i12 = fileInputStream.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f33951i;
        if (j11 != -1) {
            this.f33951i = j11 - ((long) i12);
        }
        g(i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final long a(C4454nA0 c4454nA0) throws C2476Tv0 {
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uriNormalizeScheme = c4454nA0.f31730a.normalizeScheme();
                this.f33948f = uriNormalizeScheme;
                c(c4454nA0);
                if (Objects.equals(uriNormalizeScheme.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.f33947e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.f33947e.openAssetFileDescriptor(uriNormalizeScheme, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                }
                this.f33949g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    String strValueOf = String.valueOf(uriNormalizeScheme);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
                    sb.append("Could not open file descriptor for: ");
                    sb.append(strValueOf);
                    IOException iOException = new IOException(sb.toString());
                    i10 = 2000;
                    try {
                        throw new C2476Tv0(iOException, 2000);
                    } catch (IOException e10) {
                        e = e10;
                        throw new C2476Tv0(e, true != (e instanceof FileNotFoundException) ? i10 : 2005);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f33950h = fileInputStream;
                if (length != -1 && c4454nA0.f31734e > length) {
                    throw new C2476Tv0(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long j10 = c4454nA0.f31734e;
                long jSkip = fileInputStream.skip(startOffset + j10) - startOffset;
                if (jSkip != j10) {
                    throw new C2476Tv0(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f33951i = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.f33951i = jPosition;
                        if (jPosition < 0) {
                            throw new C2476Tv0(null, 2008);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.f33951i = jPosition;
                    if (jPosition < 0) {
                        throw new C2476Tv0(null, 2008);
                    }
                }
                long j11 = c4454nA0.f31735f;
                if (j11 != -1) {
                    this.f33951i = jPosition == -1 ? j11 : Math.min(jPosition, j11);
                }
                this.f33952j = true;
                f(c4454nA0);
                return j11 != -1 ? j11 : this.f33951i;
            } catch (C2476Tv0 e11) {
                throw e11;
            }
        } catch (IOException e12) {
            e = e12;
            i10 = 2000;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final Uri zzc() {
        return this.f33948f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void zzd() {
        this.f33948f = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.f33950h;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.f33950h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f33949g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f33949g = null;
                        if (this.f33952j) {
                            this.f33952j = false;
                            h();
                        }
                    } catch (IOException e10) {
                        throw new C2476Tv0(e10, 2000);
                    }
                } catch (IOException e11) {
                    throw new C2476Tv0(e11, 2000);
                }
            } catch (Throwable th) {
                this.f33950h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f33949g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f33949g = null;
                    if (this.f33952j) {
                        this.f33952j = false;
                        h();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new C2476Tv0(e12, 2000);
                }
            }
        } catch (Throwable th2) {
            this.f33949g = null;
            if (this.f33952j) {
                this.f33952j = false;
                h();
            }
            throw th2;
        }
    }
}
