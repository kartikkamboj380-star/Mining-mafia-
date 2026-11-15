package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2086Mi0 {
    static String b(File file, String str, AbstractC2294Qi0 abstractC2294Qi0) {
        return new File(file, str).getPath();
    }

    default String a(File file, String str) {
        return b(file, str, AbstractC2294Qi0.f22432a);
    }
}
