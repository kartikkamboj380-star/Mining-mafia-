package p108k7;

import com.google.gson.e;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p070h.w;
import p098j7.d;
import p138n7.c;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements t, Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u f45659g = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f45660a = -1.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45661b = 136;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f45662c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f45663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f45664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f45665f;

    class a extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile s f45666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f45667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f45668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f45669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TypeToken f45670e;

        a(boolean z9, boolean z10, e eVar, TypeToken typeToken) {
            this.f45667b = z9;
            this.f45668c = z10;
            this.f45669d = eVar;
            this.f45670e = typeToken;
        }

        private s e() {
            s sVar = this.f45666a;
            if (sVar != null) {
                return sVar;
            }
            s sVarN = this.f45669d.n(u.this, this.f45670e);
            this.f45666a = sVarN;
            return sVarN;
        }

        @Override // com.google.gson.s
        public Object b(p138n7.a aVar) throws IOException {
            if (!this.f45667b) {
                return e().b(aVar);
            }
            aVar.x1();
            return null;
        }

        @Override // com.google.gson.s
        public void d(c cVar, Object obj) throws IOException {
            if (this.f45668c) {
                cVar.S();
            } else {
                e().d(cVar, obj);
            }
        }
    }

    public u() {
        List list = Collections.EMPTY_LIST;
        this.f45664e = list;
        this.f45665f = list;
    }

    private static boolean f(Class cls) {
        return cls.isMemberClass() && !p128m7.a.n(cls);
    }

    private boolean g(d dVar) {
        if (dVar != null) {
            return this.f45660a >= dVar.value();
        }
        return true;
    }

    private boolean h(p098j7.e eVar) {
        if (eVar != null) {
            return this.f45660a < eVar.value();
        }
        return true;
    }

    private boolean i(d dVar, p098j7.e eVar) {
        return g(dVar) && h(eVar);
    }

    @Override // com.google.gson.t
    public s b(e eVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        boolean zD = d(rawType, true);
        boolean zD2 = d(rawType, false);
        if (zD || zD2) {
            return new a(zD2, zD, eVar, typeToken);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public u clone() {
        try {
            return (u) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean d(Class cls, boolean z9) {
        if (this.f45660a != -1.0d && !i((d) cls.getAnnotation(d.class), (p098j7.e) cls.getAnnotation(p098j7.e.class))) {
            return true;
        }
        if (!this.f45662c && f(cls)) {
            return true;
        }
        if (!z9 && !Enum.class.isAssignableFrom(cls) && p128m7.a.l(cls)) {
            return true;
        }
        Iterator it = (z9 ? this.f45664e : this.f45665f).iterator();
        if (!it.hasNext()) {
            return false;
        }
        w.a(it.next());
        throw null;
    }

    public boolean e(Field field, boolean z9) {
        p098j7.a aVar;
        if ((this.f45661b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f45660a != -1.0d && !i((d) field.getAnnotation(d.class), (p098j7.e) field.getAnnotation(p098j7.e.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f45663d && ((aVar = (p098j7.a) field.getAnnotation(p098j7.a.class)) == null || (!z9 ? aVar.deserialize() : aVar.serialize()))) || d(field.getType(), z9)) {
            return true;
        }
        List list = z9 ? this.f45664e : this.f45665f;
        if (list.isEmpty()) {
            return false;
        }
        new com.google.gson.a(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        w.a(it.next());
        throw null;
    }
}
