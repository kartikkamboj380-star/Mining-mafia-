package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class E implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ CharSequence f36200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ H f36201b;

    E(H h10, CharSequence charSequence) {
        this.f36200a = charSequence;
        Objects.requireNonNull(h10);
        this.f36201b = h10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f36201b.e(this.f36200a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(B.a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append((CharSequence) ", ");
                    sb.append(B.a(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
