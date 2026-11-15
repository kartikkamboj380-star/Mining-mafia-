package com.facebook.react.module.model;

import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ReactModuleInfo {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f14874g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f14877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f14878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f14879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f14880f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Class clazz) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            return TurboModule.class.isAssignableFrom(clazz);
        }

        private a() {
        }
    }

    public ReactModuleInfo(String name, String className, boolean z9, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(className, "className");
        this.f14875a = name;
        this.f14876b = className;
        this.f14877c = z9;
        this.f14878d = z10;
        this.f14879e = z11;
        this.f14880f = z12;
    }

    public final boolean a() {
        return this.f14877c;
    }

    public final String b() {
        return this.f14876b;
    }

    public final boolean c() {
        return this.f14879e;
    }

    public final boolean d() {
        return this.f14880f;
    }

    public final String e() {
        return this.f14875a;
    }

    public final boolean f() {
        return this.f14878d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactModuleInfo(String name, String className, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this(name, className, z9, z10, z12, z13);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(className, "className");
    }
}
