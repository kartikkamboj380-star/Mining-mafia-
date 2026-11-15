package com.google.gson;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f40740d = new d("", "", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f40741e = new d("\n", "  ", true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f40744c;

    private d(String str, String str2, boolean z9) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f40742a = str;
        this.f40743b = str2;
        this.f40744c = z9;
    }

    public String a() {
        return this.f40743b;
    }

    public String b() {
        return this.f40742a;
    }

    public boolean c() {
        return this.f40744c;
    }
}
