package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class W8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f24714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f24716d;

    public W8(int i10, List list, int i11, InputStream inputStream) {
        this.f24713a = i10;
        this.f24714b = list;
        this.f24715c = i11;
        this.f24716d = inputStream;
    }

    public final int a() {
        return this.f24713a;
    }

    public final List b() {
        return Collections.unmodifiableList(this.f24714b);
    }

    public final int c() {
        return this.f24715c;
    }

    public final InputStream d() {
        InputStream inputStream = this.f24716d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }
}
