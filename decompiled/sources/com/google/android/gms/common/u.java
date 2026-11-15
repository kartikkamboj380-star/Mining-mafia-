package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
abstract class u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static volatile zzad f17182g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Context f17184i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final s f17176a = new j(p.h0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final s f17177b = new k(p.h0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final s f17178c = new l(p.h0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final s f17179d = new m(p.h0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final s f17180e = new n(p.h0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final s f17181f = new o(p.h0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f17183h = new Object();

    static synchronized void a(Context context) {
        if (f17184i != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f17184i = context.getApplicationContext();
        }
    }

    static void b() {
        if (f17182g != null) {
            return;
        }
        Preconditions.checkNotNull(f17184i);
        synchronized (f17183h) {
            try {
                if (f17182g == null) {
                    f17182g = zzac.zzb(DynamiteModule.e(f17184i, DynamiteModule.f17199f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static zzy c(w wVar) {
        zzy zzyVarZzd;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(f17184i);
            try {
                b();
                Preconditions.checkNotNull(f17184i);
                zzp zzpVarB = wVar.b(f17184i);
                try {
                    zzr zzrVarZzf = wVar.a() ? f17182g.zzf(zzpVarB) : f17182g.zzh(zzpVarB);
                    if (zzrVarZzf.zza()) {
                        zzyVarZzd = zzy.zzf(zzrVarZzf.zze(), zzrVarZzf.zzc());
                    } else {
                        String strZzb = zzrVarZzf.zzb();
                        PackageManager.NameNotFoundException nameNotFoundException = zzrVarZzf.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZzb == null) {
                            strZzb = "error checking package certificate";
                        }
                        zzyVarZzd = zzy.zzg(zzrVarZzf.zze(), zzrVarZzf.zzd(), strZzb, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    zzyVarZzd = zzy.zzd("module call", e10);
                }
            } catch (DynamiteModule.a e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                zzyVarZzd = zzy.zzd("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return zzyVarZzd;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    static zzy d(String str, p pVar, boolean z9, boolean z10) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, pVar, z9, z10);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static /* synthetic */ String e(boolean z9, String str, p pVar) {
        String str2 = (z9 || !f(str, pVar, true, false).zza) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestZza = AndroidUtilsLight.zza("SHA-256");
        Preconditions.checkNotNull(messageDigestZza);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, Hex.bytesToStringLowercase(messageDigestZza.digest(pVar.J())), Boolean.valueOf(z9), "12451000.false");
    }

    private static zzy f(final String str, final p pVar, final boolean z9, boolean z10) {
        try {
            b();
            Preconditions.checkNotNull(f17184i);
            try {
                return f17182g.zze(new zzt(str, pVar, z9, z10), com.google.android.gms.dynamic.b.N0(f17184i.getPackageManager())) ? zzy.zzb() : new x(new Callable() { // from class: com.google.android.gms.common.r
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return u.e(z9, str, pVar);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return zzy.zzd("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return zzy.zzd("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }
}
