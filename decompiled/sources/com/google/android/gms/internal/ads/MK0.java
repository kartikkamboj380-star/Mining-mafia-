package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class MK0 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Appendable f20800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LK0 f20801b = new LK0(null);

    MK0(Appendable appendable) {
        this.f20800a = appendable;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        this.f20800a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(int i10) throws IOException {
        this.f20800a.append((char) i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i10, int i11) throws IOException {
        Objects.requireNonNull(str);
        this.f20800a.append(str, i10, i11 + i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
        this.f20800a.append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
        append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) throws IOException {
        LK0 lk0 = this.f20801b;
        lk0.a(cArr);
        this.f20800a.append(lk0, i10, i11 + i10);
    }
}
