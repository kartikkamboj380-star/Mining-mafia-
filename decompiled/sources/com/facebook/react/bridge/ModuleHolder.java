package com.facebook.react.bridge;

import com.facebook.react.module.model.ReactModuleInfo;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
@p024c3.a
@Metadata
public final class ModuleHolder {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final AtomicInteger instanceKeyCounter = new AtomicInteger(1);
    private boolean initializable;
    private final int instanceKey;

    @Nullable
    private NativeModule internalModule;
    private boolean isCreating;
    private boolean isInitializing;

    @NotNull
    private final String name;

    @Nullable
    private Provider provider;

    @NotNull
    private final ReactModuleInfo reactModuleInfo;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ModuleHolder(@NotNull ReactModuleInfo moduleInfo, @NotNull Provider provider) {
        Intrinsics.checkNotNullParameter(moduleInfo, "moduleInfo");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.instanceKey = instanceKeyCounter.getAndIncrement();
        this.name = moduleInfo.e();
        this.provider = provider;
        this.reactModuleInfo = moduleInfo;
        if (moduleInfo.f()) {
            this.internalModule = create();
        }
    }

    private final NativeModule create() {
        boolean z9 = false;
        SoftAssertions.assertCondition(this.internalModule == null, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.name, this.instanceKey);
        p065g4.b.a(0L, "ModuleHolder.createModule").b(MediationMetaData.KEY_NAME, this.name).c();
        p103k2.c.a().c(p113l2.a.f46068f, "NativeModule init: %s", this.name);
        try {
            Provider provider = this.provider;
            if (provider == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object obj = provider.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            NativeModule nativeModule = (NativeModule) obj;
            this.provider = null;
            synchronized (this) {
                try {
                    this.internalModule = nativeModule;
                    if (this.initializable && !this.isInitializing) {
                        z9 = true;
                    }
                    Unit unit = Unit.f45918a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z9) {
                doInitialize(nativeModule);
            }
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END, this.name, this.instanceKey);
            p065g4.b.b(0L).c();
            return nativeModule;
        } catch (Throwable th2) {
            try {
                Z1.a.p("ReactNative", th2, "Failed to create NativeModule '%s'", this.name);
                throw th2;
            } catch (Throwable th3) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END, this.name, this.instanceKey);
                p065g4.b.b(0L).c();
                throw th3;
            }
        }
    }

    private final void doInitialize(NativeModule nativeModule) {
        boolean z9;
        p065g4.b.a(0L, "ModuleHolder.initialize").b(MediationMetaData.KEY_NAME, this.name).c();
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.name, this.instanceKey);
        try {
            synchronized (this) {
                try {
                    if (!this.initializable || this.isInitializing) {
                        z9 = false;
                    } else {
                        z9 = true;
                        this.isInitializing = true;
                    }
                    Unit unit = Unit.f45918a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z9) {
                if (nativeModule != null) {
                    nativeModule.initialize();
                }
                synchronized (this) {
                    this.isInitializing = false;
                }
            }
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.name, this.instanceKey);
            p065g4.b.b(0L).c();
        } catch (Throwable th2) {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.name, this.instanceKey);
            p065g4.b.b(0L).c();
            throw th2;
        }
    }

    public final synchronized void destroy() {
        NativeModule nativeModule = this.internalModule;
        if (nativeModule != null) {
            nativeModule.invalidate();
        }
    }

    public final boolean getCanOverrideExistingModule() {
        return this.reactModuleInfo.a();
    }

    @NotNull
    public final String getClassName() {
        return this.reactModuleInfo.b();
    }

    @p024c3.a
    @NotNull
    public final NativeModule getModule() {
        boolean z9;
        NativeModule nativeModule;
        synchronized (this) {
            try {
                NativeModule nativeModule2 = this.internalModule;
                if (nativeModule2 != null) {
                    return nativeModule2;
                }
                if (this.isCreating) {
                    z9 = false;
                } else {
                    z9 = true;
                    this.isCreating = true;
                }
                Unit unit = Unit.f45918a;
                if (z9) {
                    NativeModule nativeModuleCreate = create();
                    synchronized (this) {
                        this.isCreating = false;
                        Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
                        notifyAll();
                    }
                    return nativeModuleCreate;
                }
                synchronized (this) {
                    while (true) {
                        nativeModule = this.internalModule;
                        if (nativeModule != null || !this.isCreating) {
                            break;
                        }
                        try {
                            Intrinsics.d(this, "null cannot be cast to non-null type java.lang.Object");
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (nativeModule == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                return nativeModule;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @p024c3.a
    @NotNull
    public final String getName() {
        return this.name;
    }

    public final synchronized boolean hasInstance$ReactAndroid_release() {
        return this.internalModule != null;
    }

    public final boolean isCxxModule() {
        return this.reactModuleInfo.c();
    }

    public final boolean isTurboModule() {
        return this.reactModuleInfo.d();
    }

    public final void markInitializable$ReactAndroid_release() {
        boolean z9;
        NativeModule nativeModule;
        synchronized (this) {
            z9 = true;
            try {
                this.initializable = true;
                nativeModule = this.internalModule;
                if (nativeModule == null) {
                    z9 = false;
                    nativeModule = null;
                } else if (this.isInitializing) {
                    throw new IllegalStateException("Check failed.");
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            if (nativeModule == null) {
                throw new IllegalStateException("Required value was null.");
            }
            doInitialize(nativeModule);
        }
    }

    public ModuleHolder(@NotNull NativeModule nativeModule) {
        Intrinsics.checkNotNullParameter(nativeModule, "nativeModule");
        this.instanceKey = instanceKeyCounter.getAndIncrement();
        String name = nativeModule.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        this.name = name;
        String name2 = nativeModule.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        String simpleName = nativeModule.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.reactModuleInfo = new ReactModuleInfo(name2, simpleName, nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()), ReactModuleInfo.f14874g.a(nativeModule.getClass()));
        this.internalModule = nativeModule;
        p103k2.c.a().c(p113l2.a.f46068f, "NativeModule init: %s", name);
    }
}
