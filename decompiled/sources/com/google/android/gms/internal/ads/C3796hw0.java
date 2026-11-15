package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3796hw0 implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f29149a;

    public C3796hw0(Pattern pattern) {
        pattern.getClass();
        this.f29149a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f29149a.matcher(str).matches();
    }
}
