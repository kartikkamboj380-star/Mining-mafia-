package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2335Rd {
    public static String a(Context context, String str, List list, Executor executor) throws PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        final C2376Rx0 c2376Rx0B = C2376Rx0.B();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.Qd
            public final /* synthetic */ void onChecksumsReady(List list2) {
                C2376Rx0 c2376Rx0 = c2376Rx0B;
                if (list2 == null) {
                    c2376Rx0.k(null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ApkChecksum apkChecksumA = AbstractC1864Ib.a(list2.get(i10));
                        if (apkChecksumA.getType() == 8) {
                            c2376Rx0.k(AbstractC2877ad.a(apkChecksumA.getValue()));
                            return;
                        }
                    }
                    c2376Rx0.k(null);
                } catch (Throwable unused) {
                    c2376Rx0.k(null);
                }
            }
        });
        return (String) c2376Rx0B.get();
    }
}
