package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ls0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2054Ls0 {
    static final CharSequence a(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static final StringBuilder b(StringBuilder sb, Iterable iterable, String str) {
        c(sb, iterable.iterator(), str);
        return sb;
    }

    public static final StringBuilder c(StringBuilder sb, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                sb.append(a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    sb.append(a(it.next()));
                }
            }
            return sb;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public static final String d(Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        c(sb, it, str);
        return sb.toString();
    }
}
