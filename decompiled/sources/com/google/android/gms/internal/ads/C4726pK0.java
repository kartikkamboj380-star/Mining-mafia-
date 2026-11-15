package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4726pK0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C4726pK0 f32362d = new C4726pK0("", "", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32365c;

    static {
        new C4726pK0("\n", "  ", true);
    }

    private C4726pK0(String str, String str2, boolean z9) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f32363a = str;
        this.f32364b = str2;
        this.f32365c = z9;
    }

    public final String a() {
        return this.f32363a;
    }

    public final String b() {
        return this.f32364b;
    }

    public final boolean c() {
        return this.f32365c;
    }
}
