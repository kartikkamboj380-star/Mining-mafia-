package p057f6;

import D6.c;
import G6.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class F implements InterfaceC6983d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f43667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f43668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f43669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f43670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f43671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f43672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC6983d f43673g;

    private static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f43674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f43675b;

        public a(Set set, c cVar) {
            this.f43674a = set;
            this.f43675b = cVar;
        }

        @Override // D6.c
        public void b(D6.a aVar) {
            if (!this.f43674a.contains(aVar.b())) {
                throw new s(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.f43675b.b(aVar);
        }
    }

    F(C6982c c6982c, InterfaceC6983d interfaceC6983d) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : c6982c.g()) {
            if (qVar.e()) {
                if (qVar.g()) {
                    hashSet4.add(qVar.c());
                } else {
                    hashSet.add(qVar.c());
                }
            } else if (qVar.d()) {
                hashSet3.add(qVar.c());
            } else if (qVar.g()) {
                hashSet5.add(qVar.c());
            } else {
                hashSet2.add(qVar.c());
            }
        }
        if (!c6982c.k().isEmpty()) {
            hashSet.add(E.b(c.class));
        }
        this.f43667a = Collections.unmodifiableSet(hashSet);
        this.f43668b = Collections.unmodifiableSet(hashSet2);
        this.f43669c = Collections.unmodifiableSet(hashSet3);
        this.f43670d = Collections.unmodifiableSet(hashSet4);
        this.f43671e = Collections.unmodifiableSet(hashSet5);
        this.f43672f = c6982c.k();
        this.f43673g = interfaceC6983d;
    }

    @Override // p057f6.InterfaceC6983d
    public Object a(Class cls) {
        if (!this.f43667a.contains(E.b(cls))) {
            throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objA = this.f43673g.a(cls);
        return !cls.equals(c.class) ? objA : new a(this.f43672f, (c) objA);
    }

    @Override // p057f6.InterfaceC6983d
    public G6.a b(E e10) {
        if (this.f43669c.contains(e10)) {
            return this.f43673g.b(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Deferred<%s>.", e10));
    }

    @Override // p057f6.InterfaceC6983d
    public b d(E e10) {
        if (this.f43671e.contains(e10)) {
            return this.f43673g.d(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", e10));
    }

    @Override // p057f6.InterfaceC6983d
    public Object e(E e10) {
        if (this.f43667a.contains(e10)) {
            return this.f43673g.e(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", e10));
    }

    @Override // p057f6.InterfaceC6983d
    public b f(Class cls) {
        return g(E.b(cls));
    }

    @Override // p057f6.InterfaceC6983d
    public b g(E e10) {
        if (this.f43668b.contains(e10)) {
            return this.f43673g.g(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", e10));
    }

    @Override // p057f6.InterfaceC6983d
    public Set h(E e10) {
        if (this.f43670d.contains(e10)) {
            return this.f43673g.h(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", e10));
    }

    @Override // p057f6.InterfaceC6983d
    public G6.a i(Class cls) {
        return b(E.b(cls));
    }
}
