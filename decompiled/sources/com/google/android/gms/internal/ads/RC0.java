package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class RC0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final RC0 f22755b = new RC0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f22756a = new HashMap();

    public static RC0 a() {
        return f22755b;
    }

    public final synchronized void b(QC0 qc0, Class cls) {
        try {
            Map map = this.f22756a;
            QC0 qc1 = (QC0) map.get(cls);
            if (qc1 != null && !qc1.equals(qc0)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, qc0);
        } catch (Throwable th) {
            throw th;
        }
    }
}
