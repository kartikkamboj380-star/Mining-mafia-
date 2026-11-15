package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.AbstractC6151i;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17097a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f17098b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC6151i f17099c = AbstractC6151i.l();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC6151i f17100d = AbstractC6151i.l();

    f() {
    }

    final f a(String str) {
        this.f17097a = str;
        return this;
    }

    final f b(long j10) {
        this.f17098b = j10;
        return this;
    }

    final f c(List list) {
        Preconditions.checkNotNull(list);
        this.f17099c = AbstractC6151i.s(list);
        return this;
    }

    final f d(List list) {
        Preconditions.checkNotNull(list);
        this.f17100d = AbstractC6151i.s(list);
        return this;
    }

    final g e() {
        if (this.f17097a == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if (this.f17098b < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.f17099c.isEmpty() && this.f17100d.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new g(this.f17097a, this.f17098b, this.f17099c, this.f17100d, null);
    }
}
