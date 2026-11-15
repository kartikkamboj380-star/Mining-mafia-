package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EJ0 extends AbstractC2368Rt0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f18452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4454nA0 f18453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f18454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InputStream f18455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f18456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f18457j;

    public EJ0(Context context) {
        super(false);
        this.f18452e = context.getApplicationContext();
    }

    private static AssetFileDescriptor i(Context context, C4454nA0 c4454nA0) throws C3215dJ0 {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = c4454nA0.f31730a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 61);
                sb.append("rawresource:// URI must have exactly one path element, found ");
                sb.append(size);
                throw new C3215dJ0(sb.toString());
            }
            identifier = j(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                String scheme = uriNormalizeScheme.getScheme();
                StringBuilder sb2 = new StringBuilder(String.valueOf(scheme).length() + 62);
                sb2.append("Unsupported URI scheme (");
                sb2.append(scheme);
                sb2.append("). Only android.resource is supported.");
                throw new C3215dJ0(sb2.toString(), null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new C3215dJ0("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = j(path);
            } else {
                StringBuilder sb3 = new StringBuilder(packageName.length() + 1 + path.length());
                sb3.append(packageName);
                sb3.append(":");
                sb3.append(path);
                identifier = resourcesForApplication.getIdentifier(sb3.toString(), "raw", null);
                if (identifier == 0) {
                    throw new C3215dJ0("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new C3215dJ0("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new C3215dJ0(null, e11, 2005);
        }
    }

    private static int j(String str) throws C3215dJ0 {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new C3215dJ0("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // com.google.android.gms.internal.ads.PQ0
    public final int F(byte[] bArr, int i10, int i11) throws C3215dJ0 {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f18456i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new C3215dJ0(null, e10, 2000);
            }
        }
        InputStream inputStream = this.f18455h;
        String str = AbstractC4634ob0.f32117a;
        int i12 = inputStream.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f18456i == -1) {
                return -1;
            }
            throw new C3215dJ0("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f18456i;
        if (j11 != -1) {
            this.f18456i = j11 - ((long) i12);
        }
        g(i12);
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final long a(C4454nA0 c4454nA0) throws C3215dJ0 {
        long size;
        this.f18453f = c4454nA0;
        c(c4454nA0);
        AssetFileDescriptor assetFileDescriptorI = i(this.f18452e, c4454nA0);
        this.f18454g = assetFileDescriptorI;
        long length = assetFileDescriptorI.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f18454g.getFileDescriptor());
        this.f18455h = fileInputStream;
        if (length != -1) {
            try {
                if (c4454nA0.f31734e > length) {
                    throw new C3215dJ0(null, null, 2008);
                }
            } catch (C3215dJ0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new C3215dJ0(null, e11, 2000);
            }
        }
        long startOffset = this.f18454g.getStartOffset();
        long j10 = c4454nA0.f31734e;
        long jSkip = fileInputStream.skip(startOffset + j10) - startOffset;
        if (jSkip != j10) {
            throw new C3215dJ0(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f18456i = -1L;
                size = -1;
            } else {
                size = channel.size() - channel.position();
                this.f18456i = size;
                if (size < 0) {
                    throw new C3215dJ0(null, null, 2008);
                }
            }
        } else {
            size = length - jSkip;
            this.f18456i = size;
            if (size < 0) {
                throw new C2066Ly0(2008);
            }
        }
        long j11 = c4454nA0.f31735f;
        if (j11 != -1) {
            this.f18456i = size == -1 ? j11 : Math.min(size, j11);
        }
        this.f18457j = true;
        f(c4454nA0);
        return j11 != -1 ? j11 : this.f18456i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final Uri zzc() {
        C4454nA0 c4454nA0 = this.f18453f;
        if (c4454nA0 != null) {
            return c4454nA0.f31730a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void zzd() {
        this.f18453f = null;
        try {
            try {
                try {
                    InputStream inputStream = this.f18455h;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.f18455h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f18454g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f18454g = null;
                        if (this.f18457j) {
                            this.f18457j = false;
                            h();
                        }
                    } catch (IOException e10) {
                        throw new C3215dJ0(null, e10, 2000);
                    }
                } catch (IOException e11) {
                    throw new C3215dJ0(null, e11, 2000);
                }
            } catch (Throwable th) {
                this.f18455h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f18454g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f18454g = null;
                    if (this.f18457j) {
                        this.f18457j = false;
                        h();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new C3215dJ0(null, e12, 2000);
                }
            }
        } catch (Throwable th2) {
            this.f18454g = null;
            if (this.f18457j) {
                this.f18457j = false;
                h();
            }
            throw th2;
        }
    }
}
