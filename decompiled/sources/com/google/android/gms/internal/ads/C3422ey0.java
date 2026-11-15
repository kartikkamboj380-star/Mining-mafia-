package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ey0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3422ey0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f28109a;

    private C3422ey0(OutputStream outputStream) {
        this.f28109a = outputStream;
    }

    public static C3422ey0 b(OutputStream outputStream) {
        return new C3422ey0(outputStream);
    }

    public final void a(C4088kG0 c4088kG0) throws IOException {
        try {
            c4088kG0.c(this.f28109a);
        } finally {
            this.f28109a.close();
        }
    }
}
