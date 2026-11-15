package com.facebook.react.fabric;

import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata
public class SurfaceHandlerBinding extends HybridClassBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f14826a = new a(null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        b.a();
    }

    public SurfaceHandlerBinding(String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        initHybrid(0, moduleName);
    }

    private final native String _getModuleName();

    private final native int _getSurfaceId();

    private final native boolean _isRunning();

    private final native void initHybrid(int i10, String str);

    private final native void setDisplayMode(int i10);

    private final native void setLayoutConstraintsNative(float f10, float f11, float f12, float f13, float f14, float f15, boolean z9, boolean z10, float f16, float f17);

    public final String b() {
        return _getModuleName();
    }

    public final int e() {
        return _getSurfaceId();
    }

    public final boolean g() {
        return _isRunning();
    }

    public final void i(int i10, int i11, int i12, int i13, boolean z9, boolean z10, float f10, float f11) {
        p154p3.a.C0514a c0514a = p154p3.a.f47792a;
        setLayoutConstraintsNative(c0514a.b(i10) / f10, c0514a.a(i10) / f10, c0514a.b(i11) / f10, c0514a.a(i11) / f10, i12 / f10, i13 / f10, z9, z10, f10, f11);
    }

    public final void j(boolean z9) {
        setDisplayMode(!z9 ? 1 : 0);
    }

    public final native void setProps(@Nullable NativeMap nativeMap);
}
