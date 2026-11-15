package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ew0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3418ew0 {
    public static final FileOutputStream a(File file, AbstractC1903Iu0 abstractC1903Iu0, C2580Vv0 c2580Vv0) {
        return new FileOutputStream(file, abstractC1903Iu0.contains(EnumC3292dw0.APPEND));
    }
}
