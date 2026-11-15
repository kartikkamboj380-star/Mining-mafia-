package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3194d9 implements T8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f27343a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f27344b;

    C3194d9(Context context) {
        this.f27344b = context;
    }

    @Override // com.google.android.gms.internal.ads.T8
    public final File zza() {
        if (this.f27343a == null) {
            this.f27343a = new File(this.f27344b.getCacheDir(), "volley");
        }
        return this.f27343a;
    }
}
