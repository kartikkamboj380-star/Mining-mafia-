package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3544fw0 extends AbstractC2632Wv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f28511a;

    @Override // com.google.android.gms.internal.ads.AbstractC2632Wv0
    public final /* bridge */ /* synthetic */ InputStream a() {
        return new FileInputStream(this.f28511a);
    }

    public final String toString() {
        String string = this.f28511a.toString();
        StringBuilder sb = new StringBuilder(string.length() + 20);
        sb.append("Files.asByteSource(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
