package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ks0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2003Ks0 extends AbstractC1847Hs0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f20290a;

    C2003Ks0(Pattern pattern) {
        pattern.getClass();
        this.f20290a = pattern;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1847Hs0
    public final AbstractC1795Gs0 a(CharSequence charSequence) {
        return new C1951Js0(this.f20290a.matcher(charSequence));
    }

    public final String toString() {
        return this.f20290a.toString();
    }
}
