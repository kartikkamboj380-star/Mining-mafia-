package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class VB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f24211a = Logger.getLogger(VB0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f24212b = new AtomicBoolean(false);

    public static boolean a() {
        return f24212b.get();
    }

    static Boolean b() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f24211a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }
}
