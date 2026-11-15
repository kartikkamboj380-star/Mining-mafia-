package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class B0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f15310d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f15311a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseBooleanArray f15312b = new SparseBooleanArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f15313c = new b();

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Thread f15314a;

        public b() {
        }

        public final void a() {
            Thread threadCurrentThread = Thread.currentThread();
            if (this.f15314a == null) {
                this.f15314a = threadCurrentThread;
            }
            p004a3.a.a(Intrinsics.b(this.f15314a, threadCurrentThread));
        }
    }

    static {
        p064g3.b.a("ShadowNodeRegistry", p064g3.a.ERROR);
    }

    public final void a(InterfaceC1381s0 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f15313c.a();
        this.f15311a.put(node.M(), node);
    }

    public final void b(InterfaceC1381s0 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.f15313c.a();
        int iM = node.M();
        this.f15311a.put(iM, node);
        this.f15312b.put(iM, true);
    }

    public final InterfaceC1381s0 c(int i10) {
        this.f15313c.a();
        return (InterfaceC1381s0) this.f15311a.get(i10);
    }

    public final int d() {
        this.f15313c.a();
        return this.f15312b.size();
    }

    public final int e(int i10) {
        this.f15313c.a();
        return this.f15312b.keyAt(i10);
    }

    public final boolean f(int i10) {
        this.f15313c.a();
        return this.f15312b.get(i10);
    }

    public final void g(int i10) {
        this.f15313c.a();
        if (!this.f15312b.get(i10)) {
            this.f15311a.remove(i10);
            return;
        }
        throw new P("Trying to remove root node " + i10 + " without using removeRootNode!");
    }

    public final void h(int i10) {
        this.f15313c.a();
        if (i10 == -1) {
            return;
        }
        if (this.f15312b.get(i10)) {
            this.f15311a.remove(i10);
            this.f15312b.delete(i10);
        } else {
            throw new P("View with tag " + i10 + " is not registered as a root view");
        }
    }
}
