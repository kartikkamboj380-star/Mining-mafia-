package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata
public final class HermesExecutor extends JavaScriptExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f13930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f13931b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @DoNotStrip
        private final HybridData initHybrid(boolean z9, String str, long j10) {
            return HermesExecutor.initHybrid(z9, str, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @DoNotStrip
        public final HybridData initHybridDefaultConfig(boolean z9, String str) {
            return HermesExecutor.initHybridDefaultConfig(z9, str);
        }

        public final void b() {
            if (HermesExecutor.f13931b == null) {
                SoLoader.t("hermes");
                SoLoader.t("hermes_executor");
                HermesExecutor.f13931b = p084i3.a.f45066b ? "Debug" : "Release";
            }
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f13930a = aVar;
        aVar.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HermesExecutor(boolean z9, String debuggerName) {
        super(f13930a.initHybridDefaultConfig(z9, debuggerName));
        Intrinsics.checkNotNullParameter(debuggerName, "debuggerName");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @DoNotStrip
    public static final native HybridData initHybrid(boolean z9, String str, long j10);

    /* JADX INFO: Access modifiers changed from: private */
    @DoNotStrip
    public static final native HybridData initHybridDefaultConfig(boolean z9, String str);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "HermesExecutor" + f13931b;
    }
}
