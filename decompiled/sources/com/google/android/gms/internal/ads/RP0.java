package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RP0 implements Iterator, Closeable, InterfaceC4199l9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final InterfaceC4073k9 f22799g = new QP0("eof ");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected InterfaceC3697h9 f22800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected SP0 f22801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    InterfaceC4073k9 f22802c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f22803d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f22804e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f22805f = new ArrayList();

    static {
        YP0.b(RP0.class);
    }

    public final List c() {
        return (this.f22801b == null || this.f22802c == f22799g) ? this.f22805f : new XP0(this.f22805f, this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void h(SP0 sp0, long j10, InterfaceC3697h9 interfaceC3697h9) {
        this.f22801b = sp0;
        this.f22803d = sp0.zzc();
        sp0.f(sp0.zzc() + j10);
        this.f22804e = sp0.zzc();
        this.f22800a = interfaceC3697h9;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        InterfaceC4073k9 interfaceC4073k9 = this.f22802c;
        if (interfaceC4073k9 == f22799g) {
            return false;
        }
        if (interfaceC4073k9 != null) {
            return true;
        }
        try {
            this.f22802c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f22802c = f22799g;
            return false;
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final InterfaceC4073k9 next() {
        InterfaceC4073k9 interfaceC4073k9A;
        InterfaceC4073k9 interfaceC4073k9 = this.f22802c;
        if (interfaceC4073k9 != null && interfaceC4073k9 != f22799g) {
            this.f22802c = null;
            return interfaceC4073k9;
        }
        SP0 sp0 = this.f22801b;
        if (sp0 == null || this.f22803d >= this.f22804e) {
            this.f22802c = f22799g;
            throw new NoSuchElementException();
        }
        try {
            synchronized (sp0) {
                this.f22801b.f(this.f22803d);
                interfaceC4073k9A = this.f22800a.a(this.f22801b, this);
                this.f22803d = this.f22801b.zzc();
            }
            return interfaceC4073k9A;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i10 = 0;
        while (true) {
            List list = this.f22805f;
            if (i10 >= list.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i10 > 0) {
                sb.append(";");
            }
            sb.append(((InterfaceC4073k9) list.get(i10)).toString());
            i10++;
        }
    }
}
