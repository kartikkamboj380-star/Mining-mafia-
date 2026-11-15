package com.facebook.imagepipeline.producers;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1266u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1266u f14267a = new C1266u();

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.u$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    private C1266u() {
    }

    public static final H2.j a(U2.b imageRequest, H2.j jVar, H2.j jVar2, Map map) {
        String strF;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        if (imageRequest.c() == U2.b.EnumC0089b.SMALL) {
            return jVar;
        }
        if (imageRequest.c() == U2.b.EnumC0089b.DEFAULT) {
            return jVar2;
        }
        if (imageRequest.c() != U2.b.EnumC0089b.DYNAMIC || map == null || (strF = imageRequest.f()) == null) {
            return null;
        }
        return (H2.j) map.get(strF);
    }
}
