package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O f14378a = new O();

    public static final class a implements Iterable, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f14379a;

        public a(List list) {
            this.f14379a = list;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f14379a);
        }
    }

    public static final class b implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f14381b;

        b(List list) {
            this.f14381b = list;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ModuleHolder next() {
            List list = this.f14381b;
            int i10 = this.f14380a;
            this.f14380a = i10 + 1;
            return new ModuleHolder((NativeModule) list.get(i10));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14380a < this.f14381b.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private O() {
    }

    public final Iterable a(N reactPackage, ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactPackage, "reactPackage");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        Z1.a.b("ReactNative", reactPackage.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        return new a(reactPackage.createNativeModules(reactApplicationContext));
    }
}
