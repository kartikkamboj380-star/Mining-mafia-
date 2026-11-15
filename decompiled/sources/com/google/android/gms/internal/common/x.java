package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
final class x extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f36233a;

    x(char c10) {
        this.f36233a = c10;
    }

    @Override // com.google.android.gms.internal.common.A
    public final boolean a(char c10) {
        return c10 == this.f36233a;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i10 = this.f36233a;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(strCopyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(strCopyValueOf);
        sb.append("')");
        return sb.toString();
    }
}
