package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2436Tb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f23569a;

    public C2436Tb0() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) H4.B.c().d(AbstractC3892ii.f29627M7));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f23569a = patternCompile;
    }

    public final String a(String str) {
        Pattern pattern = this.f23569a;
        if (pattern == null || str == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}
