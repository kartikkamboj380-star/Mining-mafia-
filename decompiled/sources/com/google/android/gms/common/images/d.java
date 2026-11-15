package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f17118a;

    public d(Uri uri) {
        this.f17118a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return Objects.equal(((d) obj).f17118a, this.f17118a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f17118a);
    }
}
