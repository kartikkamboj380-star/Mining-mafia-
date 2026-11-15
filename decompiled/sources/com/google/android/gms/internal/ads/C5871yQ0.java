package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5871yQ0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C5871yQ0 f35349b = new C2852aQ0().g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f35350a;

    public final Set a() {
        return this.f35350a.keySet();
    }

    public final void b(MediaFormat mediaFormat) {
        for (Map.Entry entry : this.f35350a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(str, null);
            } else if (value instanceof Integer) {
                mediaFormat.setInteger(str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                mediaFormat.setLong(str, ((Long) value).longValue());
            } else if (value instanceof Float) {
                mediaFormat.setFloat(str, ((Float) value).floatValue());
            } else if (value instanceof String) {
                mediaFormat.setString(str, (String) value);
            } else if (value instanceof ByteBuffer) {
                mediaFormat.setByteBuffer(str, (ByteBuffer) value);
            }
        }
    }

    final /* synthetic */ Map c() {
        return this.f35350a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5871yQ0) {
            return this.f35350a.equals(((C5871yQ0) obj).f35350a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35350a.hashCode();
    }
}
