package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5283tl0 implements InterfaceC6039zl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f33474a;

    public C5283tl0(byte[] bArr) {
        this.f33474a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6039zl0
    public final /* synthetic */ void a(Object obj, OutputStream outputStream) throws IOException {
        outputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6039zl0
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        try {
            return AbstractC2788Zv0.a(inputStream);
        } catch (IOException e10) {
            throw new C5409ul0("Cannot read bytes.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6039zl0
    public final /* synthetic */ Object zzc() {
        return this.f33474a;
    }
}
