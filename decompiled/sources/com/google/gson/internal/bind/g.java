package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends p138n7.c {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final Writer f40804I = new a();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final com.google.gson.l f40805J = new com.google.gson.l("closed");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private String f40806G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private com.google.gson.g f40807H;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List f40808w;

    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public g() {
        super(f40804I);
        this.f40808w = new ArrayList();
        this.f40807H = com.google.gson.i.f40782a;
    }

    private com.google.gson.g t1() {
        List list = this.f40808w;
        return (com.google.gson.g) list.get(list.size() - 1);
    }

    private void u1(com.google.gson.g gVar) {
        if (this.f40806G != null) {
            if (!gVar.g() || G()) {
                ((com.google.gson.j) t1()).k(this.f40806G, gVar);
            }
            this.f40806G = null;
            return;
        }
        if (this.f40808w.isEmpty()) {
            this.f40807H = gVar;
            return;
        }
        com.google.gson.g gVarT1 = t1();
        if (!(gVarT1 instanceof com.google.gson.f)) {
            throw new IllegalStateException();
        }
        ((com.google.gson.f) gVarT1).k(gVar);
    }

    @Override // p138n7.c
    public p138n7.c Q(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f40808w.isEmpty() || this.f40806G != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(t1() instanceof com.google.gson.j)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f40806G = str;
        return this;
    }

    @Override // p138n7.c
    public p138n7.c S() {
        u1(com.google.gson.i.f40782a);
        return this;
    }

    @Override // p138n7.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f40808w.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f40808w.add(f40805J);
    }

    @Override // p138n7.c, java.io.Flushable
    public void flush() {
    }

    @Override // p138n7.c
    public p138n7.c j() {
        com.google.gson.f fVar = new com.google.gson.f();
        u1(fVar);
        this.f40808w.add(fVar);
        return this;
    }

    @Override // p138n7.c
    public p138n7.c l1(double d10) {
        if (N() || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            u1(new com.google.gson.l(Double.valueOf(d10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    @Override // p138n7.c
    public p138n7.c m1(long j10) {
        u1(new com.google.gson.l(Long.valueOf(j10)));
        return this;
    }

    @Override // p138n7.c
    public p138n7.c n() {
        com.google.gson.j jVar = new com.google.gson.j();
        u1(jVar);
        this.f40808w.add(jVar);
        return this;
    }

    @Override // p138n7.c
    public p138n7.c n1(Boolean bool) {
        if (bool == null) {
            return S();
        }
        u1(new com.google.gson.l(bool));
        return this;
    }

    @Override // p138n7.c
    public p138n7.c o1(Number number) {
        if (number == null) {
            return S();
        }
        if (!N()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        u1(new com.google.gson.l(number));
        return this;
    }

    @Override // p138n7.c
    public p138n7.c p1(String str) {
        if (str == null) {
            return S();
        }
        u1(new com.google.gson.l(str));
        return this;
    }

    @Override // p138n7.c
    public p138n7.c q1(boolean z9) {
        u1(new com.google.gson.l(Boolean.valueOf(z9)));
        return this;
    }

    public com.google.gson.g s1() {
        if (this.f40808w.isEmpty()) {
            return this.f40807H;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f40808w);
    }

    @Override // p138n7.c
    public p138n7.c w() {
        if (this.f40808w.isEmpty() || this.f40806G != null) {
            throw new IllegalStateException();
        }
        if (!(t1() instanceof com.google.gson.f)) {
            throw new IllegalStateException();
        }
        List list = this.f40808w;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // p138n7.c
    public p138n7.c x() {
        if (this.f40808w.isEmpty() || this.f40806G != null) {
            throw new IllegalStateException();
        }
        if (!(t1() instanceof com.google.gson.j)) {
            throw new IllegalStateException();
        }
        List list = this.f40808w;
        list.remove(list.size() - 1);
        return this;
    }
}
