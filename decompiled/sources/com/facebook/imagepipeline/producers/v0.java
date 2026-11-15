package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f14277a = new v0();

    private v0() {
    }

    public static final int a(int i10) {
        return (int) (i10 * 1.3333334f);
    }

    public static final boolean b(int i10, int i11, I2.g gVar) {
        if (gVar == null) {
            return ((float) a(i10)) >= 2048.0f && a(i11) >= 2048;
        }
        return a(i10) >= gVar.f1616a && a(i11) >= gVar.f1617b;
    }

    public static final boolean c(O2.j jVar, I2.g gVar) {
        if (jVar == null) {
            return false;
        }
        int iY0 = jVar.y0();
        return (iY0 == 90 || iY0 == 270) ? b(jVar.getHeight(), jVar.getWidth(), gVar) : b(jVar.getWidth(), jVar.getHeight(), gVar);
    }
}
