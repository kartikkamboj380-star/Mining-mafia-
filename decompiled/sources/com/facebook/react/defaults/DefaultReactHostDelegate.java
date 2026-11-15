package com.facebook.react.defaults;

import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.T;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.InterfaceC1323g;
import com.facebook.react.runtime.JSRuntimeFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Metadata
public final class DefaultReactHostDelegate implements InterfaceC1323g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSBundleLoader f14563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f14564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSRuntimeFactory f14565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BindingsInstaller f14566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Function1 f14567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final T.a f14568g;

    public DefaultReactHostDelegate(String jsMainModulePath, JSBundleLoader jsBundleLoader, List reactPackages, JSRuntimeFactory jsRuntimeFactory, BindingsInstaller bindingsInstaller, Function1 exceptionHandler, T.a turboModuleManagerDelegateBuilder) {
        Intrinsics.checkNotNullParameter(jsMainModulePath, "jsMainModulePath");
        Intrinsics.checkNotNullParameter(jsBundleLoader, "jsBundleLoader");
        Intrinsics.checkNotNullParameter(reactPackages, "reactPackages");
        Intrinsics.checkNotNullParameter(jsRuntimeFactory, "jsRuntimeFactory");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        Intrinsics.checkNotNullParameter(turboModuleManagerDelegateBuilder, "turboModuleManagerDelegateBuilder");
        this.f14562a = jsMainModulePath;
        this.f14563b = jsBundleLoader;
        this.f14564c = reactPackages;
        this.f14565d = jsRuntimeFactory;
        this.f14566e = bindingsInstaller;
        this.f14567f = exceptionHandler;
        this.f14568g = turboModuleManagerDelegateBuilder;
    }

    @Override // com.facebook.react.runtime.InterfaceC1323g
    public JSRuntimeFactory a() {
        return this.f14565d;
    }

    @Override // com.facebook.react.runtime.InterfaceC1323g
    public JSBundleLoader b() {
        return this.f14563b;
    }

    @Override // com.facebook.react.runtime.InterfaceC1323g
    public String c() {
        return this.f14562a;
    }

    @Override // com.facebook.react.runtime.InterfaceC1323g
    public List d() {
        return this.f14564c;
    }

    @Override // com.facebook.react.runtime.InterfaceC1323g
    public void e(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f14567f.invoke(error);
    }

    @Override // com.facebook.react.runtime.InterfaceC1323g
    public T.a f() {
        return this.f14568g;
    }

    @Override // com.facebook.react.runtime.InterfaceC1323g
    public BindingsInstaller getBindingsInstaller() {
        return this.f14566e;
    }
}
