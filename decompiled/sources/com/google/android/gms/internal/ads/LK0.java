package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class LK0 implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f20429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f20430b;

    /* synthetic */ LK0(byte[] bArr) {
    }

    final void a(char[] cArr) {
        this.f20429a = cArr;
        this.f20430b = null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f20429a[i10];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f20429a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return new String(this.f20429a, i10, i11 - i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f20430b == null) {
            this.f20430b = new String(this.f20429a);
        }
        return this.f20430b;
    }
}
