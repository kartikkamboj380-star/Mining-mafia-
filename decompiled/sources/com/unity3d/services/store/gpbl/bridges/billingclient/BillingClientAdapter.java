package com.unity3d.services.store.gpbl.bridges.billingclient;

import L8.M;
import L8.x;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public abstract class BillingClientAdapter {

    @NotNull
    private final x _isInitialized = M.a(Boolean.FALSE);

    @NotNull
    public abstract String getAdapterVersion();

    @NotNull
    public final x get_isInitialized$unity_ads_defaultRelease() {
        return this._isInitialized;
    }

    public abstract void initialize(@NotNull BillingInitializationListener billingInitializationListener);

    @Nullable
    public abstract BillingResultResponseCode isFeatureSupported(@Nullable String str);

    public final boolean isInitialized() {
        return ((Boolean) this._isInitialized.getValue()).booleanValue();
    }

    public abstract boolean isReady();

    public abstract void queryProductDetailsAsync(@NotNull String str, @NotNull String str2, @NotNull ProductDetailsListener productDetailsListener);

    public abstract void queryPurchasesAsync(@Nullable String str, @Nullable PurchasesResponseListener purchasesResponseListener);

    public abstract void startConnection(@Nullable BillingClientStateListener billingClientStateListener);
}
