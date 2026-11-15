package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
final class XJ0 extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ YJ0 f25182a;

    XJ0(YJ0 yj0) {
        Objects.requireNonNull(yj0);
        this.f25182a = yj0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            JJ0 jj0 = JJ0.f19826c;
            YJ0 yj0 = this.f25182a;
            Mac mac = (Mac) jj0.b(yj0.b());
            mac.init(yj0.c());
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
