package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2817a9 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26435b;

    protected C2817a9(String str, Throwable th, boolean z9, int i10) {
        super(str, th);
        this.f26434a = z9;
        this.f26435b = i10;
    }

    public static C2817a9 a(String str, Throwable th) {
        return new C2817a9(str, th, true, 0);
    }

    public static C2817a9 b(String str, Throwable th) {
        return new C2817a9(str, th, true, 1);
    }

    public static C2817a9 c(String str) {
        return new C2817a9(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        boolean z9 = this.f26434a;
        int i10 = this.f26435b;
        StringBuilder sb = new StringBuilder(strConcat.length() + 20 + String.valueOf(z9).length() + 11 + String.valueOf(i10).length() + 1);
        sb.append(strConcat);
        sb.append("{contentIsMalformed=");
        sb.append(z9);
        sb.append(", dataType=");
        sb.append(i10);
        sb.append("}");
        return sb.toString();
    }
}
