package com.appsflyer.internal;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
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
@Metadata
public final class AFb1sSDK {

    @NotNull
    private final AFh1sSDK getMonetizationNetwork;

    @Nullable
    private final byte[] getRevenue;

    public AFb1sSDK(@NotNull AFh1sSDK aFh1sSDK, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(aFh1sSDK, "");
        this.getMonetizationNetwork = aFh1sSDK;
        this.getRevenue = bArr;
    }

    public final void afInfoLog() throws Throwable {
        try {
            Map map = AFa1kSDK.f13253i;
            Object declaredConstructor = map.get(-496653013);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1kSDK.getMediationNetwork((char) (28155 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 35 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 87 - Color.argb(0, 0, 0, 0))).getDeclaredConstructor(null);
                map.put(-496653013, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(null);
            Object[] objArr = {this.getMonetizationNetwork, this.getRevenue};
            Object method = map.get(-40095608);
            if (method == null) {
                method = ((Class) AFa1kSDK.getMediationNetwork((char) (28155 - TextUtils.indexOf("", "", 0, 0)), 36 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 87 - (ViewConfiguration.getScrollBarSize() >> 8))).getMethod("getMonetizationNetwork", AFh1sSDK.class, byte[].class);
                map.put(-40095608, method);
            }
            ((Method) method).invoke(objNewInstance, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
