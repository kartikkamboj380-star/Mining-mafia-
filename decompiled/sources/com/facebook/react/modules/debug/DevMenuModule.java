package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeDevMenuSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.Metadata;
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
    */
/* JADX INFO: loaded from: classes.dex */
@p234x3.a(name = "DevMenu")
@Metadata
public final class DevMenuModule extends NativeDevMenuSpec {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String NAME = "DevMenu";

    @NotNull
    private final p124m3.e devSupportManager;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevMenuModule(@Nullable ReactApplicationContext reactApplicationContext, @NotNull p124m3.e devSupportManager) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.devSupportManager = devSupportManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reload$lambda$0(DevMenuModule devMenuModule) {
        devMenuModule.devSupportManager.x();
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void reload() {
        if (this.devSupportManager.m()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.a
                @Override // java.lang.Runnable
                public final void run() {
                    DevMenuModule.reload$lambda$0(this.f14932a);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void setHotLoadingEnabled(boolean z9) {
        this.devSupportManager.b(z9);
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void setProfilingEnabled(boolean z9) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevMenuSpec
    public void show() {
        if (this.devSupportManager.m()) {
            this.devSupportManager.B();
        }
    }
}
