package com.facebook.react.runtime;

import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.runtime.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1317a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f15212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f15213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile b f15214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile String f15215d;

    /* JADX INFO: renamed from: com.facebook.react.runtime.a$a, reason: collision with other inner class name */
    public interface InterfaceC0344a {
        Object get();
    }

    /* JADX INFO: renamed from: com.facebook.react.runtime.a$b */
    public enum b {
        Init,
        Creating,
        Success,
        Failure;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f15221f = p189s8.a.a(c());
    }

    public C1317a(Object obj) {
        this.f15212a = obj;
        this.f15213b = this.f15212a;
        this.f15214c = b.Init;
        this.f15215d = "";
    }

    public final synchronized Object a() {
        Object obj;
        obj = this.f15212a;
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return obj;
    }

    public final synchronized Object b() {
        Object objA;
        objA = a();
        e();
        return objA;
    }

    public final synchronized Object c() {
        return this.f15212a;
    }

    public final Object d(InterfaceC0344a provider) {
        boolean z9;
        Object objA;
        Object objA2;
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (this) {
            b bVar = this.f15214c;
            b bVar2 = b.Success;
            if (bVar == bVar2) {
                return a();
            }
            if (this.f15214c == b.Failure) {
                throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.f15215d);
            }
            b bVar3 = this.f15214c;
            b bVar4 = b.Creating;
            boolean z10 = false;
            if (bVar3 != bVar4) {
                this.f15214c = bVar4;
                z9 = true;
            } else {
                z9 = false;
            }
            Unit unit = Unit.f45918a;
            if (z9) {
                try {
                    this.f15212a = provider.get();
                    synchronized (this) {
                        this.f15214c = bVar2;
                        Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
                        notifyAll();
                        objA = a();
                    }
                    return objA;
                } catch (RuntimeException e10) {
                    synchronized (this) {
                        this.f15214c = b.Failure;
                        this.f15215d = String.valueOf(e10.getMessage());
                        Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
                        notifyAll();
                        Unit unit2 = Unit.f45918a;
                        throw new RuntimeException("BridgelessAtomicRef: Failed to create object.", e10);
                    }
                }
            }
            synchronized (this) {
                while (this.f15214c == b.Creating) {
                    try {
                        Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                if (this.f15214c == b.Failure) {
                    throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.f15215d);
                }
                objA2 = a();
            }
            return objA2;
        }
    }

    public final synchronized void e() {
        this.f15212a = this.f15213b;
        this.f15214c = b.Init;
        this.f15215d = "";
    }

    public /* synthetic */ C1317a(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj);
    }
}
