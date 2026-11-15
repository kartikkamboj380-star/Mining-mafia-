package com.google.android.gms.internal.auth;

import android.os.Binder;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6121s {
    public static Object a(InterfaceC6124t interfaceC6124t) {
        try {
            return interfaceC6124t.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC6124t.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
