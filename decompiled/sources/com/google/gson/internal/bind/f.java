package com.google.gson.internal.bind;

import com.google.gson.s;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import p108k7.z;

/* JADX INFO: loaded from: classes3.dex */
class f extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final f f40802a = new f();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40803a;

        static {
            int[] iArr = new int[p138n7.b.values().length];
            f40803a = iArr;
            try {
                iArr[p138n7.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40803a[p138n7.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40803a[p138n7.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40803a[p138n7.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40803a[p138n7.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40803a[p138n7.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private f() {
    }

    private com.google.gson.g f(p138n7.a aVar, p138n7.b bVar) throws IOException {
        int i10 = a.f40803a[bVar.ordinal()];
        if (i10 == 3) {
            return new com.google.gson.l(aVar.l1());
        }
        if (i10 == 4) {
            return new com.google.gson.l(new z(aVar.l1()));
        }
        if (i10 == 5) {
            return new com.google.gson.l(Boolean.valueOf(aVar.V()));
        }
        if (i10 == 6) {
            aVar.V0();
            return com.google.gson.i.f40782a;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private com.google.gson.g g(p138n7.a aVar, p138n7.b bVar) throws IOException {
        int i10 = a.f40803a[bVar.ordinal()];
        if (i10 == 1) {
            aVar.c();
            return new com.google.gson.f();
        }
        if (i10 != 2) {
            return null;
        }
        aVar.h();
        return new com.google.gson.j();
    }

    @Override // com.google.gson.s
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.google.gson.g b(p138n7.a aVar) throws IOException {
        p138n7.b bVarN1 = aVar.n1();
        com.google.gson.g gVarG = g(aVar, bVarN1);
        if (gVarG == null) {
            return f(aVar, bVarN1);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.Q()) {
                String strI0 = gVarG instanceof com.google.gson.j ? aVar.I0() : null;
                p138n7.b bVarN2 = aVar.n1();
                com.google.gson.g gVarG2 = g(aVar, bVarN2);
                boolean z9 = gVarG2 != null;
                if (gVarG2 == null) {
                    gVarG2 = f(aVar, bVarN2);
                }
                if (gVarG instanceof com.google.gson.f) {
                    ((com.google.gson.f) gVarG).k(gVarG2);
                } else {
                    ((com.google.gson.j) gVarG).k(strI0, gVarG2);
                }
                if (z9) {
                    arrayDeque.addLast(gVarG);
                    gVarG = gVarG2;
                }
            } else {
                if (gVarG instanceof com.google.gson.f) {
                    aVar.w();
                } else {
                    aVar.x();
                }
                if (arrayDeque.isEmpty()) {
                    return gVarG;
                }
                gVarG = (com.google.gson.g) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.s
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(p138n7.c cVar, com.google.gson.g gVar) throws IOException {
        if (gVar == null || gVar.g()) {
            cVar.S();
            return;
        }
        if (gVar.j()) {
            com.google.gson.l lVarD = gVar.d();
            if (lVarD.t()) {
                cVar.o1(lVarD.p());
                return;
            } else if (lVarD.r()) {
                cVar.q1(lVarD.m());
                return;
            } else {
                cVar.p1(lVarD.q());
                return;
            }
        }
        if (gVar.e()) {
            cVar.j();
            Iterator it = gVar.a().iterator();
            while (it.hasNext()) {
                d(cVar, (com.google.gson.g) it.next());
            }
            cVar.w();
            return;
        }
        if (!gVar.i()) {
            throw new IllegalArgumentException("Couldn't write " + gVar.getClass());
        }
        cVar.n();
        for (Map.Entry entry : gVar.b().l()) {
            cVar.Q((String) entry.getKey());
            d(cVar, (com.google.gson.g) entry.getValue());
        }
        cVar.x();
    }
}
