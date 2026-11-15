package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
abstract class p extends zzw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17166a;

    protected p(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 25);
        this.f17166a = Arrays.hashCode(bArr);
    }

    protected static byte[] h0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    abstract byte[] J();

    public final boolean equals(Object obj) {
        com.google.android.gms.dynamic.a aVarZzd;
        if (!(obj instanceof zzx)) {
            return false;
        }
        try {
            zzx zzxVar = (zzx) obj;
            if (zzxVar.zze() == this.f17166a && (aVarZzd = zzxVar.zzd()) != null) {
                return Arrays.equals(J(), (byte[]) com.google.android.gms.dynamic.b.h0(aVarZzd));
            }
            return false;
        } catch (RemoteException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return false;
        }
    }

    public final int hashCode() {
        return this.f17166a;
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final com.google.android.gms.dynamic.a zzd() {
        return com.google.android.gms.dynamic.b.N0(J());
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final int zze() {
        return this.f17166a;
    }
}
