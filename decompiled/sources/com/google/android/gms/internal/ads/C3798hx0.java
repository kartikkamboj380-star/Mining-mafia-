package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3798hx0 extends AbstractC2368Rt0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4454nA0 f29152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f29153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29155h;

    public C3798hx0() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.PQ0
    public final int F(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f29155h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f29153f;
        String str = AbstractC4634ob0.f32117a;
        System.arraycopy(bArr2, this.f29154g, bArr, i10, iMin);
        this.f29154g += iMin;
        this.f29155h -= iMin;
        g(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final long a(C4454nA0 c4454nA0) throws C2817a9, C2066Ly0 {
        c(c4454nA0);
        this.f29152e = c4454nA0;
        Uri uriNormalizeScheme = c4454nA0.f31730a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC2418Ss0.f(JsonStorageKeyNames.DATA_KEY.equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = AbstractC4634ob0.f32117a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw C2817a9.a("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f29153f = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e10) {
                throw C2817a9.a("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e10);
            }
        } else {
            this.f29153f = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j10 = c4454nA0.f31734e;
        int length = this.f29153f.length;
        if (j10 > length) {
            this.f29153f = null;
            throw new C2066Ly0(2008);
        }
        int i10 = (int) j10;
        this.f29154g = i10;
        int i11 = length - i10;
        this.f29155h = i11;
        long j11 = c4454nA0.f31735f;
        if (j11 != -1) {
            this.f29155h = (int) Math.min(i11, j11);
        }
        f(c4454nA0);
        return j11 != -1 ? j11 : this.f29155h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final Uri zzc() {
        C4454nA0 c4454nA0 = this.f29152e;
        if (c4454nA0 != null) {
            return c4454nA0.f31730a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4176ky0
    public final void zzd() {
        if (this.f29153f != null) {
            this.f29153f = null;
            h();
        }
        this.f29152e = null;
    }
}
