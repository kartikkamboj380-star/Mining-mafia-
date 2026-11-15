package p208u7;

import android.text.TextUtils;
import p148o7.a;
import p158p7.f;
import p158p7.h;
import p158p7.j;
import p158p7.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static void a() {
        if (!a.c()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(String str, int i10, String str2) {
        if (str.length() > i10) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void e(j jVar, f fVar, h hVar) {
        if (jVar == j.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (fVar == f.DEFINED_BY_JAVASCRIPT && jVar == j.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (hVar == h.DEFINED_BY_JAVASCRIPT && jVar == j.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public static void f(l lVar) {
        h(lVar);
        g(lVar);
    }

    public static void g(l lVar) {
        if (lVar.n()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    private static void h(l lVar) {
        if (!lVar.r()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    public static void i(l lVar) {
        if (!lVar.q()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void j(l lVar) {
        if (lVar.p().n() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }
}
